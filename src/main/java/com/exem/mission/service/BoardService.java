package com.exem.mission.service;

import java.util.List;

import com.exem.mission.entity.Board;

public interface BoardService {

	List<Board> getList();
	void reg(String title, String username);
	void delete(int id);
	void update(int id, String title);
}
