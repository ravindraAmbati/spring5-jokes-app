package com.springbootapps.spring5jokesapp.Controllers;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/jokes")
@Controller
public class JokesControllerImpl implements JokesController {

   private ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesControllerImpl() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }

    @RequestMapping("/list")
    @Override
    public String publishJoke(Model model) {
        model.addAttribute("joke", this.getJoke());
        return "jokes/list";
    }

}
