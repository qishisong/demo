package com.example.demo.request;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

/**
 * <p>
 *
 * </p>
 *
 * @author qishisong
 * @since 2020/5/15 13:44
 */
@Data
public class OverseaFileRequest {
    private Long areId;

    private String language;

    private MultipartFile file;
}
