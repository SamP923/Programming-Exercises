function startclock()
{
	var currentTime = new Date(),
		hours = currentTime.getHours(),
		mins = currentTime.getMinutes(),
		secs = currentTime.getSeconds(),
		ampm = (hours >= 12) ? "P.M." : "A.M.";
	
	mins = (mins<10) ? "0" + mins : mins;
	secs = (secs<10) ? "0" + secs : secs;
	if ( document.getElementById("24_hour").checked == false )
	{
		hours = (hours>=13) ? hours -= 12 : hours;
		hours = (hours<1) ? 12 : hours;
		document.getElementById("displayTime").value = hours + ":" + mins + ":" + secs + " " + ampm;
	}
	else{
		document.getElementById("displayTime").value = hours + ":" + mins + ":" + secs;
	}
	setTimeout(function() { startclock(); }, 10 );
	
}
startclock();
document.getElementById("12_hour").checked = true;