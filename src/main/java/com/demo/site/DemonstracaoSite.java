package com.demo.site;
import com.demo.pages.*;

public class DemonstracaoSite extends Site {
  public HomePage homepage;
  
  
  public DemonstracaoSite() {
	  homepage=new HomePage(nomenavegador,urlsite);
  }
  
  
  public Boolean preencherForm() {
	  return homepage.abrirpagina();
	}
  
  
  public void fecharsite() {
	  homepage.fechar();
	  
  }
}
