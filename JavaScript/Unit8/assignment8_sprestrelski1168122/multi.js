function multitables()
{
	var table, index;
	for( table = 5; table <=10; table++)
	{
		document.write("<br>");
		for( index = 1; index <= 10; index++ )
		{
			document.write( table + "x" + index + "=" + (index*table) +"<br>");
		}
	}
}