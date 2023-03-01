package com.exem.mission.dao;

import org.apache.ibatis.annotations.Mapper;

import com.exem.mission.entity.Member;

@Mapper
public interface MemberDao {
	void save(Member member);
	Member findByEmail(String email);
	void updateStatus(String email);
	void updateInfo(Member member);
}
