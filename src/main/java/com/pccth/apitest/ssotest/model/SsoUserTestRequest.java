/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pccth.apitest.ssotest.model;

import javax.validation.constraints.NotNull;


/**
 *
 * @author Meuu-PC
 */
public class SsoUserTestRequest {
    
    @NotNull
    private String ssoType;
    @NotNull
    private String systemId;
    @NotNull
    private String systemName;
    @NotNull
    private String systemTransactions;
    @NotNull
    private String systemPrivileges;
    @NotNull
    private String systemUserGroup;
    @NotNull
    private String systemLocationGroup;
    @NotNull
    private String userId;
    @NotNull
    private String userFullName;
    @NotNull
    private String userRdOfficeCode;
    @NotNull
    private String userOfficeCode;
    @NotNull
    private String clientLocation;
    @NotNull
    private String locationMachineNumber;
    @NotNull
    private String tokenId;

    /**
     * @return the ssoType
     */
    public String getSsoType() {
        return ssoType;
    }

    /**
     * @param ssoType the ssoType to set
     */
    public void setSsoType(String ssoType) {
        this.ssoType = ssoType;
    }

    /**
     * @return the systemId
     */
    public String getSystemId() {
        return systemId;
    }

    /**
     * @param systemId the systemId to set
     */
    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    /**
     * @return the systemName
     */
    public String getSystemName() {
        return systemName;
    }

    /**
     * @param systemName the systemName to set
     */
    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    /**
     * @return the systemTransactions
     */
    public String getSystemTransactions() {
        return systemTransactions;
    }

    /**
     * @param systemTransactions the systemTransactions to set
     */
    public void setSystemTransactions(String systemTransactions) {
        this.systemTransactions = systemTransactions;
    }

    /**
     * @return the systemPrivileges
     */
    public String getSystemPrivileges() {
        return systemPrivileges;
    }

    /**
     * @param systemPrivileges the systemPrivileges to set
     */
    public void setSystemPrivileges(String systemPrivileges) {
        this.systemPrivileges = systemPrivileges;
    }

    /**
     * @return the systemUserGroup
     */
    public String getSystemUserGroup() {
        return systemUserGroup;
    }

    /**
     * @param systemUserGroup the systemUserGroup to set
     */
    public void setSystemUserGroup(String systemUserGroup) {
        this.systemUserGroup = systemUserGroup;
    }

    /**
     * @return the systemLocationGroup
     */
    public String getSystemLocationGroup() {
        return systemLocationGroup;
    }

    /**
     * @param systemLocationGroup the systemLocationGroup to set
     */
    public void setSystemLocationGroup(String systemLocationGroup) {
        this.systemLocationGroup = systemLocationGroup;
    }

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return the userFullName
     */
    public String getUserFullName() {
        return userFullName;
    }

    /**
     * @param userFullName the userFullName to set
     */
    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    /**
     * @return the userRdOfficeCode
     */
    public String getUserRdOfficeCode() {
        return userRdOfficeCode;
    }

    /**
     * @param userRdOfficeCode the userRdOfficeCode to set
     */
    public void setUserRdOfficeCode(String userRdOfficeCode) {
        this.userRdOfficeCode = userRdOfficeCode;
    }

    /**
     * @return the userOfficeCode
     */
    public String getUserOfficeCode() {
        return userOfficeCode;
    }

    /**
     * @param userOfficeCode the userOfficeCode to set
     */
    public void setUserOfficeCode(String userOfficeCode) {
        this.userOfficeCode = userOfficeCode;
    }

    /**
     * @return the clientLocation
     */
    public String getClientLocation() {
        return clientLocation;
    }

    /**
     * @param clientLocation the clientLocation to set
     */
    public void setClientLocation(String clientLocation) {
        this.clientLocation = clientLocation;
    }

    /**
     * @return the locationMachineNumber
     */
    public String getLocationMachineNumber() {
        return locationMachineNumber;
    }

    /**
     * @param locationMachineNumber the locationMachineNumber to set
     */
    public void setLocationMachineNumber(String locationMachineNumber) {
        this.locationMachineNumber = locationMachineNumber;
    }

    /**
     * @return the tokenId
     */
    public String getTokenId() {
        return tokenId;
    }

    /**
     * @param tokenId the tokenId to set
     */
    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }
    
    
}
