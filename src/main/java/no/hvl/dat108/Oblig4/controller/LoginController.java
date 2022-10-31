package no.hvl.dat108.Oblig4.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/${app.url.login}")
public class LoginController {


    @Value("${app.url.registered}") private String REGISTERED_URL;


    /*
     * GET /login er forespørselen for å hente login-skjema.
     */

    @GetMapping
    public String getLoginForm() {return "loginView";}

    /*
     * POST /login er forespørselen for å logge inn.
     */
    @PostMapping
    public String provAaLoggeInn(@RequestParam String username,
                                 HttpServletRequest request, RedirectAttributes ra) {
        return "redirect:" + REGISTERED_URL;
    }
}
