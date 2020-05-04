<%@ page language="java" import="java.util.*,com.chen.spider.util.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.chen.spider.model.*,com.alibaba.fastjson.*"%>    
<%
	//获取前端页码
	String pageNum = request.getParameter("pageNum");
	//图片类型
	String category = request.getParameter("category");
	//图片集合
	List<Image> images = SpiderUtil.queryImageList(category, pageNum);
	response.setContentType("text/html; charset=utf-8");
	out.print(JSONArray.toJSONString(images, true));
%>