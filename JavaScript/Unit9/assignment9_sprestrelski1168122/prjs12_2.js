function startclock()
{
	var currentTime = new Date(),
		hours = currentTime.getHours(),
		mins = currentTime.getMinutes(),
		secs = currentTime.getSeconds(),
		ampm = (hours >= 12) ? "p.m." : "a.m.",
		
		cmonth = currentTime.getMonth(),
		cdate = currentTime.getDate(),
		cyear = currentTime.getFullYear(),
		clock_div = document.getElementById("my_clock");

	hours = (hours>=13) ? hours -= 12 : hoursl
	hours = (hours<1) ? 12 : hours;
	mins = (mins<10) ? "0" + mins : mins;
	secs = (secs<10) ? "0" + secs : secs;
	cmonth++;
	clock_div.innerHTML = hours + ":" + mins + ":" + secs + " " + ampm + " " + cmonth + "/" + cdate + "/" + cyear;

	setTimeout(function() { startclock(); }, 1000 );
}
startclock();