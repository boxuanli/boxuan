package com.springbbox.common.config;

/**
 * @param $
 * @author boxuan
 * @date $ $
 * @return $
 */
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="springbbox")
public class SpringBBoxConfig {
    //上传路径
    private String uploadPath;

    public String getUploadPath() {
        return uploadPath;
    }

    public void setUploadPath(String uploadPath) {
        this.uploadPath = uploadPath;
    }
}
