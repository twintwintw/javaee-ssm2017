<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Questionnaire</title>
</head>
<body>
	<div class="col-md-9 col-md-offset-3">
		<form>
			<c:forEach items="${questionnaire.questionSet}" var="question"
				varStatus="status">
				<div style="margin-bottom: 30px;" class="col-md-12">
					<div style="margin-bottom: 20px;" class="col-md-12">
						<Strong><c:out value="${status.index + 1}"></c:out>.${question.content}</Strong>
					</div>
					<c:forEach items="${question.optionSet}" var="option" varStatus="status2">
						<div style="margin-bottom: 20px;" class="col-md-6">
							<input class="submit_answer" type="radio" name="${question.id}" value="${option.id}" /> <span>${optionMap.get(status2.index)}.${option.content}</span>
						</div>
					</c:forEach>
				</div>
			</c:forEach>
		</form>
			<div>
				<button class="btn btn-primary btn-lg active" id="submit-btn">提交</button>
			</div>
	</div>
<script type="text/javascript">
	$(function(){
		$("input:radio:checked").each(function() {
			  alert($(this).val());
		});
		$('#submit-btn').click(function(){
		});
	})
</script>	
</body>
</html>
