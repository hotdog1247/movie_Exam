<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../include/mmcHeader.jsp"  %>
<style>
	.mo{
		width: 180px;
		height:281px;
		margin: 10px;
		float: left;
	}
	.mo img{
		width: 180px;
		height: 260px;
	}
	div a{
		text-decoration: none;
		text-align: center;
		color: steelblue;
	}
</style>
		<section>
			<div>
				<a href="add.do">상영영화 추가하기</a>
			</div>
			<c:forEach var="movie" items="${list}">
				<div class="mo">
					<a href="detail.do?mNo=${movie.mNo}"><img src="${pageContext.request.contextPath }/upload/${movie.mImg}"></a>
					<p>${movie.mName}</p>
				</div>
			</c:forEach>
		</section>
<%@ include file="../include/mmcFooter.jsp"  %>