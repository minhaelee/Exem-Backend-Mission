package com.exem.mission.service;

import com.exem.mission.entity.Member;

public interface MemberService {

	// 멤버 등록
	void reg(Member member);
	// 멤버 조회
	Member get(String email);
	// 멤버 탈퇴
	void withdraw(String email);
	// 멤버 정보 수정
	void update(Member member);


}
