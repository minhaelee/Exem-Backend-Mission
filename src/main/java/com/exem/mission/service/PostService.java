package com.exem.mission.service;

import java.util.List;

import com.exem.mission.entity.Board;
import com.exem.mission.entity.Post;

public interface PostService {

	List<Post> getList();
	Post get(int id);
	void reg(int boardId, Post post);
	void delete(int id);
	void update(int id, Post post);
}
