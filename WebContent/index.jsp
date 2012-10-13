<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title> Earthquake Viewer Homepage </title>
  </head>

  <body>
    <p> This is a simple project that uses the Struts 2 frame work and interacts with a database. The fancy table uses jQuery and the plugin <a href="http://tablesorter.com">tablesorter</a></p>
    <a href="<s:url action='showTable'/>"> Pull information from database </a><br>
    <a href="<s:url action='showFancyTable'/>"> Pull information from database and put it in a fancy table</a>
  </body>

</html>

