function say_true(){
window.alert('True!');
}
function say_false(){
window.alert('False!');
}
var is_false = document.getElementById("im_false");
	is_false.onmouseover = say_false;
var is_false = document.getElementById("im_false2");
	is_false.onmouseover = say_false;
var is_false = document.getElementById("im_false3");
	is_false.onmouseover = say_false;
var is_true = document.getElementById("im_true");
	is_true.onmouseover = say_true;