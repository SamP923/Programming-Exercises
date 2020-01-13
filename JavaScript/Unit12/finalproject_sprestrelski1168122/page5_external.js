function closewin()
{
	if ( false == myWindow.closed )
	{
		myWindow.close();
	}
	else
	{
		alert("Window not open.");
	}
}

function nameRetrieval()
{
	alert( myWindow.name );
}

function printHoroscopes( d, m )
{
	var day = parseInt(d) - 1;
	var month = parseInt(m) - 1;
	var zod_signs = [ "Capricorn", "Aquarius", "Pisces", "Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius" ];
	var zodInfoColors = [ "Brown, Black", "Light-Blue, Silver", "Mauve, Lilac", "Red", "Green, Pink", "Light-Green, Yellow", "White", "Gold, Orange", "Grey, Beige", "Pink, Green", "Scarlet, Rust", "Blue" ];

	var zodInfoDateRange = [ "December 22nd - January 19th", "January 20th - February 18th", "February 19th - March 20th", "March 21st - April 19th", "April 20th - May 20th", "May 21st - June 20th", "June 21st - July 22nd", "July 23rd - August 22nd", "August 23rd - September 22nd", "September 23rd - October 22nd", "October 23rd - November 21st", "November 22nd - December 21st" ];

	var zodInfoStrengths = [ "Responsible, disciplined, self-control", "Progressive, original, independent", "Compassionate, artistic, intuitive", "Courageous, determined, confident", "Reliable, patient, practical", "Gentle, affectionate, curious", "Highly imaginative, loyal, emotional", "Creative, passionate, generous", "Loyal, analytical, kind", "Diplomatic, gracious, fair-minded", "Resourceful, brave, passionate", "Generous, idealistic, great sense of humor" ];

	var zodInfoLuckyNums = [ "4, 8, 13, 22", "4, 7, 11, 22, 29", "3, 9, 12, 15, 18, 24", "1, 8, 17", "2, 6, 9, 12, 24", "5, 7, 14, 23", "2, 3, 15, 20", "1, 3, 10, 19", "4, 14, 15, 23, 32", "4, 6, 13, 15, 24", "8, 11, 18, 22", "3, 7, 9, 12, 21" ];

	var switchForInfo = 0;
	var vowels = "";

	switch ( month )
	{
		case 0: 
			switchForInfo = day < 22 ? 0 : 1;
			break;
		case 1: 
			switchForInfo = day < 19 ? 1 : 2;
			break;
		case 2: 
			switchForInfo = day < 21 ? 2 : 3;
			break;
		case 3:
			switchForInfo = day < 20 ? 3 : 4;
			break;
		case 4:
			switchForInfo = day < 21 ? 4 : 5;
			break;
		case 5:
			switchForInfo = day < 21 ? 5 : 6;
			break;
		case 6:
			switchForInfo = day < 23 ? 6 : 7;
			break;
		case 7:
			switchForInfo = day < 23 ? 7 : 8;
			break;
		case 8:
			switchForInfo = day < 23 ? 8 : 9;
			break;
		case 9:
			switchForInfo = day < 23 ? 9 : 10;
			break;
		case 10:
			switchForInfo = day < 22 ? 10 : 11;
			break;
		case 11:
			switchForInfo = day < 22 ? 11 : 0;
			break;
		default:
			zodiacSign = "Something went wrong!";
	}

	if ( switchForInfo == 3 || switchForInfo == 4 )
	{
		vowels = "an ";
	}
	else
	{
		vowels = "a ";
	}

	myWindow = window.open('', 'horoscope_window', 'width=600, height=200');
	myWindow.document.write("<script type='text/javascript' src='horoscopes_external.js'></script>");
	myWindow.document.write("You are " + vowels + zod_signs[switchForInfo] + "!<br><br>Your traits:<br>Colors: " + zodInfoColors[switchForInfo] + "<br>Date range: " + zodInfoDateRange[switchForInfo] + "<br>Strengths: " + zodInfoStrengths[switchForInfo] + "<br>Lucky Numbers: " + zodInfoLuckyNums[switchForInfo] );
	myWindow.document.write("<br><br><input type='button' onclick='self.close()' value='close window'/>");

}

function calculate()
{
	var flag = true;
	month = document.getElementById("month").value;
	day = document.getElementById("day").value;
	if ( month < 1 || month > 12 || month == "")
	{
		month = Number.NaN;
		alert( month + ". Not a valid month.");
		flag = false;
	}
	if ( day < 0 || day > 31 || day == "")
	{
		day = Number.NaN;
		alert( day + ". Not a valid day.");
		flag = false;
	}

	if ( flag == true )
	{
		printHoroscopes( day, month );
	}
}