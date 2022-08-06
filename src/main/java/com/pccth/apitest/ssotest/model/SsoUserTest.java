/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pccth.apitest.ssotest.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;

/**
 *
 * @author Meuu-PC
 */
@Entity
@Table(name = "sso_user_test")
public class SsoUserTest {

    @Id
    @CreationTimestamp
    @Column(name = "request_date")
    private LocalDateTime requestDate;
    
    @Column(name = "ssotype")
    private String ssoType;
    
    @Column(name = "systemid")
    private String systemId;
    
    @Column(name = "systemname")
    private String systemName;
    
    @Column(name = "systemtransactions")
    private String systemTransactions;
    
    @Column(name = "systemprivileges")
    private String systemPrivileges;
    
    @Column(name = "systemusergroup")
    private String systemUserGroup;
    
    @Column(name = "systemlocationgroup")
    private String systemLocationGroup;
    
    @Column(name = "userid")
    private String userId;
    
    @Column(name = "userfullname")
    private String userFullName;
    
    @Column(name = "userrdofficecode")
    private String userRdOfficeCode;
    
    @Column(name = "userofficecode")
    private String userOfficeCode;
    
    @Column(name = "clientlocation")
    private String clientLocation;
    
    @Column(name = "locationmachinenumber")
    private String locationMachineNumber;
    
    @Column(name = "tokenid")
    private String tokenId;
    
    public SsoUserTest() {
        
    }
    
    public SsoUserTest(SsoUserTestRequest request) {
        this.clientLocation = request.getClientLocation();
        this.locationMachineNumber = request.getLocationMachineNumber();
        this.ssoType = request.getSsoType();
        this.systemId = request.getSystemId();
        this.systemLocationGroup = request.getSystemLocationGroup();
        this.systemName = request.getSystemName();
        this.systemPrivileges = request.getSystemPrivileges();
        this.systemTransactions = request.getSystemTransactions();
        this.systemUserGroup = request.getSystemUserGroup();
        this.tokenId = request.getTokenId();
        this.userFullName = request.getUserFullName();
        this.userId = request.getUserId();
        this.userOfficeCode = request.getUserOfficeCode();
        this.userRdOfficeCode = request.getUserRdOfficeCode();
    }

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

    /**
     * @return the requestDate
     */
    public LocalDateTime getRequestDate() {
        return requestDate;
    }

    /**
     * @param requestDate the requestDate to set
     */
    public void setRequestDate(LocalDateTime requestDate) {
        this.requestDate = requestDate;
    }
    
    

}
