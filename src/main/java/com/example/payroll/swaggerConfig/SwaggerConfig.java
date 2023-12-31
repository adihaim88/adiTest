package com.example.payroll.swaggerConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(regex("/employee.*"))
                .apis(RequestHandlerSelectors.basePackage("com.example.payroll"))
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "PayrollApp",
                "An application to search Employee repository by Id",
                "PayrollApplication v1",
                "Terms of service",
                "adihai@gmail.com",
                "License of API",
                "https://swagger.io/docs/");
        return apiInfo;
    }

//    ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("Payroll  API")
//                .description("This is a REST API specification Payroll Configuration API")
//                .license("")
//                .licenseUrl("http://unlicense.org")
//                .termsOfServiceUrl("")
//                .contact(new Contact("","", ""))
//                .build();
//    }
//
//
//
//
//
//    @Bean
//    public Docket customImplementation(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.example.payroll"))
//                .build()
//                .directModelSubstitute(java.time.LocalDate.class, java.sql.Date.class)
//                .directModelSubstitute(java.time.OffsetDateTime.class, java.util.Date.class)
//                .apiInfo(apiInfo());
//    }




//        @Bean
//        public Docket postsApi() {
//            return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
//                    .apiInfo(apiInfo()).select().paths(postPaths()).build();
//        }
//
//        private Predicate<String> postPaths() {
//            return or(regex("/api/posts.*"), regex("/api/javainuse.*"));
//        }
//
//        private ApiInfo apiInfo() {
//            return new ApiInfoBuilder().title("JavaInUse API")
//                    .description("JavaInUse API reference for developers")
//                    .termsOfServiceUrl("http://javainuse.com")
//                    .license("")
//                    .licenseUrl("http://unlicense.org")
//                    .version("1.0").build();
//        }

}

