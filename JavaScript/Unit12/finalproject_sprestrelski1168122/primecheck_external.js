function isPrime( numToCheck)
{
	for (var i = 2; i < numToCheck; i++ ) 
	{
		if ( numToCheck % i === 0 ) 
		{
			document.getElementById("outputPrime").innerHTML = "Not prime.";
			break;
		}
		else
		{
			document.getElementById("outputPrime").innerHTML = "Prime!";
		}	
	}
	
}

function checknumber()
{
	if ( document.getElementById("primecheckfield").value.search( /(\d{5})/ ) == -1 )
	{
		document.getElementById("outputPrime").innerHTML = "Please enter a valid 5 digit number!";
	}
	else
	{
		var primeInt = parseInt( document.getElementById("primecheckfield").value );
		isPrime( primeInt );	
	}
}
