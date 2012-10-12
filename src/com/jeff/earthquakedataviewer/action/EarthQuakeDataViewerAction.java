package com.jeff.earthquakedataviewer.action;

/* Import the service class(es) */
import com.jeff.earthquakedataviewer.service.GetEarthQuakeInfoService;
import com.jeff.earthquakedataviewer.service.EarthQuake;

/* Action default implemenation, contains common methods */
import com.opensymphony.xwork2.ActionSupport;

/* Common classes */
import java.util.ArrayList;
import java.util.List;

public class EarthQuakeDataViewerAction extends ActionSupport {

  private List earthQuakeList;

  /* Entry */
  public String execute() throws Exception {

    earthQuakeList = new ArrayList();

    GetEarthQuakeInfoService geqi = new GetEarthQuakeInfoService();
    geqi.readDB();
    earthQuakeList = geqi.getEarthQuakeList(); 

    /* SUCCESS inherited from Action class */
    return SUCCESS;
  }

  /* So we can get it in the JSP */
  public List getEarthQuakeList() {
    return earthQuakeList;
  }

}
