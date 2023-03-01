package com.exem.mission.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Board {

	private int id;
	private String title;
	private Date updated;
	private int memberId;

}
