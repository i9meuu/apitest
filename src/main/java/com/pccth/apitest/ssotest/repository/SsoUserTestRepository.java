/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pccth.apitest.ssotest.repository;

import com.pccth.apitest.ssotest.model.SsoUserTest;
import java.sql.Timestamp;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Meuu-PC
 */
public interface SsoUserTestRepository extends JpaRepository<SsoUserTest, Timestamp> {
    
}
