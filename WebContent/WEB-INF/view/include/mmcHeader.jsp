<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	*{
		padding: 0;
		margin: 0;
	}
	#container{
		width: 1000px;
		margin: 0 auto;
	}
	header{
		height: 132px;
		overflow: hidden;
	}
	header h1{
		color: white;
		background-color: steelblue;
		height: 50px;
		line-height: 50px;
		text-align: center;
	}
	header #p1{
		background-color: steelblue;
		text-align: right;
	}
	header #p1 a{
		text-decoration: none;
		color: white;
		padding-right: 20px;
	}
	header .p2{
		background-color: steelblue;
		height: 50px;
		line-height: 50px;
		width: 33.33%;
		float: left;
		text-align: center;
	}
	header .p2 a{
		text-decoration: none;
		font-size: 1.5em;
		color: white;
	}
	section{
		width: 800px;
		margin: 20px auto;
		overflow: hidden;
	}
	section #homeImg{
		width: 100%;
	}
	footer{
		clear:both;
		height: 100px;
		line-height: 50px;
		text-align: center;
		background-color: steelblue;
		color: white;
	}
</style>
</head>
<body>
	<div id="container">
		<header>
			<h1>MMC 만경관</h1>
			<p class="p2"><a href="home.do">HOME</a></p>
			<p class="p2"><a href="list.do">상영영화</a></p>
			<p class="p2"><a href="time.do">상영시간표</a></p>		
		</header>