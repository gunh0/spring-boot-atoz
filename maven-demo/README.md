# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.7-SNAPSHOT/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.7-SNAPSHOT/maven-plugin/reference/html/#build-image)

<br/>

### API List

- `/user`
- `/board`
- `/api/welcome`

<br/>

### Details

HandlerInterceptor Demo Project

- `package com.example.demo.Interceptor`

```
INFO 8374 --- [nio-8080-exec-1] c.e.demo.Interceptor.HttpInterceptor     : [preHandle]
INFO 8374 --- [nio-8080-exec-1] c.e.demo.controller.HelloController      : welcome
INFO 8374 --- [nio-8080-exec-1] c.e.demo.Interceptor.HttpInterceptor     : [postHandle]
INFO 8374 --- [nio-8080-exec-1] c.e.demo.Interceptor.HttpInterceptor     : [afterCompletion]
```

