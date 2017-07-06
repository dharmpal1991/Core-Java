<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<s:form commandName="hello12Command">
	First Name : <s:input path="firstName"/> <br>
	Last Name : <s:input path="lastName"/> <br>
	<input type='submit' value='submit'/>
</s:form>