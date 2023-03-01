package com.exem.mission.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exem.mission.entity.Member;
import com.exem.mission.service.MemberService;

@Controller
@RequestMapping("/user")
public class MemberController {

	@Autowired
	private MemberService memberService;

	@PostMapping("join")
	public String join(@RequestBody Member member){

		memberService.reg(member);

		return "/user/login";
	}

	@PostMapping("login")
	public String login(String email, String pwd){

		return "/board";
	}

	@PutMapping("edit")
	public String edit(@RequestBody Member member){

		memberService.update(member);

		return "/user/edit";
	}

	@PutMapping("withdraw")
	public String withdraw(String email){

		memberService.withdraw(email);

		return "index";
	}

}
