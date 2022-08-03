package com.demo.site;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Site {

	public String nomenavegador;
	public String urlsite;
	public Properties propriedades;
	
	public Site() {
		try {
			propriedades=new Properties();
			FileInputStream arquivo =new FileInputStream("C:\\Users\\Notebook\\eclipse-workspace\\POM\\src\\main\\java\\com\\demo\\config\\config.properties");
			propriedades.load(arquivo);
			nomenavegador=propriedades.getProperty("browser");
			urlsite=propriedades.getProperty("url");		
			
		}catch(FileNotFoundException excecao1) {
			excecao1.printStackTrace();
			
		}
		catch(Exception excecao2) {
			//Tratamento de Exceção
			excecao2.printStackTrace();
		}
	}

	public String getUrlsite() {
		return urlsite;
	}

	public Properties getPropriedades() {
		return propriedades;
	}
}
