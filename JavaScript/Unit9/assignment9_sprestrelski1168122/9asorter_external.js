function sortAlpha()
{
	var input = document.getElementById("textfield").value;
	var inputArray = input.split( " " );
	inputArray.sort();
	document.getElementById("output").innerHTML = inputArray.join("<br>");
}

function sortNumber(a, b)
{
	return a - b;
}

function sortNum()
{
	var input = document.getElementById("textfield").value;
	var inputArray = input.split( " " );
	inputArray = inputArray.sort(sortNumber);
	document.getElementById("output").innerHTML = inputArray.join("<br>");
}