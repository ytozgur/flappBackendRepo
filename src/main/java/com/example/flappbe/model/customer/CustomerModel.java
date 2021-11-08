//package com.example.flappbe.model.customer;
//
//import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
//import com.fasterxml.jackson.databind.annotation.JsonSerialize;
//import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
//import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
//import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name="CUSTOMERACCOUNTS", schema="Danisan")
//public class CustomerModel {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "USERID", nullable = false, columnDefinition = "serial")
//    private long userId;
//
//    @Column(name = "PARENT_NAME", nullable = false)
//    private String parentName;
//
//    @Column(name = "PARENT_SURNAME", nullable = false)
//    private String parentSurname;
//
//    @Column(name = "CHILD_NAME", nullable = false)
//    private String childName;
//
//    @Column(name = "CHILD_SURNAME", nullable = false)
//    private String childSurname;
//
//    @Column(name = "PASSWORD", nullable = false)
//    private String password;
//
//    @Column(name = "PARENTMAIL", nullable = false, unique = true)
//    private String parentMail;
//
//    @Column(name = "USERNAME", nullable = false, unique = true)
//    private String username;
//
//    @Column(name = "NATIONALID", nullable = false, unique = true, columnDefinition = "boolean default false")
//    private String nationalId;
//
//}
