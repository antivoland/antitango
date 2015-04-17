package ru.antivoland.antitango;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SuppressWarnings("unused")
public class Controller {
    @RequestMapping("/ping")
    public String ping() {
        return "pong";
    }

}
