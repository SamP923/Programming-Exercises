function euler()
{
	window.alert( Math.E );
}

function checktext()
{
	var textvalue = document.getElementById("textarea").value;
	var symbolPos = textvalue.indexOf("@");
	if ( symbolPos >= 0 )
	{
		alert( "I found your @ symbol. You wrote " +  textvalue.length + " characters. The @ symbol was character number " + symbolPos + "." );
	}
	else {
		alert("You did not write an @ symbol. Can't fool me that easily!");
	}
}