function pigLatinize( word )
{
	var vowels= /^[aeiou]/;
	var specialChars = /\W$/;
	var edited;

	if ( word.search( specialChars ) !== -1 )
	{
		if ( word.search( vowels ) == -1 )
		{
			edited = word.substring(1, word.length - 1) + word.substring(0, 1) + "ay" + word.substring( word.length - 1);
		}
		else
		{
			edited = word.substring(0, word.length-1) + "ay" + word.substring( word.length-1 );
		}
	}
	else
	{
		if ( word.search( vowels ) == -1 )
		{
			edited = word.substring(1) + word.substring(0,1) + "ay ";
		}
		else
		{
			edited = word + "ay";
		}
	}
	
	return edited;
}

function translateInput()
{
	var textvalue = document.getElementById("userInput").value;
	document.getElementById("translatorOutput").innerHTML = " ";
	var arr = textvalue.split(" ");
	var holder = "";
	for ( i = 0; i < arr.length; i++ )
	{	
		var word = pigLatinize( arr[i] );
		arr[i] = word;
	}
	document.getElementById("translatorOutput").innerHTML = arr.join(" ");
}

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