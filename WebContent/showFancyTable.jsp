<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>

    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    
    <link rel="stylesheet" href="css/blueStyle.css" type="text/css" />
    <link rel="stylesheet" href="css/jquery.tablesorter.pager.css" type="text/css" />

    <script type="text/javascript" src="script/jquery-1.8.2.min.js" ></script>
    <script type="text/javascript" src="script/jquery.tablesorter.min.js" ></script>
    <script type="text/javascript" src="script/jquery.tablesorter.pager.js" ></script>
    <script type="text/javascript" src="script/main.js" ></script>

    <title> Fancy Earthquake Data Viewer </title>

  </head>
  
  <body>

    <h2> Earthquake Data for 7 days: </h2>
    <div id="jtable"> 
      <img id="loading" src="image/loading.gif" />
    </div>    

  </body>
</html>
