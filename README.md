EarthQuake Data Viewer
==============================

This is a simple application created to test out the Apache Struts framework. It retrieves seven days worth of earthquake data from a MySQL database and displays it using jQuery and the plugin *tablesorter*. 


**Environment Setup**
 *  Requires
   * Apache Ant
   * Mysql ( Configured with networking )
   * Tomcat 7
 * Use *database.sql* in *<root>/res/* to create the database

**Build:**

  Run 'ant' in root dir

**Install:**

 * Copy *war* file in *<root>/dist* folder to tomcat7 webapps dir ( e.g. */var/lib/tomcat7/webapps* )
 * Extract *war* file to new directory in webapps dir

**Execute:**

 * Navigate to homepage, which is in my case ( default settings ):
   * http://localhost:8080/EarthQuakeDataViewer/

**Screenshot**

![Screenshot](https://lh3.googleusercontent.com/-Ly7sf_xEUQo/UHpvS2WJbpI/AAAAAAAAAKI/FCMLVrbOdvk/s640/screenshot.png)

