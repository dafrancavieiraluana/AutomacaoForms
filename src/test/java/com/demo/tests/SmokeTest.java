package com.demo.tests;

//import org.testng.Assert;
import org.testng.annotations.Test;

import com.demo.site.DemonstracaoSite;

public class SmokeTest {
   @Test
   public void SmokeTest1() {
	   
	   Boolean resultado=false;
	   DemonstracaoSite site=new DemonstracaoSite();
	   resultado = site.preencherForm();
	   site.fecharsite();
   }
}
