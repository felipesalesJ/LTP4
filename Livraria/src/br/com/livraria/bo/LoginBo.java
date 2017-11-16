package br.com.livraria.bo;

public class LoginBo {

	public static Boolean verificarLogin(String user, String pass){
		if(user.equals("root") && pass.equals("1234")){
			return true;
		}
		return false;
		
	}
}
