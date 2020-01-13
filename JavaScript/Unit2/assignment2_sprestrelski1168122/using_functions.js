var myheading = "This is my webpage!";
var text = "This JavaScript file makes use of Variables!";
var linktag = "http://www.google.com";
var begineffect = "<em>";
var endeffect = "</em>";
var linebreak = "<br/>";

function funct_variable( myheading, text, linktag, begineffect, endeffect, linebreak )
{
	document.write( begineffect + myheading + endeffect + linebreak + text + linebreak + linktag );
}

funct_variable( myheading, text, linktag, begineffect, endeffect, linebreak );