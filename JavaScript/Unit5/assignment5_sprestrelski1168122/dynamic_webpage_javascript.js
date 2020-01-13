function cat_handler(){

	window.alert('Meow!');
}

function dog_handler(){

	window.alert('Woof!');
}

function what_did_you_do(){
	
	window.alert('Nope! Try again.');
}

document.getElementById("cat").onclick = cat_handler;
document.getElementById("dog").onclick = dog_handler;
document.getElementById("wrong_answer").onclick = what_did_you_do;