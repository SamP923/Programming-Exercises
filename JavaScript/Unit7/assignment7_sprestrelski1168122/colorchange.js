var paragraph = document.getElementById("p");

var select = document.getElementById("chooseColors");

select.onchange = function(){
	var strUser = select.options[ select.selectedIndex ].value;
	switch(strUser)
	{
		case "purple":
			p.style.color = "#5B2C6F";
			p.style.backgroundColor = "#ABEBC6";
			break;
		case "black":
			p.style.color = "black";
			p.style.backgroundColor = "#F4D03F";
			break;
		case "red":
			p.style.color = "#C0392B";
			p.style.backgroundColor = "#58D68D";
			break;
		case "pink":
			p.style.color = "#FB98EF";
			p.style.backgroundColor = "#FFB963";
			break;

		default:
			document.write("Something went wrong!");
	}
}


