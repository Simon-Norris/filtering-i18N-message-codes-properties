<%--
  Created by IntelliJ IDEA.
  User: nehagupta
  Date: 4/2/15
  Time: 1:46 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<g:form>
    <p>Available Fruits</p>
    <g:each in="${fruits}" var="fruit">
        <span>
            <input type="radio" name="fruit">
            <label><g:message code="${fruit}"/></label>
        </span>
    </g:each>

    <p>Available Squares</p>
    <g:each in="${squares}" var="square">
        <span>
            <input type="radio" name="square">
            <label><g:message code="${square}"/></label>
        </span>
    </g:each>

    <p>Available Circles</p>
    <g:each in="${circles}" var="circle">
        <span>
            <input type="radio" name="circle">
            <label><g:message code="${circle}"/></label>
        </span>
    </g:each>

    <p>Available Black Color Items</p>
    <g:each in="${blackColorItems}" var="blackColorItem">
        <span>
            <input type="radio" name="blackColorItem">
            <label><g:message code="${blackColorItem}"/></label>
        </span>
    </g:each>

    <p>Available Red Color Items</p>
    <g:each in="${redColorItems}" var="redColorItem">
        <span>
            <input type="radio" name="redColorItem">
            <label><g:message code="${redColorItem}"/></label>
        </span>
    </g:each>

</g:form>
</body>
</html>