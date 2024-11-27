package com.nearby.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "master_table")
public class ApplicationMasterEntity {
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "target_name")
	private String targetName;
	
	@Column(name = "calling_mech")
	private String callingMech;
	
	@Column(name = "protocol")
	private String protocol;
	
	@Column(name = "server_ip_url")
	private String serverIpUrl;
	
	@Column(name = "port")
	private String port;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "password")
	private String password;
}
