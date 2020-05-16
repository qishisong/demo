package com.example.demo.excel;

import com.alibaba.excel.EasyExcel;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;
import java.util.Objects;

/**
 * <p>
 *
 * </p>
 *
 * @author qishisong
 * @since 2020/5/15 15:13
 */
@Slf4j
public class EasyExcelUtil {

    public static <T> List<T> simpleRead(MultipartFile file, Class clazz) {
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        DataParseListener<T> listener = new DataParseListener();
        try(InputStream in = file.getInputStream()){
            EasyExcel.read(in, clazz, listener).sheet().doRead();
        }catch (IOException e){
           log.error("解析excel文件异常");
           return null;
        }
        return listener.getResult();
    }

    public static void download(HttpServletResponse response, String fileName, Class clazz, List data) throws Exception{
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        // 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
        fileName = URLEncoder.encode(fileName, "UTF-8");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");
        EasyExcel.write(response.getOutputStream(), clazz).sheet("模板").doWrite(data);
    }

    /**
     * inputstream转Byte[]
     * @param inStream
     * @return
     * @throws IOException
     */
    public static  byte[] input2byte(InputStream inStream) {
        ByteArrayOutputStream swapStream = new ByteArrayOutputStream();
        byte[] buff = new byte[1000];
        int rc = 0;
        try {
            while ((rc = inStream.read(buff, 0, 1000)) > 0) {
                swapStream.write(buff, 0, rc);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        byte[] in2b = swapStream.toByteArray();
        return in2b;
    }

    /**
     * 下载
     * @param response
     * @param request
     * @param filename
     * @param fileData
     * @return
     */
    public static boolean downloadFile(HttpServletResponse response,
                                       HttpServletRequest request, String filename, byte[] fileData) {
        try {
            OutputStream myout = null;
            // 检查时候获取到数据
            if (fileData == null) {
                response.sendError(404);
                return false;
            }
            try {
                if(request.getHeader("User-Agent").toUpperCase().indexOf("MSIE") > 0) {
                    filename = new String(filename.getBytes("GBK"),"iso-8859-1");
                }else{
                    filename = URLEncoder.encode(filename, "utf-8");
                }
                response.setContentType("multipart/form-data;charset=utf-8");
                response.setHeader("content-disposition","attachment;filename="+filename);
                // 写明要下载的文件的大小
                response.setContentLength(fileData.length);
                // 从response对象中得到输出流,准备下载
                myout = response.getOutputStream();
                myout.write(fileData);
                myout.flush();
            } catch (Exception e) {
            } finally {
                if (myout != null) {
                    try {
                        myout.close();
                    } catch (Exception e) {
                    }
                }
            }
        } catch (IOException e) {
            return false;
        }
        return true;
    }

}
