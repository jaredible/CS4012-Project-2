<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<%@ include file="partials/head.jsp" %>
	</head>
	<body>
		<div class="container py-5">
			<h1 class="title mb-5">Math Problems</h1>
			<hr>
			<c:forEach var="problem" items="${problems}" varStatus="status">
				<div class="row problem-space">
					<div class="col-sm-2">
						<h1>${status.index + 1}.</h1>
						<small class="problem-id text-muted">(${problem.id})</small>
					</div>
					<div class="col-sm-10 d-flex align-items-center">
						<span class="problem-content">${problem.content}</span>
					</div>
				</div>
				<hr>
			</c:forEach>
		</div>
		
		<%@ include file="partials/scripts.jsp" %>
	</body>
</html>