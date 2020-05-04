package com.chen.spider.model;

/**
 * 图片实体
 * 
 * @author 26612
 *
 */
public class Image {

	private String shortUrl;// 小图地址

	private String oriUrl;// 大图地址

	private String title;// 图片标题

	public String getShortUrl() {
		return shortUrl;
	}

	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}

	public String getOriUrl() {
		return oriUrl;
	}

	public void setOriUrl(String oriUrl) {
		this.oriUrl = oriUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
