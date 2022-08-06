package com.pccth.apitest.ssotest.controller;

import com.pccth.apitest.ssotest.errorhandler.SsoUserTestExceptionHandler;
import com.pccth.apitest.ssotest.model.SsoUserTest;
import com.pccth.apitest.ssotest.model.SsoUserTestRequest;
import com.pccth.apitest.ssotest.model.SsoUserTestResponse;
import com.pccth.apitest.ssotest.model.SsoUserTestResponseData;
import com.pccth.apitest.ssotest.repository.SsoUserTestRepository;
import java.time.LocalDateTime;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.CannotCreateTransactionException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 * @author Meuu-PC
 */
@EnableSwagger2
@RestController
@RequestMapping("/service")
public class SsoUserTestResource {

    @Autowired
    SsoUserTestRepository repository;

    @PostMapping("/gentoken")
    public ResponseEntity<SsoUserTestResponse> addSsoUserTest(@Valid @RequestBody SsoUserTestRequest request) {
        System.out.println(""+request.toString());
        SsoUserTestResponse resp = new SsoUserTestResponse();

        SsoUserTestResponseData respData = new SsoUserTestResponseData();
        respData.setUserId(request.getUserId());
        respData.setTokenId(request.getTokenId());
        SsoUserTest ssoUserTest = new SsoUserTest(request);
        ssoUserTest.setRequestDate(LocalDateTime.now());
        try {
            repository.save(ssoUserTest);
            resp.setResponseCode("I07000");
            resp.setResponseMessage("ทำรายการเรียบร้อย");
            resp.setResponseData(respData);
        }catch (CannotCreateTransactionException cex){
            return new SsoUserTestExceptionHandler().databaseException(cex, request);
        }catch (DataAccessException ex) {
//            resp.setResponseCode("E000001");
//            resp.setResponseMessage("ไม่สามารถบันทึกข้อมูลลงฐานข้อมูลได้");
//            resp.setResponseData(respData);
            return new SsoUserTestExceptionHandler().insertException(ex, request);
//            return new ResponseEntity<>(resp, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(resp, HttpStatus.ACCEPTED);
    }
    

}
