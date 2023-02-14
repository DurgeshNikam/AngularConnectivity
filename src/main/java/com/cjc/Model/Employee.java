package com.cjc.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String ename;
	private String email;
	private String mobile;
	private String designation;
	private String username;
	private String password;
	
	
	
	/*
    id!: number;
    ename! : string;
    email! : string;
    mobile! : string;
    designation! : string;
    username! : string;
    password!: string;*/
}
