# Selenium POM Framework with GitHub & Jenkins CI Integration

## 📌 Project Overview

This project demonstrates a complete end\-to\-end Selenium Automation Framework developed using Java, Selenium WebDriver, TestNG, Maven, GitHub, and Jenkins.

The framework follows the Page Object Model (POM) design pattern and automates the complete SauceDemo e\-commerce workflow.

---

# 🚀 Application Under Test

URL:

[https://www.saucedemo.com/](https://www.saucedemo.com/)

Test User:

Username : standard\_user

Password : secret\_sauce

---

# 🛠 Technology Stack

- Java 21
- Selenium WebDriver 4
- TestNG
- Maven
- Git
- GitHub
- Jenkins
- Page Object Model (POM)

---

# 📂 Framework Structure

src

│

├── main

│   └── java

│

│       ├── pages

│       │

│       │   ├── BasePage.java

│       │   ├── LoginPage.java

│       │   ├── ProductsPage.java

│       │   ├── CartPage.java

│       │   ├── CheckoutPage.java

│       │   ├── CheckoutCompletePage.java

│       │   └── LogoutPage.java

│       │

│       └── utils

│           ├── DriverFactory.java

│           ├── ConfigReader.java

│           ├── WaitUtils.java

│           └── ScreenshotUtils.java

│

├── test

│   └── java

│

│       ├── tests

│       │   ├── BaseTest.java

│       │   └── LoginTest.java

│       │

│       └── listeners

│           └── TestListener.java

│

├── testng.xml

├── pom.xml

└── README.md

---

# ✅ Automated Test Scenario

## End\-to\-End Purchase Flow

Login

↓

Verify Products Page

↓

Add Product To Cart

↓

Open Cart

↓

Verify Product Added

↓

Checkout

↓

Enter Customer Information

↓

Continue

↓

Finish Order

↓

Logout

---

# ✅ Framework Components Implemented

## 1\. Page Object Model (POM)

Created dedicated page classes:

- LoginPage
- ProductsPage
- CartPage
- CheckoutPage
- CheckoutCompletePage
- LogoutPage

Benefits:

- Reusability
- Easy maintenance
- Better readability

---

## 2\. BasePage

Implemented common page\-level functionality.

Contains:

- WebDriver
- WaitUtils

Purpose:

- Avoid duplicate code across page classes.

---

## 3\. BaseTest

Implemented common test\-level functionality.

Contains:

- Browser Launch
- URL Launch
- Browser Close
- Driver Management

Benefits:

- Centralized test setup
- Easy maintenance

---

## 4\. ConfigReader Utility

Created external configuration support using:

config.properties

Properties:

url=[https://www.saucedemo.com](https://www.saucedemo.com)

username=standard\_user

password=secret\_sauce

browser=chrome

Benefits:

- No hardcoded values
- Easy environment changes

---

## 5\. WaitUtils

Implemented reusable Explicit Wait utility.

Methods:

- waitForElementVisible()
- waitForElementClickable()
- waitForUrlContains()

Benefits:

- Eliminates synchronization issues
- Reduces flaky tests

---

## 6\. Screenshot Utility

Implemented screenshot capture utility.

Features:

- Captures screenshot on failure
- Stores execution evidence
- Generates timestamp\-based screenshot names

Example:

verifyEndToEndPurchase\_FAILED\_20261115\_101010.png

---

## 7\. TestNG Listener

Implemented custom TestNG Listener.

Features:

- onTestStart()
- onTestSuccess()
- onTestFailure()

Current Use:

- Automatic screenshot capture on test failure

---

## 8\. ChromeOptions Configuration

Implemented browser options to avoid automation interruptions.

Configured:

Incognito Mode

Disable Notifications

Disable Password Manager

Disable Popup Blocking

Benefits:

- Stable execution
- Reduced browser interference

---

# 🔄 Maven Execution

Run locally:

mvn clean test

Execution Flow:

Maven

↓

TestNG

↓

BaseTest

↓

Page Objects

↓

Selenium Execution

---

# 🔀 Git Workflow

Initialize Repository:

git init

Commit Changes:

git add .

git commit \-m "Commit Message"

Push Changes:

git push origin main

---

# ☁️ GitHub Integration

Repository hosted on GitHub for:

- Version Control
- Collaboration
- Source Code Management

Benefits:

- Track Framework Evolution
- Rollback Support
- Central Repository

---

# 🔧 Jenkins Integration

Configured:

- JDK 21
- Maven
- Git

Created Jenkins Freestyle Job.

Build Goal:

clean test

Execution Flow:

GitHub

↓

Jenkins

↓

Checkout Code

↓

Maven Build

↓

TestNG Execution

↓

Selenium Tests

↓

Build Result

---

# ✅ Challenges Faced

## Challenge 1

Issue:

CDP Version Warning

Resolution:

Updated Selenium dependency to latest stable version.

---

## Challenge 2

Issue:

Couldn't find any revision to build

Cause:

Jenkins was configured for:

master

Repository branch:

main

Resolution:

Updated Jenkins Branch Specifier:

\*/main

---

## Challenge 3

Issue:

No plugin found for prefix 'Goals'

Cause:

Incorrect Maven Goal configuration.

Resolution:

Used:

clean test

---

## Challenge 4

Issue:

NullPointerException

Cause:

WebDriver re\-declared in child page classes after introducing BasePage.

Resolution:

Removed duplicate WebDriver declarations and reused BasePage driver.

---

## Challenge 5

Issue:

TimeoutException in Jenkins

Cause:

Synchronization issues.

Resolution:

Implemented Explicit Waits using WaitUtils.

---

## Challenge 6

Issue:

NoSuchElementException

Cause:

Weak XPath locator.

Resolution:

Replaced XPath with reliable locator strategy.

---

# 📚 Key Learnings

- Selenium Framework Design
- Page Object Model
- Explicit Waits
- Maven Build Lifecycle
- Git & GitHub
- Jenkins CI Integration
- Browser Configuration
- TestNG Listeners
- Screenshot Handling
- Framework Debugging Techniques

---

# 🚀 Future Enhancements

- Extent Reports
- Jenkins Pipeline (Jenkinsfile)
- Cross Browser Testing
- Data Driven Testing
- Excel Integration
- Log4j Logging
- GitHub Webhooks
- Selenium Grid
- Docker Integration
- Parallel Execution

---

# 🎯 Interview Project Summary

Developed an End\-to\-End Selenium Automation Framework using Java, Selenium WebDriver, TestNG, Maven, and Page Object Model. Implemented reusable framework components such as BasePage, BaseTest, ConfigReader, WaitUtils, Screenshot Utility, and TestNG Listener. Integrated the framework with GitHub for version control and Jenkins for Continuous Integration. Automated a complete SauceDemo purchase workflow from Login through Checkout and Logout.

---

# 👨‍💻 Author

Mallesh Goud

QA Automation Engineer

Learning Journey:

- Selenium
- Java
- Maven
- Git
- GitHub
- Jenkins
- CI/CD
- DevOps Fundamentals

