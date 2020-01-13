var num1 = 17;
var num2 = "17";
var string1 = "Sam";
var string2 = "Not Sam";
var changed = "were originally ";

function writeYourVariables()
{
	document.write( "Your numbers " + changed + num1 + " and " + num2 + ".<br/>");
	document.write( "Your strings " + changed + string1 + " and " + string2 + ".<br/>");
}

writeYourVariables();

if ( !( num1 === num2 ) && ( string1 != string2 ) )
{
	window.alert("We humbly request different variables.");
	window.alert("Look what you made me do.");
	num1 += 5972;
	num2 = parseInt( num2, 10 );
	num2 = num2 - num1;
	string2 = string1;
	changed = "are now ";
	writeYourVariables();
	
}
else
{
	window.alert("Oops!" );
}