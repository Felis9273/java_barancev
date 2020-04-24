package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTest {

  @Test
  public void testDistance(){
      Distance d = new Distance(2,6,1,4);
    Assert.assertEquals(d.getDistance(), 5.0);

  }
}
