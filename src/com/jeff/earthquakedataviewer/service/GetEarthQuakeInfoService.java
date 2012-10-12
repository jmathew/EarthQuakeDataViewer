package com.jeff.earthquakedataviewer.service;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/* This class returns an array of rows containg the results from a query against the database

   Ideally we'd use hibernate here to interface with the database, but for now using JDBC */

public class GetEarthQuakeInfoService {

  private Connection con = null;
  private Statement st = null;
  private PreparedStatement ps = null;
  private ResultSet res = null; 
  
  private MysqlDataSource myds;

  private String dbServerName = "localhost";
  private String dbName = "earthquake_data";
  private String dbUser = "jeff";
  private String dbPassword = "mysql";

  /* Stores all the rows */
  List<EarthQuake> earthquakeList;

  public GetEarthQuakeInfoService() {

    /* init */
    earthquakeList = new ArrayList<EarthQuake>();

    /* Setup database source */
    myds = new MysqlDataSource();
    myds.setUser( dbUser );
    myds.setPassword( dbPassword );
    myds.setServerName( dbServerName );
    myds.setDatabaseName( dbName );
 
  }

  public List<EarthQuake> getEarthQuakeList() {
    return this.earthquakeList;
  }

  public void readDB() throws Exception {
    try {
      /* Get connection to database */ 
      con = myds.getConnection();
      st = con.createStatement();

      /* Just get all the information out of the database for now*/
      res = st.executeQuery( "SELECT * FROM last7days" ); 

      processResultSet( res );      

    } catch ( Exception e ) { 
      throw e; 
    } finally {
      /* Close all connections  */
      try {
        if( res != null )
          res.close();
        if( st != null )
          st.close();
        if( con != null )
          con.close();
      } catch ( Exception e ) {
        throw e;
      }
    }
  }
  
  /* Adds all the rows to an arraylist */
  private void processResultSet( ResultSet rs ) throws SQLException {
    while( rs.next() ) {

      /* A little repetitive but thats what I get for not using hibernate */
      EarthQuake eq = new EarthQuake();
      eq.setId        ( rs.getObject( "id"        ));
      eq.setSrc       ( rs.getObject( "src"       ));
      eq.setEqid      ( rs.getObject( "eqid"      ));
      eq.setVersion   ( rs.getObject( "version"   ));
      eq.setDate      ( rs.getObject( "date"      ));
      eq.setLat       ( rs.getObject( "lat"       ));
      eq.setLon       ( rs.getObject( "lon"       ));
      eq.setMagnitude ( rs.getObject( "magnitude" ));
      eq.setDepth     ( rs.getObject( "depth"     ));
      eq.setNst       ( rs.getObject( "nst"       ));
      eq.setRegion    ( rs.getObject( "region"    ));
      
      earthquakeList.add( eq );
    }
  }

}
