package com.example.demo.excel;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author qishisong
 * @since 2020/5/15 13:41
 */
@RestController
@RequestMapping("/file")
@Slf4j
public class FileController {

    @PostMapping("/import")
    public Boolean importFile(@RequestParam("file") MultipartFile file, @RequestParam("areaId") Long areaId){
        log.info(JSON.toJSONString(areaId));
        List<OverseaSpuExcelDomain> list = EasyExcelUtil.simpleRead(file, OverseaSpuExcelDomain.class);
        System.out.println(list.size());
        return true;
    }

    @GetMapping(value = "/download-template",name = "下载固定模板")
    public void downloadTemplate(HttpServletRequest request, HttpServletResponse response) {
        InputStream is= this.getClass().getResourceAsStream("/static/繁体商品导入模板.xlsx");
        byte[] fileData = EasyExcelUtil.input2byte(is);
        EasyExcelUtil.downloadFile(response, request, "繁体商品导入模板.xlsx", fileData);
    }

    @GetMapping(value = "download",name = "下载文件")
    public void download(HttpServletResponse response) throws Exception {
        EasyExcelUtil.download(response,"繁体商品导入模板",OverseaSpuExcelDomain.class,null);
    }
}
