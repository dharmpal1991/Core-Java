var USER = {
		
	submitFunction : function(){
		var userRegistration = {};
		userRegistration.username = $("#user_name").val();
		userRegistration.firstname = $("#first_name").val();
		userRegistration.lastname = $("#last_name").val();
		userRegistration.email = $("#email_id").val();
		userRegistration.country = $("#country_id ").find("option:selected").val();
		userRegistration.address = $("#id_address").val();
		userRegistration.password = $("#password").val();
		console.log(JSON.stringify(userRegistration));
		
		$.ajax({
			url :"/WEB/userRegistration",
			type :"POST",
			data :{"userRegistration":JSON.stringify(userRegistration)},
			dataType :'json',
			success :function(response){
				alert(response);
				var str = JSON.stringify(response);
				alert(str);
				console.log(str);
			},
			error :function(e){
				console.log(e);
				alert(e);
	       }
		});
		
 	},	
 	
};