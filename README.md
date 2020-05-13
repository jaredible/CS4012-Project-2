<p align="center">
  <h3 align="center">CS 4012 Project 2</h3>
  
  <p align="center">
    A Spring web application for generating assignments!
    <br />
    <a href="https://tomcat.jaredible.net/MathBank">View Demo</a>
  </p>
</p>

## Table of Contents

* [About the Project](#about-the-project)
  * [Built With](#built-with)
* [Getting Started](#getting-started)
* [Use Case](#use-case)

## About The Project

<p align="center">
  <a href="https://github.com/jaredible/CS4012-Project-1/blob/master/images/image0.PNG">
    <img src="https://github.com/jaredible/CS4012-Project-1/blob/master/images/image0.PNG" alt="Reporter">
  </a>
</p>

There were many struggles throughout this project, such as Maven setup, Spring setup, Hibernate setup, [SoC](https://en.wikipedia.org/wiki/Separation_of_concerns), and Java Reflection. However, I could expand this project sometime. I want to enhance this application so that it:
* Validates input
* Checks for errors
* Provides a better user interface
* Allows users to have accounts so that they may keep track of their own assignments
* Does not allow duplicate questions and assignments to be saved into the database

### Built With
* [Maven](https://maven.apache.org/)
* [Tomcat](http://tomcat.apache.org/)
* [Spring](https://spring.io/)
* [Hibernate](https://hibernate.org/)
* [PdfBox](https://pdfbox.apache.org/)

## Getting Started

1. Clone this repository
2. Build with Maven
3. Deploy to a Tomcat server
4. Use `reporter.sql` to create the database

## Use Case

This is just an example use case. I have only prepared 3 test files, which can be found in the `tests` folder, to show how this application works.

Beginning on the home page, you will have no questions. This is because no questions have been uploaded into the database yet, so let's do that.
<p align="center">
  <a href="https://github.com/jaredible/CS4012-Project-2/blob/master/screenshots/screenshot1.PNG">
    <img src="https://github.com/jaredible/CS4012-Project-2/blob/master/screenshots/screenshot1.PNG" alt="Reporter">
  </a>
</p>

Upload the 3 test files, that I have provided, in this order:
1. `cs4012homework1.properties`
2. `cs4012quiz1.properties`
3. `cs4012test1.properties`

The only reason for the order is because `cs4012test1.properties` contains information that references the other 2 properties files. This way, there are no errors, because we are assuming that the user knows what they are doing.
<p align="center">
  <a href="https://github.com/jaredible/CS4012-Project-2/blob/master/screenshots/screenshot2.PNG">
    <img src="https://github.com/jaredible/CS4012-Project-2/blob/master/screenshots/screenshot2.PNG" alt="Reporter">
  </a>
</p>

Click the upload button.
<p align="center">
  <a href="https://github.com/jaredible/CS4012-Project-2/blob/master/screenshots/screenshot3.PNG">
    <img src="https://github.com/jaredible/CS4012-Project-2/blob/master/screenshots/screenshot3.PNG" alt="Reporter">
  </a>
</p>

This page will provide 3 links that you can click to take you to the generated PDFs.
<p align="center">
  <a href="https://github.com/jaredible/CS4012-Project-2/blob/master/screenshots/screenshot4.PNG">
    <img src="https://github.com/jaredible/CS4012-Project-2/blob/master/screenshots/screenshot4.PNG" alt="Reporter">
  </a>
</p>

The generated homework PDF from `cs4012homework1.properties`.
<p align="center">
  <a href="https://github.com/jaredible/CS4012-Project-2/blob/master/screenshots/screenshot5.PNG">
    <img src="https://github.com/jaredible/CS4012-Project-2/blob/master/screenshots/screenshot5.PNG" alt="Reporter">
  </a>
</p>

The generated quiz PDF from `cs4012quiz1.properties`.
<p align="center">
  <a href="https://github.com/jaredible/CS4012-Project-2/blob/master/screenshots/screenshot.PNG">
    <img src="https://github.com/jaredible/CS4012-Project-2/blob/master/screenshots/screenshot6.PNG" alt="Reporter">
  </a>
</p>

The generated test PDF from `cs4012test1.properties`.
<p align="center">
  <a href="https://github.com/jaredible/CS4012-Project-2/blob/master/screenshots/screenshot7.PNG">
    <img src="https://github.com/jaredible/CS4012-Project-2/blob/master/screenshots/screenshot7.PNG" alt="Reporter">
  </a>
</p>

The home page will now have questions since you uploaded the 3 properties file's questions into the database.
<p align="center">
  <a href="https://github.com/jaredible/CS4012-Project-2/blob/master/screenshots/screenshot8.PNG">
    <img src="https://github.com/jaredible/CS4012-Project-2/blob/master/screenshots/screenshot8.PNG" alt="Reporter">
  </a>
</p>
