package com.tweetapp.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0/tweets")
public class tweetController {

	@PostMapping("/register")
	public String register() {
		return "register";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/all")
	public String getAllTweet() {
		return "Get all tweets";
	}

	@GetMapping("/users/all")
	public String getAllUsers() {
		return "Get All Users";
	}

	@GetMapping("/user/search/{username}")
	public String searchUser() {
		return "Search by username";
	}

	@GetMapping("/{username}")
	public String getAllTweetOfUser() {
		return "get all tweets of user";
	}

	@PostMapping("/{username}/add")
	public String addTweet() {
		return "Post a new tweet";
	}

	@PutMapping("/{username}/update/{id}")
	public String updateTweet() {
		return "update a tweet";
	}

	@DeleteMapping("/{username}/delete/{id}")
	public String deleteTweet() {
		return "delete a tweet";
	}

	@PutMapping("/{username}/like/{id}")
	public String likeTweet() {
		return "like a tweet";
	}

	@PostMapping("/{username}/reply/{id}")
	public String replyTweet() {
		return "reply a tweet";
	}
}