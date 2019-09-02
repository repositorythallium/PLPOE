package br.plataformalancamento.pontoeletronico.application;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("rest")
public class PlataformaLancamentoApplication extends ResourceConfig {

	private static final String PACKAGE_RESOURCE = "br.plataformalancamento.pontoeletronico.resource";
	
	public PlataformaLancamentoApplication() {
		packages(getPackageResource());
	}
	
	public static String getPackageResource() {
		return PACKAGE_RESOURCE;
	}
	
}
