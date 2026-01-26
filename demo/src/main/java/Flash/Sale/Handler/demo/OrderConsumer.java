package Flash.Sale.Handler.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * This class listens to the Kafka topic and processes the orders.
 * In a real-world app, this is where you would save the order to your MySQL/PostgreSQL database.
 */
@Service
public class OrderConsumer {

    /**
     * The KafkaListener continuously polls the 'order-topic'.
     * The groupId ensures that multiple instances of this app share the load.
     */
    @KafkaListener(topics = "order-topic", groupId = "inventory-group")
    public void consumeOrder(String message) {
        // Log the message so you can see it in your IntelliJ console
        System.out.println("========================================");
        System.out.println("KAFKA CONSUMER: Received new order!");
        System.out.println("Payload: " + message);
        System.out.println("========================================");

        // Logic for final processing:
        // 1. Parse the JSON string (e.g., using Jackson ObjectMapper)
        // 2. Insert into the Orders table in your database
        // 3. Send an email or notification to the user

        try {
            // Simulate database write latency
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}