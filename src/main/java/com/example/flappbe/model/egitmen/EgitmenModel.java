package com.example.flappbe.model.egitmen;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor@NoArgsConstructor
@Entity
@Table(name="danismanaccounts", schema="Danisan")
//@SecondaryTable(name="danismanphotos", schema="Danisan", pkJoinColumns = @PrimaryKeyJoinColumn(name="USERID"))
public class EgitmenModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USERID", nullable = false, columnDefinition = "serial")
    private long userId;

    @Column(name = "NAMESURNAME", nullable = false)
    private String nameSurname;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "EMAIL", nullable = false, unique = true)
    private String email;

    @Column(name = "APPROVED", nullable = false, unique = true)
    private Boolean approved;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @Column(name = "CREATED_ON", nullable = false)
    private LocalDateTime createdOn;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @Column(name = "LAST_LOGIN")
    private LocalDateTime lastLogin;

    @Column(name = "IMGPATH", nullable = false)
    private String imgPath;

//    @Embedded
//    private DanismanPhotoModel danismanPhotoModel;

}
