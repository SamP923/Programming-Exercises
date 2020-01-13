var urls = [ "http://www.scripttheweb.com", "http://www.webxpertz.net", "http://www.duckduckgo.com", "http://www.yahoo.com", "http://www.google.com" ];
var rdiv = document.getElementById("random_link");
var rand = Math.floor( Math.random()*5 );
rdiv.innerHTML = '<a href="' + urls[rand] + '">Random Site!</a>';