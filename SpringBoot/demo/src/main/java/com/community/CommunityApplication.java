package com.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController /* @Controller와 @ResponseBody를 합쳐놓은 역할을 수행
어노테이션을 사용하면 스프링은 반환값이 Response Body 부분에 자동으로 바인딩된다.
스프링에서 RESTful 웹 서비스를 만들 때 주로 사용한다. */
@SpringBootApplication
public class CommunityApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommunityApplication.class, args);
    }

    @GetMapping // Get 방식으로 경로를 받는 매핑 어노테이션이다.
    public String HelloWorld(){
        return "Hello World";
    }
}
