<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<%@ include file="partials/head.jsp" %>
	</head>
	<body class="gradient">
		<div class="problem-wrapper">
			<div class="problem-container">
				<h1 class="title">New Math Problem</h1>
				
				<div class="problem-create">
					<textarea id="problemInput" class="form-control" name="problem-content" rows="3" placeholder="Type a problem and press enter . . .">${problem.content}</textarea>
				</div>
				
				<c:if test="${not empty newProblemContentError}">
					<div class="alert alert-danger alert-dismissible">
						<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
						<strong>Error!</strong> ${newProblemContentError}
					</div>
				</c:if>
				
				<button id="generateReportButton" class="btn btn-block btn-default" disabled>Generate report</button>
				
				<h1 class="title">Math Problems</h1>
				
				<ul class="problem-list">
					<c:forEach var="problem" items="${problems}" varStatus="status">
						<li class="">
							<div class="problem-row">
								<div>
									<a class="problem-selected" onclick="selectProblem(this, ${problem.id})">
										<i class="material-icons toggle-selected-checkbox"></i>
									</a>
									<h5 class="problem-id">${problem.id}</h5>
								</div>
								<span class="problem-content">${problem.content}</span>
							</div>
						</li>
					</c:forEach>
				</ul>
				
				<c:if test="${empty problems}">
					<div class="no-problems">
						<p>No problems</p>
					</div>
				</c:if>
			</div>
		</div>
		
		<form:form id="newProblemForm" action="" method="POST" modelAttribute="problem">
			<form:input id="newProblemContent" type="hidden" path="content" />
		</form:form>
		
		<footer class="footer-fixed">
			&copy; 2020 <a href="https://www.jaredible.net" target="_blank">Jaredible</a>
		</footer>
		
		<%@ include file="partials/scripts.jsp" %>
		<script src="<c:url value="/resources/js/problem.js" />"></script>
		<script type="text/javascript" color="255,255,255" opacity='1' zIndex="-1" count="60" src="<c:url value="/resources/js/canvas-nest.js" />"></script>
	</body>
</html>