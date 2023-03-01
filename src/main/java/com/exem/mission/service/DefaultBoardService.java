package com.exem.mission.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exem.mission.dao.BoardDao;
import com.exem.mission.dao.MemberDao;
import com.exem.mission.entity.Board;
import com.exem.mission.entity.Member;

@Service
public class DefaultBoardService implements BoardService{

	@Autowired
	private BoardDao dao;
	@Autowired
	private MemberDao memberDao;

	@Override
	public List<Board> getList() {
		return dao.getAll();
	}

	@Override
	public void reg(String title, String username) {
		Member member = memberDao.findByUsername(username);
		dao.save(title, member.getId());
	}

	@Override
	public void delete(int id) {
		dao.delete(id);
	}

	@Override
	public void update(int id, String title) {
		dao.update(id, title);
	}
}
