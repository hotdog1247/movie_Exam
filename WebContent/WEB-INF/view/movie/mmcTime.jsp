<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
table {
	border-collapse: collapse;
	width: 100%;
}

th, td {
	border: 1px solid steelblue;
}

h1 {
	text-align: center;
}
</style>
<%@ include file="../include/mmcHeader.jsp"%>
<section>
	<h1>상영시간표</h1>
	<c:forEach var="movie" items="${list}">
		<table class="item">
			<tr>
				<td>${movie.mName}</td>
				<td>${movie.mTime}</td>
			</tr>
		</table>
	</c:forEach>
</section>
<%@ include file="../include/mmcFooter.jsp"%>