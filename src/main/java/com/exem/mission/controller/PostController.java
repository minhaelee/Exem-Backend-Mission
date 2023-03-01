package com.exem.mission.controller;

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
import com.exem.mission.entity.Post;
import com.exem.mission.service.BoardService;
import com.exem.mission.service.PostService;

@Controller
@RequestMapping("/board/{id}")
public class PostController {

	@Autowired
	private BoardService boardService;
	@Autowired
	private PostService postService;

	@GetMapping
	public String list(){
		List<Post> list = postService.getList();
		return "board/{id}";
	}

	@GetMapping("/{postId}")
	public String get(@PathVariable int postId){
		postService.get(postId);
		return "board/{id}/{postId}";
	}
	@PostMapping
	public String create(@PathVariable(value = "id") int boardId, Post post){

		postService.reg(boardId, post);
		int postId = post.getId();
		return "board/{id}"+postId;
	}
	@DeleteMapping("{postId}")
	public String delete(@PathVariable(value = "postId") int id){

		postService.delete(id);
		return "board/{id}";
	}

	@PutMapping("{postId}")
	public String edit(@PathVariable(value = "postId") int id, Post post){
		postService.update(id, post);
		return "board/{id}/{postId}";
	}

}
