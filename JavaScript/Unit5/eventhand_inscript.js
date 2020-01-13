function say_true(){
window.alert('True!');
}
function say_false(){
window.alert('False!');
}

document.getElementById("im_false").onmouseover = say_false;
document.getElementById("im_false2").onmouseover = say_false;
document.getElementById("im_false3").onmouseover = say_false;
document.getElementById("im_true").onmouseover = say_true;

