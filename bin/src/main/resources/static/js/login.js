const signUpButton = document.getElementById('signUp');
const signInButton = document.getElementById('signIn');
const upDirect = document.getElementById('upDirect');
const inDirect = document.getElementById('inDirect');
const container = document.getElementById('container2');

signUpButton.addEventListener('click', () => {
	container.classList.add("right-panel-active");
});

signInButton.addEventListener('click', () => {
	container.classList.remove("right-panel-active");
});

upDirect.addEventListener('click', () => {
	window.alert("Registration Successful !");
});

inDirect.addEventListener('click', () => {
	window.open("payment.html","_self");
});