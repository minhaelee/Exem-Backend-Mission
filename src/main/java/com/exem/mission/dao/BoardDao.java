package com.exem.mission.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.exem.mission.entity.Board;

@Mapper
public interface BoardDao {

	List<Board> getAll();
	Board getById(int id);
	void save(String title, int memberId);
	void delete(int id);
	void update(int id, String title);

}
