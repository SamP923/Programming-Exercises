var passAsk = prompt("What's the password?");
//password is password
if ( passAsk !== "password" )	
{
	alert("Incorrect password! You will now be directed to the homepage.");
	window.location = "http://www.google.com";
}