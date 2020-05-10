# Spring

![image](https://user-images.githubusercontent.com/41619898/71123109-48477b80-2225-11ea-8e91-d90884619800.png)

##### **스프링 프레임워크 (영어: Spring Framework)는 자바 플랫폼을 위한 오픈소스 애플리케이션 프레임워크로서 간단히 스프링(Spring)이라고도 한다.**

##### **동적인 웹 사이트를 개발하기 위한 여러 가지 서비스를 제공하고 있다.**

##### **대한민국 공공기관의 웹 서비스 개발 시 사용을 권장하고 있는 전자정부 표준프레임워크의 기반 기술로서 쓰이고 있다.**

<br/>

# Spring Boot

> Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".

https://spring.io/projects/spring-boot

'스프링 부트는 간단한 설정만으로도 빠르게 실행할 수 있다.'

- 임베디드 톰캣(Embed Tomcat), 제티, 언더토우를 사용하여 독립 실행이 가능한 스프링 애플리케이션 개발
- 통합 스타터를 제공하여 메이븐/그레이들 구성 간소화
- 스타터를 통한 자동화된 스프링 설정 제공
- 번거로운 XML 설정을 요구하지 않음
- JAR을 사용하여 자바 옵션만으로도 배포 가능
- 애플리케이션의 모니터링과 관리를 위한 스프링 액츄에이터(Spring Actuator) 제공

스프링 부트는 스프링 프레임워크라는 큰 틀에 속하는 도구로 "just run"에 가까워지도록 많은 설정을 간소화하기 위해 노력한 도구이다.

<br/>

### https://github.com/spring-projects/spring-boot/wiki

<br/>

### 장점

- 각각의 의존성 버전을 올리는 것이 좀 더 수월하다. 스프링 부트의 버전이 올라갈 때마다 각 버전 간의 호환성에 대해 충분한 테스트를 거치고 릴리스되기 때문에 기존에 하나씩 수동으로 설정했던 버전 관리에 비해 안정된 버전이 제공된다는 최소한의 보장을 얻을 수 있다.
- 특정 라이브러리에 버그가 있다 하더라도 스프링팀에서 버그픽스한 버전을 받기 편리하다.
- 간단한 어노테이션 설정이나 프로퍼티 설정으로 세부적인 설정 없이 원하는 기능을 빠르게 적용할 수 있다.
- 별도의 외장 톰캣을 설치할 필요가 없으며 위와 동일한 이유로 톰캣 버전도 더욱 편리하게 관리한다.

### 단점

- 설정을 개인화(커스터마이징)하면 버전을 올릴 때 기존 스프링 프레임워크를 사용하는 것과 동일한 불편함을 겪을 수 있다.
- 특정 설정을 개인화 혹은 설정 자체를 변경하고 싶다면 내부의 설정 코드를 살펴봐야 하는 불편함이 있을 수 있다.

<br/>

### Make Project

- Spring Initializr : https://start.spring.io/

<br/>

----

### VSCode Start Project

>- View > Command Pallatte (Ctrl + Shift + P)
>- Spring Initializr: Generate a Gradle Project
>- Java
>- Spring Web, Spring Boot DevTools

<br/>

```
> mvn clean
> mvn install
```