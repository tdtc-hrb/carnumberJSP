<%@ include file="IncludeTop.jsp" %>
<form method=POST action="http://localhost:8080/carnumberJSP/shop/viewTrainOrder.do">
year:
  <select name="year" size="1">
          <c:forEach var="myYear" items="${myModel2.yearList}">
            <option value=<c:out value="${myYear}" />
            >
            <c:out value="${myYear}" />
            </option>
          </c:forEach>
  </select>
	  month:
  <select name="month" size="1">
    <c:forEach var="myMonth" items="${myModel2.monthList}">
      <option value=<c:out value="${myMonth}" />
      >
      <c:out value="${myMonth}" />
      </option>
    </c:forEach>
  </select>
  <input name="submit" type="submit" value="  get train order  "/>
</form>

<%@ include file="IncludeBanner.jsp" %>

<%@ include file="IncludeBottom.jsp" %>
