<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<f:form commandName="regCommand">
	First Name:<f:input path="firstName"/><br>
	Last Name:<f:input path="lastName"/><br>
	Gender:<f:radiobuttons path="gender" items="${genders}"
										itemsValue="id"
										itemLabel="name"/><br>
								
	Skills:<f:checkboxes path="skills"
						items="${skills}"
						itemsValue="id"
						itemLabel="name"/><br>
		
	Education:<f:select path="education">
				<f:options items="${educations}"
				itemValue="id"
				itemLabel="name"/><br>
				
		</f:select><br>
		
		<input type="submit" value="submit"/>
		</f:form>