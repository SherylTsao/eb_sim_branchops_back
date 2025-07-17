package com.esun.bank.eb_sim_branchops_back.service.impl;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.esun.bank.eb_sim_branchops_back.entity.HRUser;
import com.esun.bank.eb_sim_branchops_back.repository.HRUserRepository;
import com.esun.bank.eb_sim_branchops_back.service.ifs.HRUserService;
import com.esun.bank.eb_sim_branchops_back.vo.ChangePasswordRequest;
import com.esun.bank.eb_sim_branchops_back.vo.UserProfileResponse;

@Service
public class HRUserServiceImpl {
/*implements HRUserService 
    @Autowired
    private HRUserRepository hrUserRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String login(String userId, String password) {
        Optional<HRUser> userOpt = hrUserRepository.findById(userId);
        if (userOpt.isEmpty()) {
            throw new RuntimeException("");
        }

        HRUser user = userOpt.get();

        if (Boolean.TRUE.equals(user.getIsLocked())) {
            throw new RuntimeException("");
        }

        if (!passwordEncoder.matches(password, user.getPwd())) {
            int failCount = user.getLoginFailCount() == null ? 0 : user.getLoginFailCount();
            user.setLoginFailCount(failCount + 1);
            if (failCount + 1 >= 5) {
                user.setIsLocked(true);
            }
            hrUserRepository.save(user);
            throw new RuntimeException("");
        }

        user.setLoginFailCount(0);
        user.setLastLoginTime(LocalDateTime.now());
        hrUserRepository.save(user);

        return "mock-jwt-token"; 
    }

    @Override
    public void logout(String userId) {
        
    }

    @Override
    public boolean changePassword(String userId, ChangePasswordRequest request) {
        HRUser user = hrUserRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException(""));

        if (!passwordEncoder.matches(request.getOldPassword(), user.getPwd())) {
            throw new RuntimeException("");
        }

        user.setPwd(passwordEncoder.encode(request.getNewPassword()));
        hrUserRepository.save(user);
        return true;
    }

    @Override
    public UserProfileResponse getUserProfile(String userId) {
        HRUser user = hrUserRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException(""));

        return new UserProfileResponse(
                user.getUserId(),
                user.getHecName(),
                user.getRole(),
                user.getEmail()
        );
    }*/
}
