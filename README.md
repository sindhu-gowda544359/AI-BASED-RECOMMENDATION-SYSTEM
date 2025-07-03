# AI-BASED-RECOMMENDATION-SYSTEM

COMPANY NAME: CODTECH IT SOLUTIONS

NAME: SINDHU C.N

INTERN ID: CT0DG1118

DOMAIN NAME: JAVA PROGRAMMING

BATCH DURATION: 4 WEEKS

MENTOR NAME: NELLA SANTHOSH KUMAR

This project titled "AI-Based Recommendation System" involves building a simple yet functional recommendation engine using Java as the primary programming language. The objective of this task is to simulate an AI system that suggests products based on user preferences or historical ratings. The application demonstrates the logic behind personalized product recommendations, much like what is used in platforms such as Amazon, Flipkart, or Netflix. Although we do not use large datasets or machine learning algorithms in this version, it provides a clear conceptual foundation for how such systems operate internally.

To complete this project, we used Visual Studio Code (VS Code) as the main code editor, which is lightweight, efficient, and perfect for writing Java applications. Alongside VS Code, we configured and used Apache Maven, which is a powerful build automation tool used primarily for Java projects. Maven helps manage dependencies, compile code, and run Java applications using the command line. It uses a special XML file called pom.xml to define project structure, plugins, and the main class to execute.

In this system, we developed a class named RecommenderSystem.java under the package com.example.recommender. This class includes a method to simulate sample product ratings by users, and then sorts and displays the top-rated products as recommendations. We used core Java collections, like HashMap, ArrayList, and Map.Entry, to handle product data and compute recommendations. No external dataset or API is used, but the logic mimics real-world recommendation systems.

To run the program, we used the Maven exec plugin, which allows execution of Java classes directly from the command line using the mvn exec:java command. The main class was declared inside the pom.xml file to ensure Maven knew which class to execute. The output is shown directly in the terminal and displays the top 5 recommended products along with their scores. This simulates a basic AI recommendation output in a user-friendly format.

Although this project does not use machine learning libraries such as Apache Mahout, the structure and logic align with how such libraries are used in real applications. Apache Mahout is a tool designed for scalable machine learning, especially in recommendation, classification, and clustering, and can be integrated into Java applications when needed. In this basic version, we focused more on Java logic and structure rather than ML algorithms.

In summary, the tools used for this project include Java, Maven, Visual Studio Code, and basic terminal commands to compile and run the program. The application can be expanded further by integrating Apache Mahout, adding user input, using CSV datasets, or connecting to a database to store and retrieve preferences dynamically. This task provides a foundational understanding of how modern AI recommendation systems work, and how core Java can be used to build simple AI-like behavior. It is ideal for beginners learning Java and interested in artificial intelligence or software development careers.

