package com.esun.bank.eb_sim_branchops_back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esun.bank.eb_sim_branchops_back.entity.HRUser;

@Repository
public interface HRUserRepository extends JpaRepository<HRUser, String> {
    
}
