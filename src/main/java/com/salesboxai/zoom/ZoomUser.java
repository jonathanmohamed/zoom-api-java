package com.salesboxai.zoom;

/**
 * Represents a Zoom User with all the user details.
 *
 * @author charles.lobo
 */
public class ZoomUser extends AsJsonString {
	public String id;
	public String first_name;
	public String last_name;
	public String email;
	public Integer type;
	public String role_name;
	public Long pmi;
	public Boolean use_pmi;
	public String timezone;
	public String dept;
	public String created_at;
	public String last_login_time;
	public String last_client_version;
	public String langauge;
	public String phone_country;
	public String phone_number;
	public String vanity_url;
	public String personal_meeting_url;
	public Integer verified;
	public String pic_url;
	public String cms_user_id;
	public String account_id;
	public String host_key;
	public String status;
	public String[] group_ids;
	public String[] im_group_ids;
	public String jid;
	public String job_title;
	public String company;
	public String location;
	public String action;

	public UserInformation user_info;
	public static class UserInformation {
		public Integer type;
		public String email;
	}

	public static ZoomUser requestDefaults(String action,int type, String email){
		ZoomUser zu = new ZoomUser();
		zu.action = action;
		//add user info array
		zu.user_info = new UserInformation();
		zu.user_info.type=type;
		zu.user_info.email=email;
		return zu;
	}
}
