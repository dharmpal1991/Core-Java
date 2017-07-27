var STUDENTUPDATION = {
		
	updateFunction : function(){
		var studentUpdation = {};
		studentUpdation.id = $("#id").val();
		studentUpdation.firstName = $("#first_name").val();
		studentUpdation.lastName = $("#last_name").val();
		studentUpdation.fullName = $("#full_name").val();
		studentUpdation.email = $("#email").val();
		studentUpdation.gender = $("#gender").find("option:selected").val();
		studentUpdation.country = $("#country").find("option:selected").val();
		studentUpdation.state = $("#state").find("option:selected").val();
		studentUpdation.city = $("#city").find("option:selected").val();
		studentUpdation.address = $("#address").val();
		studentUpdation.zipcode = $("#zip_code").val();
		studentUpdation.contactno = $("#contact_no").val();
		console.log(JSON.stringify(studentUpdation));
		
		$.ajax({
			url :"/StudentRegistration/studentUpdation",
			type :"POST",
			data :{"studentUpdation":JSON.stringify(studentUpdation)},
			dataType :'json',
			success :function(response){
				var str = JSON.stringify(response);
			},
			error :function(e){
	       }
		});
		
 	},	
 	
};