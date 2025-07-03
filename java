                                         POM.XML

  <project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 
         http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>com.example</groupId>
  <artifactId>airecommender</artifactId>
  <version>1.0-SNAPSHOT</version>

  <dependencies>
    <!-- Apache Mahout -->
    <dependency>
      <groupId>org.apache.mahout</groupId>
      <artifactId>mahout-core</artifactId>
      <version>0.9</version>
    </dependency>

    <!-- Logging dependency -->
    <dependency>
      <groupId>org.slf4j</groupId>
      <artifactId>slf4j-log4j12</artifactId>
      <version>1.7.25</version>
    </dependency>
  </dependencies>
  <build>
    <plugins>
      <plugin>
        <groupId>org.codehaus.mojo</groupId>
        <artifactId>exec-maven-plugin</artifactId>
        <version>3.1.0</version>
        <configuration>
          <mainClass>com.example.recommender.RecommenderSystem</mainClass>
        </configuration>
      </plugin>
    </plugins>
  </build>
</project>
        

                                              RECOMMENDERSYSTEM.JAVA
    
    package com.example.recommender;

import java.util.*;

public class RecommenderSystem {

    // Step 1: Store sample user ratings for different products
    private static Map<String, Double> getUserRatings() {
        Map<String, Double> ratings = new HashMap<>();
        ratings.put(" Mobile Phone", 4.8);
        ratings.put(" Sports Shoes", 4.5);
        ratings.put(" Headphones", 4.2);
        ratings.put(" Books", 3.9);
        ratings.put(" Handbag", 3.5);
        ratings.put(" Laptop", 4.9);
        ratings.put(" Smart Watch", 4.0);
        return ratings;
    }

    // Step 2: Generate top N product recommendations based on score
    private static List<Map.Entry<String, Double>> getTopRecommendations(Map<String, Double> ratings, int topN) {
        List<Map.Entry<String, Double>> sortedList = new ArrayList<>(ratings.entrySet());
        sortedList.sort((a, b) -> Double.compare(b.getValue(), a.getValue())); // sort high to low
        return sortedList.subList(0, Math.min(topN, sortedList.size()));
    }

    // Step 3: Display the recommendations
    private static void displayRecommendations(List<Map.Entry<String, Double>> recommendations) {
        System.out.println("🎯 AI-Based Product Recommendations:");
        System.out.println("-------------------------------------");
        for (Map.Entry<String, Double> entry : recommendations) {
            System.out.println("✅ Product: " + entry.getKey() + " | Score: " + entry.getValue());
        }
        System.out.println("-------------------------------------");
        System.out.println("✨ Thank you for using our system!");
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("🔍 Loading recommendations...");

        Map<String, Double> ratings = getUserRatings(); // fetch product scores
        List<Map.Entry<String, Double>> topProducts = getTopRecommendations(ratings, 5); // top 5

        displayRecommendations(topProducts); // show output
    }
}

    
