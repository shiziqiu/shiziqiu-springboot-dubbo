package com.shiziqiu.shop.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String name;

	private Integer age;

	private String password;

}
