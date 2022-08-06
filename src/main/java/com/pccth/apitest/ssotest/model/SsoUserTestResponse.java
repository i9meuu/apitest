/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pccth.apitest.ssotest.model;

import java.util.Map;

/**
 *
 * @author Meuu-PC
 */
public class SsoUserTestResponse {
    
    private String responseCode;
    private String responseMessage;
    private SsoUserTestResponseData responseData;

    /**
     * @return the responseCode
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * @param responseCode the responseCode to set
     */
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * @return the responseMessage
     */
    public String getResponseMessage() {
        return responseMessage;
    }

    /**
     * @param responseMessage the responseMessage to set
     */
    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    /**
     * @return the responseData
     */
    public SsoUserTestResponseData getResponseData() {
        return responseData;
    }

    /**
     * @param responseData the responseData to set
     */
    public void setResponseData(SsoUserTestResponseData responseData) {
        this.responseData = responseData;
    }
    
    
}
