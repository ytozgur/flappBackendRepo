package com.example.flappbe.service.impl;

import com.example.flappbe.model.dto.EgitmenDTO;
import com.example.flappbe.model.egitmen.EgitmenModel;
import com.example.flappbe.repo.EgitmenRepo;
import com.example.flappbe.repo.FileSystemRepository;
import com.example.flappbe.service.EgitmenService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
@Transactional(isolation= Isolation.READ_COMMITTED, rollbackFor = {Exception.class})
public class EgitmenServiceImpl implements EgitmenService {
    @Autowired
    private EgitmenRepo egitmenRepo;
    @Autowired
    private FileSystemRepository fileSystemRepository;

    @Override
    public boolean saveEgitmen(MultipartFile photo, MultipartFile criminalRecord, MultipartFile resume, MultipartFile coursePresentation, String danismanAccountDTOString) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            EgitmenDTO egitmenDTO = objectMapper.readValue(danismanAccountDTOString, EgitmenDTO.class);
            EgitmenModel egitmenModel = new EgitmenModel();
            BeanUtils.copyProperties(egitmenDTO, egitmenModel);
            egitmenModel.setCreatedOn(LocalDateTime.now());
            egitmenModel.setApproved(false);
            egitmenModel.setImgPath(fileSystemRepository.save(photo.getBytes(), photo.getName()));
            egitmenModel.setCriminalRecordPath(fileSystemRepository.save(criminalRecord.getBytes(), criminalRecord.getName()));
            egitmenModel.setResumePath(fileSystemRepository.save(resume.getBytes(), resume.getName()));
            egitmenModel.setCoursePresentation(fileSystemRepository.save(coursePresentation.getBytes(), coursePresentation.getName()));
            egitmenRepo.save(egitmenModel);
            return true;
        }
        catch (Exception exception){
            return false;
        }
    }

    @Override
    public String getEgitmenName(long id) {
        return egitmenRepo.getById(id).getName();
    }


}
