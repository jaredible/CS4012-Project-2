var problemInput = document.getElementById("problemInput");
var newProblemForm = document.getElementById("newProblemForm");
var newProblemContent = document.getElementById("newProblemContent");
var generateReportButton = document.getElementById("generateReportButton");

problemInput.addEventListener("keypress", submitNewProblem);
generateReportButton.addEventListener("click", generateReport);

var problemIds = new Set();

function submitNewProblem(event) {
	if(event.which === 13 && !event.shiftKey) {
		event.preventDefault();
		newProblemContent.value = problemInput.value;
		newProblemForm.submit();
    }
}

function generateReport(event) {
	if (problemIds.size !== 0) {
		var url = new URL(window.location.href.replace("problem", "report"));
		var queryString = url.search;
		var searchParams = new URLSearchParams(queryString);

		searchParams.append("ids", Array.from(problemIds).join(","));
		url.search = searchParams.toString();

		var newUrl = url.toString();
		window.open(newUrl);
	}
}

function selectProblem(element, problemId) {
	var pid = parseInt(problemId);
	if (problemIds.has(pid)) {
		problemIds.delete(pid);
		element.closest("li").classList.remove("selected");
	} else {
		problemIds.add(pid);
		element.closest("li").classList.add("selected");
	}
	
	generateReportButton.disabled = problemIds.size === 0;
}