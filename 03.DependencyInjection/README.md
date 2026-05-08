# Junior DI Broken App

This is a small Java 21 Maven console application with an intentional dependency injection problem.

## Candidate task

Fix the application so it runs correctly.

Run with:

```bash
mvn clean compile
mvn exec:java
```

## Expected final output

```text
Welcome email sent to alice@email.com
Registered users:
Alice - alice@email.com
```

## Hint

One class depends on another class, but the dependency is not wired correctly.
