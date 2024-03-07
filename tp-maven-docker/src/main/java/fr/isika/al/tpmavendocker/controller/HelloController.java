package fr.isika.al.tpmavendocker.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HelloController {
	
    @GetMapping("/")
    public String getIndex(Model model) {
        // Initialize the model attribute if needed
        model.addAttribute("nom", "");
        return "index";
    }

    @PostMapping("/sendName")
    public String sendName(@RequestBody String string, Model model) {
        // Set the received string as the value for "nom" attribute in the model
        model.addAttribute("nom", string);
        return "index";
    }
	
//	@GetMapping("/")
//	public String accueil(Model model) {
//		Iterable<AssureDTO> assures = assureProxy.getAllAssures();
//		model.addAttribute("listeAssures", assures);
//		model.addAttribute("assureRecherche", new AssureDTO());
//		return "index";
//	}
//	
//	@GetMapping("/Assure/numeroAssure/{numAssure}")
//	public String assureDetails(@PathVariable Long numAssure, Model model) {
//		AssureDTO assure = assureProxy.getByNumeroAssure(numAssure);
//		model.addAttribute("assure", assure);
//		//model.addAttribute("contrats", contratProxy.getByNumeroAssure(numAssure));
//		return "assure";
//	}
//		
	}
