package com.esun.bank.eb_sim_branchops_back.vo;

public class UserProfileResponse {
	 	private String userId;
	    private String hecName;
	    private String role;
	    private String email;
	    
	    
		public UserProfileResponse(String userId, String hecName, String role, String email) {
			super();
			this.userId = userId;
			this.hecName = hecName;
			this.role = role;
			this.email = email;
		}
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getHecName() {
			return hecName;
		}
		public void setHecName(String hecName) {
			this.hecName = hecName;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
	    
}
