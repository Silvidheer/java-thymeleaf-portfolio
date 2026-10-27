package com.example.portfolio.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ContactForm {

    @NotBlank(message = "Please enter your name.")
    @Size(max = 80, message = "Name must be 80 characters or fewer.")
    private String name;

    @NotBlank(message = "Please enter your email.")
    @Email(message = "Please enter a valid email address.")
    @Size(max = 160, message = "Email must be 160 characters or fewer.")
    private String email;

    @NotBlank(message = "Please enter a message.")
    @Size(max = 2000, message = "Message must be 2,000 characters or fewer.")
    private String message;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
