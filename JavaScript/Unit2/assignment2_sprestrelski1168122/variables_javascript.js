var myheading = "This is my webpage!";
var text = "This JavaScript file makes use of Variables!";
var linktag = "http://www.google.com";
var begineffect = "<em>";
var endeffect = "</em>";
var linebreak = "<br/>";

document.write( "<h2 style=\"color: red\">" + myheading + "</h2>" + linebreak );
document.write( begineffect + "<span style=\"color: green\">" + text + "</span>" + endeffect + linebreak );
document.write( "<a href=" + linktag + ">" + linktag + "</a>" + linebreak );
