package com.jeff.earthquakedataviewer.service;

import java.sql.Timestamp;

/*
  Class representing one earthquake and all the data associated with it
*/

public class EarthQuake {

  private int    id        = 0;
  private String src       = "";  
  private String eqid      = "";  
  private String version   = "";  
  private String date      = "";  
  private double lat       = 0.0;  
  private double lon       = 0.0;  
  private double magnitude = 0.0;  
  private double depth     = 0.0;  
  private int    nst       = 0;  
  private String region    = "";   

  /* Constructors */
  public EarthQuake(int    id,
                    String src,
                    String eqid,
                    String version,
                    String date,
                    double lat,
                    double lon,
                    double magnitude,
                    double depth,
                    int    nst,
                    String region) {
    /* Set all values */
    setId        ( id        );
    setSrc       ( src       );
    setEqid      ( eqid      );
    setVersion   ( version   );
    setDate      ( date      );
    setLat       ( lat       );
    setLon       ( lon       );
    setMagnitude ( magnitude );
    setDepth     ( depth     );
    setNst       ( nst       );
    setRegion    ( region    );
  }

  public EarthQuake() {
    setId        ( 0   );
    setSrc       ( ""  );
    setEqid      ( ""  );
    setVersion   ( ""  );
    setDate      ( ""  );
    setLat       ( 0.0 );
    setLon       ( 0.0 );
    setMagnitude ( 0.0 );
    setDepth     ( 0.0 );
    setNst       ( 0   );
    setRegion    ( ""  );
  }
  
  /* Getters */
  public int    getId()        { return this.id;        }
  public String getSrc()       { return this.src;       }
  public String getEqid()      { return this.eqid;      }
  public String getVersion()   { return this.version;   }
  public String getDate()      { return this.date;      }
  public double getLat()       { return this.lat;       }
  public double getLon()       { return this.lon;       }
  public double getMagnitude() { return this.magnitude; }
  public double getDepth()     { return this.depth;     }
  public int    getNst()       { return this.nst;       }
  public String getRegion()    { return this.region;    }

  /* Setters - auto convert to appropriate type, must provide ResultSet.getObject */
  public void setId( Object id ) { 
    this.id = ((Number)id).intValue();
  }
  public void setSrc( Object src ) {
    this.src = (String) src;
  }
  public void setEqid( Object eqid ) {
    this.eqid = (String) eqid;
  }
  public void setVersion( Object version ) {
    this.version = (String) version;
  }
  public void setDate( Object date ) {
    /* This comes in as a java.sql.Timestamp object */
    this.date = (String) date.toString();
  }
  public void setLat( Object lat ) {
    this.lat = ((Number)lat).doubleValue();
  }
  public void setLon( Object lon ) {
    this.lon = ((Number)lon).doubleValue();
  }
  public void setMagnitude( Object magnitude ) {
    this.magnitude = ((Number)magnitude).doubleValue();
  }
  public void setDepth( Object depth ) {
    this.depth = ((Number)depth).doubleValue();
  }
  public void setNst( Object nst ) {
    this.nst = ((Number)nst).intValue();
  }
  public void setRegion( Object region ) {
    this.region = (String) region;
  }
  
 
}
