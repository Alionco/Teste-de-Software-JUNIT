package analisador;

public class Identifier {
	
	public String validateIdentifier(String s) {
		
		int i; char c;
		if (s.length() == 0)
			return "Invalido: Identificador Nulo";
		if (s.length() >= 6)
			return "Invalido: Identificador deve ter no maximo 6 caracteres";
		c=s.charAt(0);
		if (!valid_s(c))
			return "Invalido: Identificador deve iniciar com letra";
		
		for (i=1 ; ((i < s.length()) && valid_f(s.charAt(i))); i++);
		
		if (s.length() != i)
			return "Invalido: Identificador deve conter somente letras e digitos";
		else
			return "Valido";
	}
	
	public boolean valid_s(char ch) {
		return (((ch >= 'A') && (ch <= 'Z')) || ((ch >= 'a') && (ch <= 'z')));
	}
	
	public boolean valid_f(char ch) {
		return (valid_s(ch) || ((ch >= '0') && (ch <= '9')));
	}
}