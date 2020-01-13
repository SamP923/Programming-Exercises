//Instead of just making a master username and password for this assignment, I chose to have user input for more flexibility if I ever add on to this assignment. Hope that's okay!

var username = prompt("Create a username!", "");
var password = prompt("Create a password!", "");

function prompt_confirm()
{
	//gets the input from the text fields
	var usernameAsk = document.getElementById("usernameInput").value;
	var passwordAsk = document.getElementById("passwordInput").value;
	
	//case: fields left blank
	if ( usernameAsk == "" || passwordAsk == "")
	{
		alert("Please enter all data!");
	}
	else
	{
		if ( username == usernameAsk ){
			if ( password == passwordAsk )
			{
				myWindow = window.open('', 'password_window', 'width-600, height=600');
				myWindow.document.write("<script type='text/javascript' src='multi.js'></script>");
				myWindow.document.write("<input type='button' onclick='multitables()' value='multiplication tables'/>" );
				myWindow.document.write("<input type='button' onclick='self.close()' value='close window'/>" );
			}
			else
			{
				//case: password does not match
				alert("Access denied.");
			}
		}
		else {
			//case: username not recognized
			alert("No records of this username.");
		}
	}
}