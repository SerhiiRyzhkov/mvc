package org.example.mvc_final;


import org.dom4j.rule.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView(){
        return "firstView-view";
    }

    @RequestMapping("/askDetails")
    public String showAskDetails(Model model){
        model.addAttribute("playerAttribute", new Player());
        return "askDetails-view";
    }

    @RequestMapping("/showDetails")
    public String showShowDetails(@Valid @ModelAttribute("playerAttribute") Player player, BindingResult result ){
        if(result.hasErrors())return "askDetails-view";
        else {

            player.setClub("FC " + player.getClub());

            return "showDetails-view";
        }
    }


}
