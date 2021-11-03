package com.example.flappbe.model.customer;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name="Accounts", schema="Danisan")
public class CustomerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, columnDefinition = "serial")
    private BigInteger id;

    @Column(name = "USERNAME", nullable = false, unique = true)
    private String username;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "EMAIL", nullable = false, unique = true)
    private String email;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @Column(name = "CREATED_ON", nullable = false)
    private LocalDateTime createdOn;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @Column(name = "LAST_LOGIN")
    private LocalDateTime lastLogin;

    public CustomerModel() {
        super();
    }

    public CustomerModel(BigInteger id, String username, String password, String email, LocalDateTime createdOn, LocalDateTime lastLogin) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.createdOn = createdOn;
        this.lastLogin = lastLogin;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }
}
