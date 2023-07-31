package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer reg;
	private String name;
	private String authorname;
	private String title;
	private long publishedyear;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getReg() {
		return reg;
	}

	public void setReg(Integer reg) {
		this.reg = reg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getPublishedyear() {
		return publishedyear;
	}

	public void setPublishedyear(long publishedyear) {
		this.publishedyear = publishedyear;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", reg=" + reg + ", name=" + name + ", authorname=" + authorname + ", title="
				+ title + ", publishedyear=" + publishedyear + "]";
	}

	
	

	

}