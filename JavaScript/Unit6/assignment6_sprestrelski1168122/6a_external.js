
function SimpleInterest(c, p, t, r)
{
	customer = c;
	principal = p;
	time = t;
	rate = r;
	var interest = calculate_interest(customer, principal, rate, time);
	
	switch(customer)
	{
		case "Tom":
			var Tom_interest_value = interest;
			break;
		case "John":
			var John_interst_value = interest;
			break;
		default:
			document.write("Something went wrong!");
	}
}

function calculate_interest( customer, principal, rate, time )
{
	document.write( "Customer Name: " + customer + "<br>" );
	var simple_interest = ( principal * rate * time ) 
	simple_interest /= 100;
	document.write( "Interest is: " + simple_interest + "%<br>" );
	return simple_interest;
}

var Tom_interest = new SimpleInterest( "Tom", 1000, 3, .08);
var John_interest = new SimpleInterest("John", 2000, 3, 0.04);

if ( Tom_interest.interest> John_interest.interest )
{
	document.write("Tom's interest earned is more than that of John's.");
}
else if( Tom_interest.interest < John_interest.interest)
{
	document.write("John's interest earned is more that that of Tom's.");
}
else
{
	document.write("Tom and John earn equal interest.");
}
	