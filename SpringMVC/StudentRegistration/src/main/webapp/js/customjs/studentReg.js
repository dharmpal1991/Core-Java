var STUDENT = {
		
	registerFunction : function(){
		var studentRegistration = {};
		studentRegistration.firstName = $("#first_name").val();
		studentRegistration.lastName = $("#last_name").val();
		studentRegistration.fullName = $("#full_name").val();
		studentRegistration.email = $("#e_mail").val();
		studentRegistration.password = $("#password").val();
		studentRegistration.gender = $("#gender").find("option:selected").val();
		studentRegistration.country = $("#country").find("option:selected").val();
		studentRegistration.state = $("#state").find("option:selected").val();
		studentRegistration.city = $("#ci_ty").find("option:selected").val();
		studentRegistration.address = $("#address").val();
		studentRegistration.zipcode = $("#zip_code").val();
		studentRegistration.contactno = $("#contact_no").val();
		console.log(JSON.stringify(studentRegistration));
		
		$.ajax({
			url :"/StudentRegistration/studentSubmittionForm",
			type :"POST",
			data :{"studentRegistration":JSON.stringify(studentRegistration)},
			dataType :'json',
			success :function(response){
			//	alert(response);
				var str = JSON.stringify(response);
		//		alert(str);
		//		console.log(str);
			},
			error :function(e){
		//		console.log(e);
		//		alert(e);
	       }
		});
		
 	},	
 	
};