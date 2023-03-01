package com.exem.mission.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exem.mission.dao.BoardDao;
import com.exem.mission.dao.CommentDao;
import com.exem.mission.dao.PostDao;
import com.exem.mission.entity.Board;
import com.exem.mission.entity.Comment;
import com.exem.mission.entity.Post;

@Service
public class DefaultCommentService implements CommentService {

	@Autowired
	private CommentDao dao;
	@Autowired
	private PostDao postDao;

	@Override
	public List<Comment> getList(int postId) {
		return dao.getByPost(postId);
	}

	@Override
	public Comment get(int id) {
		return dao.getById(id);
	}

	@Override
	public void reg(int postId, String content) {
		Post post = postDao.getById(postId);
		dao.save(postId, content, post.getMemberId());
	}

	@Override
	public void delete(int id) {
		dao.delete(id);
	}

	@Override
	public void update(int id, String content) {
		dao.update(id, content);
	}
}
