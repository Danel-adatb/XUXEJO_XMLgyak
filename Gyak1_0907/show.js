$(document).ready(function() {
	//To show and hide datas
	$(".showdiv").click(function () {
		var index = $(this).attr("id");
		var action = 'data';
		
		$.ajax({
			url: 'content.php',
			method: 'POST',
			data:{action: action, index: index},
			success:function(response) {
				$("#content").html(response);
				$(".display").show();
			}
		});
		
	});    
});