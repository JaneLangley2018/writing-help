package com.jane.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;


@Entity
public class Post {
	
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String body;
	private String postedOn;
	
	//Author
	@ManyToOne
	private Customer author;
	
	//private no arg constructor is needed by JPA
	private Post(){
	
	}
	
	//public constructor makes sure a title is set when creating a new Post
	public Post(String title) {
		this.setTitle(title);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getPostedOn() {
		return postedOn;
	}

	public void setPostedOn(String postedOn) {
		this.postedOn = postedOn;
	}

	public Customer getAuthor() {
		return author;
	}

	public void setAuthor(Customer author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", body=" + body + ", postedOn=" + postedOn + ", author="
				+ author + "]";
	}
	
	
	
}
