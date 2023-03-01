package com.exem.mission.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.exem.mission.entity.Board;
import com.exem.mission.entity.Post;

@Mapper
public interface PostDao {
	List<Post> getAll();
	Post getById(int id);
	void save(int boardId, Post post, int memberId);
	void delete(int id);
	void update(int id, Post post);
}
