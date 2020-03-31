<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/mmcHeader.jsp"  %>
<style>
	label {
		width: 100px;
		float: left;
	}
	
	fieldset {
		width: 600px;
		margin: 0 auto;
	}
	fieldset p{
		
	}
</style>
	<section>
		<form action="add.do" method="post" enctype="multipart/form-data">
			<fieldset>
				<legend>영화 정보</legend>
				<p>
					<label>제목</label> <input type="text" name="mName">
				</p>
				<p>
					<label>설명</label>
					<textarea rows="10" cols="40" name="mContent"></textarea>
				</p>
				<p>
					<label>파일</label> <input type="file" name="mImg">
				</p>
				<p>
					<label>시간</label> <input type="text" name="mTime"><input type="submit" value="전송">
				</p>
			</fieldset>
		</form>
	</section>
<%@ include file="../include/mmcFooter.jsp"  %>