package com.demo.pages;

import com.demo.tool.Automacao;

public class HomePage extends Pagina {
	
	public HomePage(String nomenavegador,String urlsite) {
		ferramenta=new Automacao();
		ferramenta.abrirnavegador(nomenavegador);
		urlpagina = urlsite;
	}
    
	@Override
	public Boolean abrirpagina() {
		ferramenta.irparapagina(urlpagina);
		return true;
		
	}
	
	public Boolean fechar() {
		ferramenta.fecharnavegador();
		return true;
	}
	
}
