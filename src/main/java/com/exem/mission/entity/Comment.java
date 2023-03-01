package com.exem.mission.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Comment {
	private int id;
	private String content;
	private Date updated;
	private String postId;
	private String memberId;
}
