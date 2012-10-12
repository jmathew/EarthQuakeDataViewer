<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>EarthQuakeDataViewer</title>
  </head>
  <body>
    <h2>Earthquake data for 7 days:</h2>
    <s:iterator value="earthQuakeList"> <s:property value="id" /> <s:property value="src" /> <s:property value="eqid" /> <s:property value="version" /> <s:property value="date" /> <s:property value="lat" /> <s:property value="lon" /> <s:property value="magnitude" /> <s:property value="depth" /> <s:property value="nst" /> <s:property value="region" />
    <br>
    </s:iterator>
  </body>
</html>
