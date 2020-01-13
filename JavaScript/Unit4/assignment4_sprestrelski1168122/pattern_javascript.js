var count = 1;
while( count<=7 )
{
	var i = 0;
	while(i < count)
	{
		document.write("*");
		i++;
	}
	count++;
	document.write( "<br>");
}

while( count > 1 )
{
	var j = 2;
	while( j  <count )
	{
			document.write("*");
			j++;
	}
	count--;
	document.write( "<br>");
}