package com.exem.mission.controller;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exem.mission.entity.Board;
import com.exem.mission.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService boardService;

	@GetMapping("list")
	public String list(){
		List<Board> list = boardService.getList();
		return "board/list";
	}

	@PostMapping
	public String create(String title, String username){

		boardService.reg(title, username);

		return "board/list";
	}

	@DeleteMapping("{id}")
	public String delete(@PathVariable int id){

		boardService.delete(id);

		return "board/list";
	}

	@PutMapping("{id}")
	public String edit(@PathVariable int id, String title){
		boardService.update(id, title);
		return "board/list";
	}

}
