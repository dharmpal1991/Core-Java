/*var STUDENTUPDATION = {
		
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
 	
};*/

//Browser Support Code
function ajaxFunction(){
   var ajaxRequest;  // The variable that makes Ajax possible!
   try{
   
      // Opera 8.0+, Firefox, Safari
      ajaxRequest = new XMLHttpRequest();
   }catch (e){
      
      // Internet Explorer Browsers
      try{
         ajaxRequest = new ActiveXObject("Msxml2.XMLHTTP");
      }catch (e) {
         
         try{
            ajaxRequest = new ActiveXObject("Microsoft.XMLHTTP");
         }catch (e){
         
            // Something went wrong
            alert("Your browser broke!");
            return false;
         }
      }
   }
   
   // Create a function that will receive data
   // sent from the server and will update
   // div section in the same page.
   ajaxRequest.onreadystatechange = function(){
   
      if(ajaxRequest.readyState == 4){
         var ajaxDisplay = document.getElementById('ajaxDiv');
         ajaxDisplay.innerHTML = ajaxRequest.responseText;
      }
   }
   
   // Now get the value from user and pass it to
   // server script.
    var.id = document.getElementById("id").value;
	var.firstName = document.getElementById("first_name").value;
	var.lastName = document.getElementById("last_name").value;
	var.fullName = document.getElementById("full_name").value;
	var.email = document.getElementById("email").value;
	var.gender = document.getElementById("gender").value;
	var.country = document.getElementById("country").value;
	var.state = document.getElementById("state").value;
	var.city = document.getElementById("city").value;
	var.address = document.getElementById("address").value;
	var.zipcode = document.getElementById("zip_code").value;
	var.contactno = document.getElementById("contact_no").value;
  
   var queryString = "?age=" + age ;
   
   queryString +=  "&wpm=" + wpm + "&sex=" + sex;
   ajaxRequest.open("GET", "ajax-example.php" + queryString, true);
   ajaxRequest.send(null); 
}