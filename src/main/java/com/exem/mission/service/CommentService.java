package com.exem.mission.service;

import java.util.List;

import com.exem.mission.entity.Comment;

public interface CommentService {

	List<Comment> getList(int postId);
	Comment get(int id);
	void reg(int postId, String content);
	void delete(int id);
	void update(int id, String content);
}
