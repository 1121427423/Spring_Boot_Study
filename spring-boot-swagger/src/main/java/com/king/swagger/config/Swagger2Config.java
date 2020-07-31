package com.king.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * @author king
 * @Title:
 * @Package
 * @Description:
 * @date 2020/7/3121:02
 */

@Configuration
public class Swagger2Config extends WebMvcConfigurationSupport {
    /**
     * 4.4 Swagger2注解
     *
     * @return
     * @Api 修饰整个类，描述Controller的作用
     * @ApiOperation 描述一个类的一个方法，或者说一个接口
     * @ApiParam 单个参数描述
     * @ApiModel 用对象来接收参数
     * @ApiProperty 用对象接收参数时，描述对象的一个字段
     * @ApiResponse HTTP响应其中1个描述
     * @ApiResponses HTTP响应整体描述
     * @ApiIgnore 使用该注解忽略这个API
     * @ApiError 发生错误返回的信息
     * @ApiImplicitParam 一个请求参数
     * @ApiImplicitParams 多个请求参数
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.king.swagger.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("springboot利用swagger构建api文档")
                .description("msig‐swagger2整合测试用例")
                .termsOfServiceUrl("http://www.baidu.com")
                .version("1.0")
                .build();
    }


    /**
     * 解决swagger-ui.html 404无法访问的问题
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //注册 swagger 相关页面
        registry.addResourceHandler("/swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

}
