function convert()
{
	var celcius = document.getElementById("celcius").value;
	var farenheit = document.getElementById("farenheit").value;

	if ( celcius == "" && farenheit == "" )
	{
		alert("Please enter at least one value!");
	}
	else if( celcius == "")
	{
		celcius = Math.round( ( farenheit - 32 ) * 5/9);
		document.getElementById("celcius").value = celcius;
	}
	else if( farenheit == "")
	{
		farenheit = Math.round( celcius * 9/5 + 32 );
		document.getElementById("farenheit").value = farenheit;
	}
	else
	{
		alert( "You've entered two values!");
	}
}

function clear_input()
{
	document.getElementById("farenheit").value = "";
	document.getElementById("celcius").value = "";
}