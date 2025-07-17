package com.esun.bank.eb_sim_branchops_back.service.ifs;

import com.esun.bank.eb_sim_branchops_back.vo.ChangePasswordRequest;
import com.esun.bank.eb_sim_branchops_back.vo.UserProfileResponse;

public interface HRUserService {
	String login(String userId, String password);
    void logout(String userId);
    boolean changePassword(String userId, ChangePasswordRequest request);
    UserProfileResponse getUserProfile(String userId);
}
