<%-- 
    Document   : index
    Created on : Jun 23, 2017, 6:52:10 PM
    Author     : rachanagajjar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set var="t" scope="page" value="0"/>

        <c:set scope="session" var="String1" value="<%= request.getParameter("r1")%>"></c:set>
        <c:set scope="session" var="String2" value="<%= request.getParameter("r2")%>"></c:set>
        <c:set scope="session" var="String3" value="<%= request.getParameter("r3")%>"></c:set>

        <c:if test="${sessionScope.String1 eq 'h'}">
            <c:set var="t" value="${pageScope.t+1}"></c:set>

        </c:if>

        <c:if test="${sessionScope.String2 eq 't'}">
            <c:set var="t" value="${pageScope.t+1}"></c:set>
            <%-- <% i++; %> --%>
        </c:if>

        <c:if test="${String3 eq 'b' }">
            <c:set var="t" value="${pageScope.t+1}"></c:set>
        </c:if>

        <p>your score is: <c:out value="${t}" /></p>

    </body>
</html>
<%--
<jsp:param name="name" value="${sessionScope.uname}"></jsp:param>
--%>