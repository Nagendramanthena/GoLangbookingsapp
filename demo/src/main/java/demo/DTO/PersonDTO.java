package demo.DTO;


import org.hibernate.id.factory.internal.AutoGenerationTypeStrategy;

public class PersonDTO {

    private String email;
    private String userId;
    private String password;

    public PersonDTO() {}

    public PersonDTO(String email, String userId, String password) {
        this.email = email;
        this.userId = userId;
        this.password = password;
    }

    // Getters & Setters
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String  getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
