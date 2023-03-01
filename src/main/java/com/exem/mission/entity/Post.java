package com.exem.mission.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Post {
	private int id;
	private String title;
	private String content;
	private Date updated;
	private Date created;
	private String boardId;
	private String memberId;
}
