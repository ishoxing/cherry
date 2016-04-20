package com.cherry.privilege.api.pojo;

import java.io.Serializable;

public class Menus implements Serializable {

	private Integer id;

	private String name;

	private String url;

	private Integer parent;

	private String describes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url == null ? null : url.trim();
	}

	public Integer getParent() {
		return parent;
	}

	public void setParent(Integer parent) {
		this.parent = parent;
	}

	public String getDescribes() {
		return describes;
	}

	public void setDescribe(String describe) {
		this.describes = describes == null ? null : describes.trim();
	}

}