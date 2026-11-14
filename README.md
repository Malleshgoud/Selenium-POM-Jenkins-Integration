# Selenium POM Framework with GitHub and Jenkins CI Integration

## 📌 Project Overview

This project demonstrates an end\-to\-end Selenium Automation Framework built using Java, Selenium WebDriver, TestNG, Maven, Page Object Model (POM), GitHub, and Jenkins.

The framework automates a Login and Logout workflow and is integrated with Jenkins to achieve Continuous Integration (CI).

This project was developed as a hands\-on learning initiative to understand real\-world automation framework development and CI/CD concepts.

---

## 🚀 Technologies Used

- Java 21
- Selenium WebDriver 4.37
- TestNG
- Maven
- Git
- GitHub
- Jenkins
- Page Object Model (POM)
- WebDriverManager

---

## 🏗 Framework Design

The framework follows the Page Object Model (POM) design pattern.

Benefits:

- Better maintainability
- Improved code reusability
- Separation of test logic and page locators
- Easy framework scalability

---

## 📂 Project Structure

Selenium\-POM\-Jenkins

│

├── src

│   ├── main

│   │   └── java

│   │       ├── pages

│   │       │   ├── LoginPage.java

│   │       │   └── HomePage.java

│   │       │

│   │       └── utils

│   │           └── DriverFactory.java

│   │

│   └── test

│       ├── java

│       │   └── tests

│       │       ├── BaseTest.java

│       │       └── LoginLogoutTest.java

│       │

│       └── resources

│           └── config.properties

│

├── pom.xml

├── testng.xml

├── .gitignore

└── README.md

---

## ✅ Test Scenario Automated

### Login Functionality

1. Launch Browser
2. Navigate to Application URL
3. Enter Username
4. Enter Password
5. Click Login Button
6. Verify Successful Login

### Logout Functionality

1. Click Logout Button
2. Verify User Returns To Login Page

---

## 🔧 Prerequisites

Before running this project, ensure the following software is installed:

- Java JDK 21
- Maven 3.x
- Git
- Google Chrome Browser
- IntelliJ IDEA (Optional)
- Jenkins (Optional for CI)

---

## ⚙️ Setup Instructions

### Clone Repository

git clone [https://github.com/Malleshgoud/Selenium\-POM\-Jenkins\-Integration.git](https://github.com/Malleshgoud/Selenium-POM-Jenkins-Integration.git)

### Navigate To Project Directory

cd Selenium\-POM\-Jenkins

### Verify Maven Installation

mvn \-version

### Execute Project

mvn clean test

---

## ▶️ Running Tests

### Option 1: Using Maven

mvn clean test

### Option 2: Using IntelliJ

Right Click LoginLogoutTest

→ Run

### Option 3: Using TestNG Suite

Right Click testng.xml

→ Run

---

## 🔄 Maven Execution Flow

mvn clean test

clean

↓

Deletes old target folder

test

↓

Compiles Code

Surefire Plugin

↓

Executes TestNG Tests

Selenium

↓

Launches Browser

Test Execution

↓

Pass/Fail Result

---

## 🔀 Git Workflow Used

### Initialize Repository

git init

### Add Files

git add .

### Commit Files

git commit \-m "Initial Selenium Framework"

### Push To GitHub

git push \-u origin main

---

## 🔧 Jenkins Integration

Jenkins was configured with:

- JDK 21
- Maven
- Git

### Freestyle Job Configuration

Source Code Management:

Git

Repository URL:

[https://github.com/Malleshgoud/Selenium\-POM\-Jenkins\-Integration.git](https://github.com/Malleshgoud/Selenium-POM-Jenkins-Integration.git)

Build Step:

Invoke Top\-Level Maven Targets

Goals:

clean test

---

## 🔄 Jenkins Execution Flow

Developer Pushes Code

↓

GitHub Repository

↓

Jenkins Job Trigger

↓

Clone Repository

↓

Maven Build

↓

Execute Selenium Tests

↓

Generate Build Result

---

## 🎯 CI/CD Flow

IntelliJ

↓

Git Commit

↓

GitHub

↓

Jenkins

↓

Maven

↓

TestNG

↓

Selenium

↓

Build Success/Failure

---

## 🧩 Challenges Faced During Implementation

### Challenge 1

Issue:

Unable to find CDP implementation matching browser version

Cause:

Chrome browser version mismatch with Selenium DevTools support.

Resolution:

Updated Selenium dependency to the latest stable version.

Learning:

Always keep Selenium and browser versions compatible.

---

### Challenge 2

Issue:

Browser not launching properly

Cause:

Older Selenium version.

Resolution:

Updated Selenium dependency.

Result:

Browser launched successfully.

---

### Challenge 3

Issue:

Couldn't find any revision to build

Cause:

Jenkins was looking for:

master

while GitHub repository used:

main

Resolution:

Changed branch configuration from:

\*/master

to:

\*/main

---

### Challenge 4

Issue:

No plugin found for prefix 'Goals'

Cause:

Entered:

Goals:

clean test

inside Jenkins Maven Goals textbox.

Resolution:

Changed value to:

clean test

---

### Challenge 5

Issue:

Current branch main has no upstream branch

Resolution:

git push \-u origin main

Learning:

Need to establish tracking between local and remote branches.

---

## 📚 Key Learnings

Through this project I learned:

- Selenium Framework Design
- Page Object Model (POM)
- Maven Dependency Management
- Maven Build Lifecycle
- TestNG Framework
- Git Fundamentals
- GitHub Repository Management
- Jenkins Installation and Configuration
- Continuous Integration Concepts
- Build Troubleshooting Techniques

---

## 🚀 Future Enhancements

The following improvements are planned:

- ConfigReader Utility
- Extent Reports
- Log4j Logging
- Screenshot Capture On Failure
- Jenkins Pipeline (Jenkinsfile)
- GitHub Webhooks
- Docker Integration
- Selenium Grid
- Parallel Execution
- Cross Browser Testing
- Data Driven Framework

---

## 💡 Interview Project Explanation

This project demonstrates an end\-to\-end Selenium automation framework developed using Java, TestNG, Maven, and Page Object Model. The framework is integrated with GitHub for source control and Jenkins for Continuous Integration. Jenkins clones the latest code from GitHub and executes the framework using Maven commands, providing automated test execution and build validation.

---

## 👨‍💻 Author

Mallesh Goud

QA Automation Engineer

Skills:

- Selenium Automation
- Java
- TestNG
- Maven
- Git & GitHub
- Jenkins
- AWS Fundamentals
- DevOps Learning Journey

---

## ⭐ Support

If you found this project useful, please consider starring the repository.

Happy Learning and Happy Testing\!

