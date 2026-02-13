package com.sist.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="member_2")
@Data
public class MemberEntity {
/*
 * ID      NOT NULL VARCHAR2(20)  
NAME    NOT NULL VARCHAR2(50)  
SEX     NOT NULL VARCHAR2(10)  
ADDRESS          VARCHAR2(200) 
PWD     NOT NULL VARCHAR2(10)  
 */
	@Id
	private String id;
	private String name;
	private String sex;
	private String address;
	private String pwd;
}
