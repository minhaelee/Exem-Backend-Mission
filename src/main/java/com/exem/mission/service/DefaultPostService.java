package com.exem.mission.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exem.mission.dao.BoardDao;
import com.exem.mission.dao.PostDao;
import com.exem.mission.entity.Board;
import com.exem.mission.entity.Post;

@Service
public class DefaultPostService implements PostService {

	@Autowired
	private PostDao dao;
	@Autowired
	private BoardDao boardDao;

	@Override
	public List<Post> getList() {

		return dao.getAll();
	}

	@Override
	public Post get(int id) {
		return dao.getById(id);
	}

	@Override
	public void reg(int boardId, Post post) {
		Board board = boardDao.getById(boardId);
		dao.save(boardId, post, board.getMemberId());
	}

	@Override
	public void delete(int id) {
		dao.delete(id);
	}

	@Override
	public void update(int id, Post post) {
		dao.update(id, post);
	}

}
