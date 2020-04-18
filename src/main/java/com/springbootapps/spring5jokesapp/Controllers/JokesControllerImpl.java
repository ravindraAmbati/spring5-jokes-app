package com.springbootapps.spring5jokesapp.Controllers;

import com.springbootapps.spring5jokesapp.Services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/jokes")
@Controller
public class JokesControllerImpl implements JokesController {

    @Autowired
   private final JokeService jokeService;

    public JokesControllerImpl(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/list")
    @Override
    public String publishJoke(Model model) {
        model.addAttribute("joke", this.jokeService.getJoke());
        return "jokes/list";
    }

}
