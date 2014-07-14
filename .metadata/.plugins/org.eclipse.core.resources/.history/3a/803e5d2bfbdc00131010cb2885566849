$(document).ready(function(){
	$("#error1").hide();
	$("#error2").hide();
	
	$("#username").blur(function(){
		var username = $("#username").val();
		if(username == null || username == "") {
			$("#error1").show();
			event.preventDefault();
		}else {
			$("#error1").hide();
		}
	});
	
	$("#password").blur(function(){
		var password = $("#password").val();
		if(password == null || password == "") {
			$("#error2").show();
			event.preventDefault();
		}else {
			$("#error2").hide();
		}
	});
});
