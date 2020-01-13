function change_color()
{ 
	this.style.backgroundColor = "white";
}

function change_back()
{
	this.style.backgroundColor = null;
}

function text_color_change()
{
	this.style.backgroundColor = "black";
}

function text_color_back()
{
	this.style.backgroundColor = null;
}

window.onload = function()
{
	var user = prompt("What's your name?", "name");
	var thetext = "name:" + user;
	var nameholder = escape(thetext);
	nameholder = unescape(nameholder);
	document.getElementById("welcome_msg").innerHTML = user != null  && user != "" && user !="name"? "Welcome, " + nameholder.substring(5) + "!" : "Welcome!";
	/* An alternate way to do this would be:
	if ( user != null && user != "" && user != "name")
	{
		var thetext = "name:" + user;
		var nameholder = escape(thetext);
		nameholder = unescape(nameholder)
		document.getElementById("welcome_msg").innerHTML = "Welcome, " + nameholder.substring(5) + "!";
	}*/

	var d = new Date();
	document.getElementById("browserspecs").innerHTML = ( "You are using browser: " + navigator.appName + "<br>Version of your browser is: " + navigator.appVersion + "<br>Java is enabled in your browser: " + navigator.javaEnabled() + "<br>Full Date: " + d.toString() + "<br>Last Modified: " + document.lastModified + "<br>File Location: " + window.location + "<br>Width: " + window.outerWidth + "\tHeight: " + window.outerHeight );

	document.getElementById("browserspecs").addEventListener("mouseover", change_color );
	document.getElementById("browserspecs").addEventListener("mouseout", change_back );

	document.getElementById("datediv").addEventListener("mousedown", text_color_change );
	document.getElementById("datediv").addEventListener("mouseup", text_color_back );
	document.getElementById("datediv").innerHTML = d.toDateString();
}

