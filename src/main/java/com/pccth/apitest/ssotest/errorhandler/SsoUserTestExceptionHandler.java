/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pccth.apitest.ssotest.errorhandler;

import com.pccth.apitest.ssotest.model.SsoUserTestRequest;
import com.pccth.apitest.ssotest.model.SsoUserTestResponse;
import com.pccth.apitest.ssotest.model.SsoUserTestResponseData;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.transaction.CannotCreateTransactionException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 *
 * @author Meuu-PC
 */
@RestControllerAdvice
public class SsoUserTestExceptionHandler {

        @ExceptionHandler(CannotCreateTransactionException.class)
        public ResponseEntity<SsoUserTestResponse> databaseException(CannotCreateTransactionException ex, SsoUserTestRequest request) {
            System.out.println("---------------- databaseException ---------------");
            SsoUserTestResponse response = new SsoUserTestResponse();
            SsoUserTestResponseData respData = new SsoUserTestResponseData();
            respData.setUserId(request.getUserId());
            respData.setTokenId(request.getTokenId());
            response.setResponseCode("E000001");
            response.setResponseMessage("ไม่พบฐานข้อมูล");
            response.setResponseData(respData);

            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

@ExceptionHandler(DataAccessException.class)
        public ResponseEntity<SsoUserTestResponse> insertException(DataAccessException ex, SsoUserTestRequest request) {
            System.out.println("---------------- insertException ---------------");
            SsoUserTestResponse response = new SsoUserTestResponse();
            SsoUserTestResponseData respData = new SsoUserTestResponseData();
            respData.setUserId(request.getUserId());
            respData.setTokenId(request.getTokenId());
            response.setResponseCode("E000001");
            response.setResponseMessage("ไม่สามารถบันทึกข้อมูลลงฐานข้อมูลได้");
            response.setResponseData(respData);

            return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
        }
        
        @ExceptionHandler(HttpMessageNotReadableException.class)
        public ResponseEntity<SsoUserTestResponse> handleValidationError(HttpMessageNotReadableException ex ) {
            System.out.println("---------------- handleValidationError : null request ---------------");
            SsoUserTestResponse response = new SsoUserTestResponse();
            SsoUserTestResponseData respData = new SsoUserTestResponseData();
            respData.setUserId(null);
            respData.setTokenId(null);
            response.setResponseCode("400");
            response.setResponseMessage("ไม่พบข้อมูลการ POST");
            response.setResponseData(respData);

            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
        @ExceptionHandler(MethodArgumentNotValidException.class)
        public ResponseEntity<SsoUserTestResponse> handleValidationError(MethodArgumentNotValidException ex ) {
            System.out.println("---------------- handleValidationError : blank JSON ---------------");
            SsoUserTestResponse response = new SsoUserTestResponse();
            SsoUserTestResponseData respData = new SsoUserTestResponseData();
            respData.setUserId(null);
            respData.setTokenId(null);
            response.setResponseCode("400");
            response.setResponseMessage("ไม่พบข้อมูลการ POST");
            response.setResponseData(respData);

            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
      
}
