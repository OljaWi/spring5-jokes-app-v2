package guru.springframework.spring5jokesappv2.controller;

import guru.springframework.spring5jokesappv2.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    } //initializint the Joke Service

    @RequestMapping({"/",""}) //Method which is invoked when we type in the root mapping
    public String showJoke(Model model){

        model.addAttribute("joke", jokeService.getJoke());
        return "index";         //Tells SpringMVC that we will get an index view
    }
}
