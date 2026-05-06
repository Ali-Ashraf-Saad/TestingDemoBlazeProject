# DemoBlaze Automation Testing Project

This repository contains a Software Engineering 2 testing project based on the **DemoBlaze** demo e-commerce web application.

The project demonstrates different testing techniques on the same application, including:

- Manual Testing
- API Testing using Postman
- Performance Testing using JMeter and BlazeMeter
- Automation Testing using Selenium WebDriver and TestNG

---

## Project Objective

The goal of this project is to practice and apply multiple software testing techniques on a simple web application that contains common e-commerce flows such as:

- Sign Up
- Login
- Browse Products
- Add to Cart
- View Cart
- Delete Cart Item

---

## Application Under Test

**DemoBlaze**  
A demo e-commerce website used for testing and training purposes.

---

## Testing Scope

### 1. Manual Testing
The manual testing part includes:

- Test Scenarios
- Test Cases
- Positive and Negative Testing
- Bug Reports

---

### 2. API Testing (Postman)
API testing was done using requests captured from the browser Network tab and organized in Postman collections.

#### Collections Structure
- **Auth**
  - Sign Up
  - Log In
- **Products**
  - Get Categories / Products by Category
  - Get Home Page Elements
  - View Product Details
- **Cart**
  - Add to Cart
  - View Cart
  - Delete Cart Item

#### Endpoints Used
- `POST /signup`
- `POST /login`
- `POST /bycat`
- `GET /entries`
- `POST /view`
- `POST /addtocart`
- `POST /viewcart`
- `POST /deletecart`

#### Postman Features Used
- Environments
- Variables
- Folders
- Assertions / Tests

---

### 3. Performance Testing (JMeter + BlazeMeter)
Performance testing was implemented using BlazeMeter Recorder and Apache JMeter.

#### Scenario Flow
- Open Home Page
- Open Product Page
- Add Product to Cart
- Open Cart Page

#### Load Levels
- 10 Users
- 50 Users
- 100 Users

#### Metrics Analyzed
- Response Time
- Throughput
- Error Rate

---

### 4. Automation Testing (Selenium + TestNG)
Automation testing was implemented using Selenium WebDriver and TestNG.

#### Automated Flow
- Home
- Login
- Product
- Add to Cart
- Cart

#### Design Pattern
The project follows the **Page Object Model (POM)** structure.

#### Project Structure
- `base`
- `pages`
- `tests`

---

## Project Structure

```text
DemoBlazeAutomationProject
├── pom.xml
├── src
│   └── test
│       └── java
│           ├── base
│           │   └── BaseTest.java
│           ├── pages
│           │   ├── CartPage.java
│           │   ├── HomePage.java
│           │   ├── LoginPage.java
│           │   └── ProductPage.java
│           └── tests
│               └── EndToEndTest.java
├── DemoBlaze API Testing.postman_collection.json
├── DemoBlaze-JMeter.jmx
└── Project SwE 2 - Testing.docx
