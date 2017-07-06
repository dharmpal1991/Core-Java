<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<s:form commandName="hello11Command">
	First Name: <s:input path="firstName"/> <br>
	Age: <s:input path="age"/> <br>
	Email: <s:input path="email"/> <br>
	<input type='submit' value='submit'/>
</s:form>