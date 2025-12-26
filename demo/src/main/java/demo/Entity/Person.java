package demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "person")
public class Person {

    private String email;

    @Id
    private String userId;
    private String password;

    public Person() {}

    public Person(String email, String name, String password) {
        this.email = email;
        this.userId = name;
        this.password = password;
    }

    // Getters & Setters

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getUserId() { return userId; }
    public void setName(String name) { this.userId = name; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}

