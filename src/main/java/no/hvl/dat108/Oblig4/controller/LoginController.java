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

    @Value("/${app.message.invalidInfo}") private String INVALID_LOGIN_INFO_MESSAGE;
    @Value("/${app.url.login}") private String LOGIN_URL;
    @Value("/${app.url.list}") private String LIST_URL;

    @GetMapping
    public String getLoginView() {
        return "loginView";
    }

    @PostMapping
    public String logIn(@RequestParam String mobil, HttpServletRequest request, RedirectAttributes ra) {

        //TODO - legg inn sjekk for om bruker med mobilnr eksisterer, og om passord er riktig

        return "redirect:" + LIST_URL;
    }
}
