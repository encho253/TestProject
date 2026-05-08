# Junior Java Tasks

You have three small Java 21 Maven console projects.

Before starting, make sure Java 21 and Maven are installed:

```bash
java -version
mvn -version
```

---

# Task 1: Implement FizzBuzz

## Project

```text
01.fizzbuzz
```

## What to do

Implement FizzBuzz in the `main()` method.

Print numbers from `1` to `100`.

Rules:

1. If the number is divisible by `3`, print `Fizz`.
2. If the number is divisible by `5`, print `Buzz`.
3. If the number is divisible by both `3` and `5`, print `FizzBuzz`.
4. Otherwise, print the number.

## How to run

From inside the project folder, run:

```bash
mvn clean compile
mvn exec:java
```

## Expected output beginning

```text
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
```

The program should continue until `100`.

---

# Task 2: Fix the Broken User Application

## Project

```text
02.fixtheapp
```

## What to do

This application is broken.

Fix it so that it:

1. Compiles successfully.
2. Runs with Maven.
3. Does not throw runtime errors.
4. Prints only valid active users.

## How to run

From inside the project folder, run:

```bash
mvn clean compile
mvn exec:java
```

## Expected output

```text
Active users:
ALICE - alice@email.com
Total active users: 1
```

---

# Task 3: Fix the Dependency Injection Application

## Project

```text
03.dependency-injection
```

## What to do

This application has a dependency injection problem.

Fix it so that:

1. `EmailService` receives the dependency it needs.
2. The application runs without errors.
3. Valid emails are accepted.
4. Invalid emails are rejected.

## How to run

From inside the project folder, run:

```bash
mvn clean compile
mvn exec:java
```

## Expected output

```text
Sending welcome email to alice@email.com
Invalid email: invalid-email
```

---

# What to explain after each task

After finishing each task, explain:

1. What was broken or missing.
2. What you changed.
3. How you tested that it works.
