$(document).ready(function(){

   $("#contact_form").submit(function(e){
		var firstName = $("#first_name").val();
		var lastName = $("#last_name").val();
		var fullName = $("#full_name").val();
		var email = $("#e_mail").val();
		var password = $("#password").val();
		var gender = $("#gender").val();
		var country = $("#country").val();
		var state = $("#state").val();
		var city = $("#city").val();
		var address = $("#address").val();
		var zipcode = $("#zip_code").val();
		var contactno = $("#contact_no").val();
		var flag = true;
	
	
		if(firstName == ''){
			$("#first_name").css({
								"outline-width":"thin",
		    					"outline-style": "solid",
		    					"outline-color": "red"
							});
			flag = false;
		}else{
			$("#first_name").css({'outline':'none'});
		}
		
		
		if(lastName == ''){
			$("#last_name").css({
								"outline-width":"thin",
		    					"outline-style": "solid",
		    					"outline-color": "red"
							});
			flag = false;
		}else{
			$("#last_name").css({'outline':'none'});
		}
			
		if(fullName == ''){
			$("#full_name").css({
								"outline-width":"thin",
		    					"outline-style": "solid",
		    					"outline-color": "red"
							});
			flag = false;
		}else{
			$("#full_name").css({'outline':'none'});
		}

		if(password == ''){
			$("#password").css({
								"outline-width":"thin",
		    					"outline-style": "solid",
		    					"outline-color": "red"
							});
			flag = false;
		}else{
			$("#password").css({'outline':'none'});

		}

		if(gender == ''){
			$("#gender").css({
								"outline-width":"thin",
		    					"outline-style": "solid",
		    					"outline-color": "red"
							});
			flag = false;
		}else{
			$("#gender").css({'outline':'none'});
		}

		if(country == ''){
			$("#country").css({
								"outline-width":"thin",
		    					"outline-style": "solid",
		    					"outline-color": "red"
							});
			flag = false;
		}else{
			$("#country").css({'outline':'none'});
		}

		if(contactno == ''){
			$("#contact_no").css({
								"outline-width":"thin",
		    					"outline-style": "solid",
		    					"outline-color": "red"
							});
			flag = false;
		}else{
			$("#contact_no").css({'outline':'none'});
		}
		
		if(state == ''){
			$("#state").css({
								"outline-width":"thin",
		    					"outline-style": "solid",
		    					"outline-color": "red"
							});
			flag = false;
		}else{
			$("#state").css({'outline':'none'});
		}
		
		

		if(city == ''){
			$("#city").css({
								"outline-width":"thin",
		    					"outline-style": "solid",
		    					"outline-color": "red"
							});
			flag = false;
		}else{
			$("#city").css({'outline':'none'});
		}
		
		
		
		if(zipcode == ''){
		$("#zip_code").css({
								"outline-width":"thin",
		    					"outline-style": "solid",
		    					"outline-color": "red"
							});
			flag = false;
		}else{
			$("#zip_code").css({'outline': 'none'});
		}
		if(address == ''){
		$("#address").css({
								"outline-width":"thin",
		    					"outline-style": "solid",
		    					"outline-color": "red"
							});
			flag = false;
		}else{
			$("#address").css('outline', 'none');
		}
		if(email == ''){
			console.log("BLANK");
			 $("#e_mail").css({
									"outline-width":"thin",
			    					"outline-style": "solid",
			    					"outline-color": "red"
								});
				flag = false;
			}else{
				$("#e_mail").css({'outline': 'none'});
			}
		if(email != ''){
			console.log("NOT NULL");
			$('#e_mail').filter(function(){
	         	var emil=$('#e_mail').val();
	         	var emailReg = /^([\w-\.]+@([\w-]+\.)+[\w-]{2,4})?$/;
	         	if( !emailReg.test( emil ) ) {
	         		$("#e_mail").css({
						"outline-width":"thin",
    					"outline-style": "solid",
    					"outline-color": "red"
					});
					flag = false;
	         	}
			});	
		 }else{
				$("#e_mail").css({'outline': 'none'});
		 }
		 if(flag){
		 }
		 return flag;
	}); 
	
    $("#first_name,#last_name,#full_name").keypress(function (e){
        var code =e.keyCode || e.which;
        if((code<65 || code>90)&&(code<97 || code>122)&&code!=32&&code!=46){
          return false;
        }
    });

    $("#contact_no,#zip_code").keypress(function (e){
        var code =e.keyCode || e.which;
        if(e.which != 8 && e.which !=0 &&(e.which<48 || e.which>57 ) ){
        //  alert("Only Digits are allowed");
          return false;
        }
    });
   
}); 