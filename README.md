# _Web Challenge test_
### _Test automation project was developed to simply and efficiently demonstrate tests on the Web platform with support for behavior-oriented development._

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)
[![GitHub issues](https://img.shields.io/github/issues/carlospmbarros/web-challenge-test)]()
[![GitHub forks badge](https://img.shields.io/github/forks/carlospmbarros/web-challenge-test)]()
[![GitHub stars badge](https://img.shields.io/github/stars/carlospmbarros/web-challenge-test)]()
[![GitHub license](https://img.shields.io/github/license/carlospmbarros/web-challenge-test)]()
[![Maven](https://badgen.net/badge/icon/maven?icon=maven&label)](https://https://maven.apache.org/)
[![official JetBrains project](http://jb.gg/badges/official.svg)](https://confluence.jetbrains.com/display/ALL/JetBrains+on+GitHub)
### Tech

- [Java](https://docs.oracle.com/en/java/javase/17/) - JDK 17 Documentation - Programming language
- [Selenium](https://www.selenium.dev/) - Automates browsers
- [Cucumber](https://cucumber.io/) - Validate executable specifications
- [Junit](https://junit.org/junit5/) - Testing framework for Java and the JVM
- [Owner](https://owner.aeonbits.org/) - The boilerplate code in properties based configuration
- [Intellij](https://www.jetbrains.com/pt-br/idea/) - Software development IDE

### Installation

- Create a folder with the name of your choice, I suggest creating it with the name GIT
- Clone the project
```shell
$ git clone https://github.com/carlospmbarros/web-challenge-test
```
- With intellij open, click open and go to the folder where the project was cloned and double-click
- Wait until the build is finished and the project is ready to be used

### Configuration 

- In the resources/properties folder we have the _**general.properties**_ file where there are the global settings that are being used in the project 

### Execution

- Running it through the terminal
```shell
$ mvn test
```
- Using tags in execution through the terminal, where the item @tag Name will be replaced by the tag found in the .FEATURE file inside the resources/features folder, ex: **@addProduct**
```shell
$ mvn test -Dcucumber.options="--tags @TagName"
```
- Using tag to add a product in ecommerce @adicionaProduto
```shell
$ mvn test -Dcucumber.options="--tags @adicionaProduto"
```
- Using tag to access e-commerce @Login
```shell
$ mvn test -Dcucumber.options="--tags @Login"
```
- Using @allTests tag to run all tests and opening Allure Report
```shell
$ mvn test -Dcucumber.options="--tags @allTests" && allure serve allure-results
```
- Running your tests via project runner
- Before doing the procedure below, open the RunnerTest file and validate that the tag that will be used is the same one associated with the test scenarios within the .FEATURE files
-- Go to the runner folder that is in the path _**src/test/java/dev/carlosbarros/runner/**_ and with the right button of the project click on the **_RunnerTest.java_** class and click run ... this will make the project run through cucumber runner
- After running the tests through the runner, open the terminal and type the command below, so the allure report that was created after execution
```shell
$ allure serve allure-results
```
### Setting up Selenium Grid on Mac OS, Linux and Windos 10+
- Under construction
### Running selenium server
- Under construction
### Running Browser Nodes
- Under construction
### Run Parallel Tests
- Under construction
### Benefits and Limitations of Using Selenium Grid

- _**Benefits**_ - Open Browser: Selenium is a publicly accessible automation framework and is free, with no upfront costs. So, you can save bucks here and use them for other good causes.
- _**Benefits**_ - Support Multiple Browsers: Chrome, Firefox, IE etc.
- _**Benefits**_ - Support Multiple OS and Architecture: Windows, Linux, Mac OS, UNIX, etc.
- _**Benefits**_ - Speeds up the Test Execution Time: It speeds up the test suite completion time as it is capable of running multiple tests in parallel. For example, if we have 5 nodes and we need to execute a test suite of 50 tests then it is going to take 5 times lesser time than a single machine that runs this test suit without Selenium Grid. When a node is free , it automatically picks up the test case waiting in the execution queue.
- _**Benefits**_ - Cloud Based Execution: Availability, Reliability, Save Hardware and Software Maintenance Cost
- _**Benefits**_ - Language and Framework Support: It supports all major languages like Java, Python, JavaScript, C#, Ruby, and Perl programming languages for software test automation.
- _**Limitations**_ - Cost: Extra cost to project as it requires additional machines as Nodes.
- _**Limitations**_ - Poor Scalability: it has relatively poor scalability compared with many modern applications. It certainly is unable to scale up or down on demand.
- _**Limitations**_ - Reconfiguration: it is pretty static. Each server is configured in advance with a subset of the required browser instances available. If you want to vary this, you have to reconfigure.
- _**Limitations**_ - Require skilled engineers: Selenium Grid depends on skilled engineers to create and maintain it, as well as IT approval.
- _**Limitations**_ - Less Secure compare to cloud-based labs: it is less secure than more flexible and powerful cloud-based labs.

### Folders

- [x] _**Core**_ - Where are all global settings located
- [x] _**Enums**_ - Browsers are associated with the enumerator class
- [x] _**Maps**_ - Mapping html elements
- [x] _**Pages**_ - Where are all the page objects
- [x] _**Steps**_ - Test scenarios described in .feature files are developed behaviors
- [x] _**Runner**_ - Cucumber based test runner
- [x] _**Resources/Features**_ - Description of test scenarios that meet the demands of the business area and system behavior


## Project Structure

![alt text](docs/pe.png)

