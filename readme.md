# the project show resilience4j-circuit-breaker issue

## issue

the issue triggered when init application-context bean stage. <br/>

- when the main created bean (configuration or postConstruct class), the callable needs to create single bean.
- callable thread waiting the main thread release lock

## reproduce issue

first starting server application,then choosing `org.example.init` one or all method inject application-context starting
client application.
the log print `fallback is triggered.`.

- thread dump threads_report.txt

## env

- spring-boot 2.7.1
- spring-cloud 2021.0.3
- oracle-open-jdk 18.0.1