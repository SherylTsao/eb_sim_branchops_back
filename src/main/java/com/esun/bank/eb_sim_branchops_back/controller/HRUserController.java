package com.esun.bank.eb_sim_branchops_back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esun.bank.eb_sim_branchops_back.service.ifs.HRUserService;
import com.esun.bank.eb_sim_branchops_back.vo.ChangePasswordRequest;
import com.esun.bank.eb_sim_branchops_back.vo.LoginRequest;
import com.esun.bank.eb_sim_branchops_back.vo.UserProfileResponse;

@RestController
@RequestMapping("/api")
public class HRUserController {
	/*@Autowired
    private HRUserService hrUserService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        String token = hrUserService.login(request.getUserId(), request.getPassword());
        return ResponseEntity.ok(new TokenResponse(token));
    }

    @PostMapping("/logout")
    public ResponseEntity<?> logout(@RequestHeader("Authorization") String token) {
        String userId = extractUserIdFromToken(token);
        hrUserService.logout(userId);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/change-password")
    public ResponseEntity<?> changePassword(@RequestHeader("Authorization") String token,
                                            @RequestBody ChangePasswordRequest request) {
        String userId = extractUserIdFromToken(token);
        hrUserService.changePassword(userId, request);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/user/profile")
    public ResponseEntity<UserProfileResponse> getUserProfile(@RequestHeader("Authorization") String token) {
        String userId = extractUserIdFromToken(token);
        return ResponseEntity.ok(hrUserService.getUserProfile(userId));
    }

    private String extractUserIdFromToken(String token) {
        return "mockUserId"; // ��ڽиѪR JWT
    }

    static class TokenResponse {
        private String token;
        public TokenResponse(String token) { this.token = token; }
        public String getToken() { return token; }
        public void setToken(String token) { this.token = token; }
    }*/
}
