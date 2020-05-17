# Getting Started

A Spring Boot REST demo project with Unit Tests, Code Coverage, Actuator, Security, JavaDoc and references to learn more.

### Steps Followed ###
* Generate project skeleton at https://start.spring.io/ , "Spring Web" dependency added.
* Import in Eclipse as Gradle project
* Add Controller
* Add Unit Tests
* Add JaCoCo to build.gradle (for code coverage)
* Add git
  * Edit "~/.gitconfig" with correct name and email
  * https://git-scm.com/docs/gittutorial
  * git init
  * git add .
  * git status
  * git commit -m "initial commit"
  * git status
  * git log
* Add github
  * git remote add origin https://github.com/$YOUR_USERNAME/rest-demo.git
  * git push origin master
* Add spring-boot-starter-actuator and spring-boot-starter-security dependencies
* Add actuator and security config to application.properties
* Add SecurityConfiguration and DetailsEndpoint
* Add javadoc generation to build.gradle

### Running with Gradle
```bash
project-root> ./gradlew bootRun
```
### Reference Documentation and guides

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/gradle-plugin/reference/html/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Markdown Github Syntax](https://guides.github.com/pdfs/markdown-cheatsheet-online.pdf)
* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)
* [Building an Application with Spring Boot](https://spring.io/guides/gs/spring-boot/)
* [Testing the Web Layer](https://spring.io/guides/gs/testing-web/)
* [How to create simple rest apis with springboot](https://adityasridhar.com/posts/how-to-create-simple-rest-apis-with-springboot)
* [The JaCoCo Plugin](https://docs.gradle.org/current/userguide/jacoco_plugin.html)
* [Integrate JaCoCo in a Java project](https://medium.com/@alexprut/integrate-jacoco-in-a-java-project-687d8d9678dc)
* [Intro to JaCoCo](https://www.baeldung.com/jacoco)
* [Definitive Guide to the JaCoCo Gradle Plugin](https://reflectoring.io/jacoco/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Monitoring with Spring Boot Actuator](https://stackabuse.com/monitoring-with-spring-boot-actuator/)
* [Introduction to Javadoc](https://www.baeldung.com/javadoc)
* [A Guide to CSRF Protection in Spring Security](https://www.baeldung.com/spring-security-csrf)
