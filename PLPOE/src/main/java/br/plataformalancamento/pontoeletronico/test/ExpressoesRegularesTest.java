package br.plataformalancamento.pontoeletronico.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {
	
	public static void main(String[] args) {
//		extrairEmail();
		extrairNomeVariavelDentroString();
	}
	
	@SuppressWarnings("unused")
	private static void extrairEmail() {
		String texto = "Joao <joao@email.com>";
		String regex = "\\<(?<meuGrupo>.*?)\\>";
		String retorno = "";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher comparator = pattern.matcher(texto);
		if (comparator.find(0)) {
			retorno = comparator.group("meuGrupo");
		}
		System.out.println(retorno);
	}
	
	private static void extrairNomeVariavelDentroString() {
//		String texto = "O nome do seu/sua Coordenador(a) é ${REGISTRO_PRIMEIRO_PONTO} ?";
		String texto = "O nome do seu/sua Coordenador(a) é ${PONTO_ELETRONICO_DESAJUSTADO} ?";
		System.out.println(texto.substring(texto.indexOf("${")+0, texto.indexOf("}")+2));
	}

}
