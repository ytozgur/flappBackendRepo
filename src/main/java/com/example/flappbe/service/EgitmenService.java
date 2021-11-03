package com.example.flappbe.service;

import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface EgitmenService {
    boolean saveEgitmen(MultipartFile file, String danismanAccountDTO);
    String getEgitmenName(long id);
}
