package com.springbootapps.spring5jokesapp.Controllers;

import org.springframework.ui.Model;

public interface JokesController {

    String getJoke();

    String publishJoke(Model model);
}
