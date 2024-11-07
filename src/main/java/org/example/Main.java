package org.example;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Main {

    public static void main(String[] args) {
        // Connection string (default localhost and port)
        String uri = "mongodb://localhost:27017";

        // Create a MongoClient instance
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            // Connect to a specific database
            MongoDatabase database = mongoClient.getDatabase("testdb");

            // Perform operations on the database (e.g., print out the list of collections)
            System.out.println("Connected to the database: " + database.getName());

            // Sample operation: list all collections
            for (String collectionName : database.listCollectionNames()) {
                System.out.println("Collection: " + collectionName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
