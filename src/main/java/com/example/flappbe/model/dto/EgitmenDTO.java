package com.example.flappbe.model.dto;

import com.example.flappbe.utils.localdateSerializers.LocalDateDeserializer;
import com.example.flappbe.utils.localdateSerializers.LocalDateSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EgitmenDTO {
    private String name;
    private String surname;
    private String password;
    private String email;
    private String phone;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate birthdate;
    private String job;
    private String courseSubject;
    private int availableDurationWeekly;
    @JsonProperty("isBlockedFromCurrentJob")
    private boolean blockedFromCurrentJob;
    private boolean wantToBeInformed;

}
