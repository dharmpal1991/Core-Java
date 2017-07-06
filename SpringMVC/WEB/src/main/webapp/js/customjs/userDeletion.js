var USERDELETE = {
		
	deleteFunction : function(){
		var userDeletion = {};
		userDeletion.id = $("#user_id").val();
		
		console.log(JSON.stringify(userDeletion));
		
		$.ajax({
			url :"/WEB/userDeletion",
			type :"POST",
			data :{"userDeletion":JSON.stringify(userDeletion)},
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