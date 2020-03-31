<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<style>
	#sel{
		float: left;
		padding-right: 20px;
	}	
</style>
<%@ include file="../include/mmcHeader.jsp"  %>
		<section>
			<img src="${pageContext.request.contextPath }/upload/${item.mImg}">
			<h1>${item.mName}</h1><br><br>
			<p><b>줄거리</b></p><br><br>
			<p>${item.mContent }</p>
		</section>
<%@ include file="../include/mmcFooter.jsp"  %>