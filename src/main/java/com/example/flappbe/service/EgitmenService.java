package com.example.flappbe.service;

import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface EgitmenService {
    boolean saveEgitmen(MultipartFile photo,
                        MultipartFile criminalRecord,
                        MultipartFile resume,
                        MultipartFile coursePresentation,
                        String danismanAccountDTO);
    String getEgitmenName(long id);
}
