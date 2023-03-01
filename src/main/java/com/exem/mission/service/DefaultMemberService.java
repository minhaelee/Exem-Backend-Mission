package com.exem.mission.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exem.mission.dao.MemberDao;
import com.exem.mission.entity.Member;

@Service
public class DefaultMemberService implements MemberService{

	@Autowired
	private MemberDao memberDao;

	@Override
	public void reg(Member member) {
		memberDao.save(member);
	}

	@Override
	public Member get(String email) {

		return memberDao.findByEmail(email);
	}

	@Override
	public void withdraw(String email) {
		memberDao.updateStatus(email);
	}

	@Override
	public void update(Member member) {
		memberDao.updateInfo(member);
	}
}
