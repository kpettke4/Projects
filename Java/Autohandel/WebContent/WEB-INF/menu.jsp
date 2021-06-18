<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div id="menu">
    <ul>
        <li><a href="index.jsp">Strona domowa</a></li>
        <li><a href="listaKsiazek">Wszystkie ksiązki</a></li>
            <ul>
               <c:forEach var="el" items="${lkat}">
               <li><a href="listaKsiazek?idkat=${el.idk}">${el.opis}</a></li>
                </c:forEach>
            </ul>
    
    </ul>
</div>