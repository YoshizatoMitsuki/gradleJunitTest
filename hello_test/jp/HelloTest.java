package jp;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {	
  @Test
  public void testAppendComma(){
  	Hello sample = new Hello();
      String retValue = sample.appendComma("abc");
      assertEquals("abc,", retValue);
  }
}
