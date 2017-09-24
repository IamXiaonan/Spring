package com.rightpaw.spring.springbasics.xml;

/**
 * Created by alinawxn on 9/24/2017.
 */
public class XmlPersonDao {

  public XmlJdbcConnection getXmlJdbcConnection() {
    return xmlJdbcConnection;
  }

  public void setXmlJdbcConnection(
      XmlJdbcConnection xmlJdbcConnection) {
    this.xmlJdbcConnection = xmlJdbcConnection;
  }

  XmlJdbcConnection xmlJdbcConnection;

}
