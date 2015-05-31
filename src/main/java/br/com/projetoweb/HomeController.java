package br.com.projetoweb;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;

@Controller
public class HomeController {

	private Result result;
	
	@Deprecated //CDI eyes only
	HomeController() {
	}

	@Inject
	public HomeController(Result result) {
		this.result = result;
	}
	
	@Get("/index")
	public void index() {
		System.out.println("VRaptor is working");
		result.include("message", "VRaptor4 is working with all required dependencies :) :)");
	}
	
}
