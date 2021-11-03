//package com.example.flappbe.service.impl;
//
//import com.example.danisman.model.danisan.DanisanAccountModel;
//import com.example.danisman.model.dto.DanisanAccountDTO;
//import com.example.danisman.repo.DanisanAccountRepo;
//import com.example.danisman.service.BaseService;
//import com.example.flappbe.service.BaseService;
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Isolation;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.math.BigInteger;
//import java.time.LocalDateTime;
//
//@Service
//@Transactional(isolation=Isolation.READ_COMMITTED, rollbackFor = {Exception.class})
//public class BaseServiceImpl implements BaseService {
////    @Autowired
////    private DanisanAccountRepo danisanAccountRepo;
////
////    @Override
////    public String getname(BigInteger id) {
////        return "haydar";
////    }
////
////    @Override
////    public boolean saveUser(DanisanAccountDTO danisanAccountDTO) {
////        try {
////            DanisanAccountModel danisanAccountModel = new DanisanAccountModel();
////            BeanUtils.copyProperties(danisanAccountDTO, danisanAccountModel);
////            danisanAccountModel.setCreatedOn(LocalDateTime.now());
////            danisanAccountRepo.save(danisanAccountModel);
////            return true;
////        }
////        catch (Exception exception){
////            return false;
////        }
////    }
//
//}
