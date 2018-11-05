package com.jane.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.List;


import javax.persistence.GeneratedValue;

@Entity
public class Customer{

		@Id
		@GeneratedValue
		private Long id;
		private String firstName;
		private String lastName;
		
		//posts
		@OneToMany(mappedBy = "author")
		private List<Post> posts;
	
		
		public List<Post> getPosts(){
			return posts;
		}
		
		public void setPosts(List<Post> posts) {
			this.posts = posts;
		}
		
		private Customer() {
			
		}

		public Customer(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public String getFirstName() {
			return firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		@Override
			public String toString() {
			return String.format(
			"Author [firstName='%s',lastName= '%s']",
				firstName, lastName);
		}

}

	