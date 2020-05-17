# Getting Started

A minimal Spring Boot demo project with Unit Tests and Code Coverage support and references to learn more.

### Steps Followed ###
* Generate project skeleton at https://start.spring.io/ , "Spring Web" dependency added.
* Import in Eclipse as Gradle project
* Add Controller
* Add Unit Tests
* Add JaCoCo to build.gradle
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
  * git remote add origin https://github.com/jbarciela/rest-demo.git
  * git push origin master

### Running with Gradle
```bash
project-root> ./gradlew bootRun
```
### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/gradle-plugin/reference/html/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

### Additional Links
These additional references should also help you:

* [Markdown Github Syntax](https://guides.github.com/pdfs/markdown-cheatsheet-online.pdf)
* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)
* https://spring.io/guides/gs/spring-boot/
* https://spring.io/guides/gs/testing-web/
* https://adityasridhar.com/posts/how-to-create-simple-rest-apis-with-springboot
* https://docs.gradle.org/current/userguide/jacoco_plugin.html
* https://medium.com/@alexprut/integrate-jacoco-in-a-java-project-687d8d9678dc
* https://www.baeldung.com/jacoco
* https://reflectoring.io/jacoco/
