package com.rightpaw.spring.springbasics.external;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by alinawxn on 9/24/2017.
 */
@Component
public class ExternalProperty {

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Value("${external.service.url}")
  private String url;


}
