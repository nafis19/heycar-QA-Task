# Sample Test Automation project on heycar

This is a sample test automation project using page object model framework. Code is written in Java; TestNG is used as test framework and Maven is used as build tool.


## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Test Cases Covered](#test-cases-covered)
* [How to run the Tests](#How-o-run-the-Tests)
* [How to run the Tests from IDE](#How-o-run-the-Tests-from-IDE)

## General info
This project is a simple test automation project with few simple test cases on heycar website.
	
## Technologies
Project is created with:
* Java version: 13.0.2
* Selenium version: 3.141.59
* Maven version: 3.5.0
* TestNG version: 7.3.0
* IDE: Eclipse

## Test Cases Covered
Few basic test cases, for example:
* Verify Page Loads
* Verify Navigating to another page

## How to run the Tests
To run this project from command line:

```
git clone https://github.com/nafis19/heycar-QA-Task.git
cd heycarTestAutomationProject
mvn clean test

```

## How to run the Tests from IDE

1. Download the code and open in Eclipse IDE
2. Go to pom.xml file and save it to download all the resources
3. Download the chromedriver and geckodriver, and set their path to the BaseTest file
4. Run the tests as TestNG Test
