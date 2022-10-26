package com.example.springauthmodule.models;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


/*
This Class defines entities in DB
 */

@Entity(name = "user")
@Table(name = "users",
        uniqueConstraints = {
        @UniqueConstraint(columnNames = "username"),
        @UniqueConstraint(columnNames = "email")
        })
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, length = 40)
    private Long id;

    @Email(message = "email is not correct")
    @Column(name = "email", nullable = false, unique = true, length = 40)
    @NotBlank(message = "email field cannot be empty")
    @Size(max = 20)
    private String email;

    @Column(name = "password", nullable = false, length = 40)
    @NotBlank(message = "password field cannot be empty")
    @Size(max = 100)
    private String password;

    @Column(name = "username", nullable = false, length = 40)
    @NotBlank(message = "username field cannot be empty")
    @Size(max = 20)
    private String username;

                                                /* CONSTRUCTORS */

    public User() {
    }

    public User(String email, String password, String username) {
        this.email = email;
        this.password = password;
        this.username = username;
    }

                                            /* GETTERS AND SETTERS */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
