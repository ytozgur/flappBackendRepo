package com.example.flappbe.model.egitmen;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor@NoArgsConstructor
@Entity
@Table(name="EGITMEN", schema="FLAPP")
//@SecondaryTable(name="danismanphotos", schema="Danisan", pkJoinColumns = @PrimaryKeyJoinColumn(name="USERID"))
public class EgitmenModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USERID", nullable = false, columnDefinition = "serial")
    private long userId;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "SURNAME", nullable = false)
    private String surname;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "EMAIL", nullable = false, unique = true)
    private String email;

    @Column(name = "PHONE", nullable = false, unique = true)
    private String phone;

    @Column(name = "APPROVED", nullable = false, unique = true, columnDefinition = "boolean default false")
    private Boolean approved;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Column(name = "BIRTHDATE", nullable = false)
    private LocalDate birthdate;

    @Column(name = "JOB", nullable = false, unique = true)
    private String job;

    @Column(name = "COURSE_SUBJECT", nullable = false, unique = true)
    private String courseSubject;

    @Column(name = "AVAILABLE_DURATION_WEEKLY", nullable = false, unique = true)
    private int availableDurationWeekly;

    @Column(name = "IS_BLOCKED_FROM_CURRENT_JOB", nullable = false, unique = true, columnDefinition = "boolean default false")
    private Boolean blockedFromCurrentJob;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @Column(name = "CREATED_ON", nullable = false)
    private LocalDateTime createdOn;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @Column(name = "LAST_LOGIN")
    private LocalDateTime lastLogin;

    @Column(name = "IMG_PATH", nullable = false)
    private String imgPath;

    @Column(name = "CRIMINAL_RECORD_PATH", nullable = false)
    private String criminalRecordPath;

    @Column(name = "RESUME_PATH", nullable = false)
    private String resumePath;

    @Column(name = "COURSE_PRESENTATION_PATH", nullable = false)
    private String coursePresentation;


//    @Embedded
//    private DanismanPhotoModel danismanPhotoModel;

}
