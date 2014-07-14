$(document).ready(function(){
	$("#ssc").hide();
	$("#msc").blur(function(event) {
		var data = $("#msc").val();
		if (data == null || data == "") {
			$("#ssc").text("please input score!");
		}
		else {
			var score = parseInt(data);
			if (score > 100 || score < 0) {
				$("#ssc").show();
				event.preventDefault();
			}
			else {
				$("#ssc").hide();
			}
		}
	});
});
