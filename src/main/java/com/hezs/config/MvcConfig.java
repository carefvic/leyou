package com.hezs.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ProjectName: leyou
 * @Package: com.hezs.config
 * @Description: 扩展springmvc配置
 * @Author: hezs
 * @CreateDate: 2019-7-14 21:07
 * @Version: 1.0
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {
    /**
     * @author      hezs
     * @Description 添加视图映射
     * @param registry
     * @date        2019-7-14 21:30
     * @version     1.0
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

    }
}
