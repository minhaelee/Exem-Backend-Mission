package com.exem.mission.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exem.mission.entity.Comment;
import com.exem.mission.service.BoardService;
import com.exem.mission.service.CommentService;
import com.exem.mission.service.PostService;

@RestController
@RequestMapping("/api")
public class CommentApi {

	@Autowired
	private CommentService commentService;
	@Autowired
	private PostService postService;
	@Autowired
	private BoardService boardService;

	@GetMapping("/{postId}")
	public List<Comment> list(@PathVariable int postId){

		List<Comment> list = commentService.getList(postId);
		return list;
	}

	@PostMapping("/{postId}")
	public List<Comment> post(@PathVariable(value = "postId") int postId, String content){
		commentService.reg(postId, content);
		return list(postId);
	}

	@DeleteMapping("/{postId}/{id}")
	public List<Comment> delete(@PathVariable(value = "postId") int postId, @PathVariable(value = "id") int id){

			commentService.delete(id);
			return list(postId);
	}

	@PutMapping("/{postId}/{id}")
	public List<Comment> update(@PathVariable(value = "postId") int postId, @PathVariable(value = "id") int id, String content){
			commentService.update(id, content);
			return list(postId);
	}

}
