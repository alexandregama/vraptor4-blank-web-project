package br.com.projetoweb;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;

@Controller
public class HomeController {

	@Get("/index")
	public void index() {
		System.out.println("VRaptor is working");
	}
	
}