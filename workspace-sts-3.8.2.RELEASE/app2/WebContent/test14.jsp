<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
	<f:form commandName="hello14Command" enctype="multipart/form-data">
	<c:message code="firstName"/>
	<f:input path="firstName"/> <br>
	<c:message code="lastName"/>
	<f:input path="lastName"/> <br>
	<c:message code="picture"/>
	<input type="file" name="pic"/>
	<input type='submit' value='submit'/>
</f:form>