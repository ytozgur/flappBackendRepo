package com.example.flappbe.web;

import com.example.flappbe.service.EgitmenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigInteger;

@RestController
@RequestMapping(value = "/base")
public class BaseController {

    @Autowired
    EgitmenService egitmenService;

//    @Autowired
//    BaseService baseService;

    @GetMapping(value = "/getEgitmenName/{id}")
    public ResponseEntity<BaseResponse> getName(@PathVariable long id){
        return new ResponseEntity<BaseResponse>(new BaseResponse(true, egitmenService.getEgitmenName(id), "messaj burasi"), HttpStatus.OK);
    }


    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "/saveegitmenuser",consumes = MediaType.MULTIPART_FORM_DATA_VALUE )
    public ResponseEntity<BaseResponse> saveExperts(@ModelAttribute MultipartFile file, @RequestParam(value = "data") String danismanAccountDTO ) throws Exception{
        return new ResponseEntity<BaseResponse>(new BaseResponse(true, egitmenService.saveEgitmen(file, danismanAccountDTO), "messaj burasi"), HttpStatus.OK);
    }
}
