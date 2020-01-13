var password = "password";
var flag = false;
while( !flag )
{
	var passwordAsk = prompt("What's the password?");
	if ( passwordAsk == "" )
	{
		alert("Please enter the password!");
	}
	else if( passwordAsk != password )
	{
		alert("Sorry, that's not the right password.");
		window.history.back();
		flag = true;
	}	
	else
	{
		flag = true;
	}
}