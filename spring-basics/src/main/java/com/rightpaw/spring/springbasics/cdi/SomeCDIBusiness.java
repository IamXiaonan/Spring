package com.rightpaw.spring.springbasics.cdi;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by alinawxn on 9/24/2017.
 */
@Named
public class SomeCDIBusiness {
  @Inject
  SomeCDIDAO someCDIDAO;

  public SomeCDIDAO getSomeCDIDAO() {
    return someCDIDAO;
  }

  public void setSomeCDIDAO(SomeCDIDAO someCDIDAO) {
    this.someCDIDAO = someCDIDAO;
  }
}
