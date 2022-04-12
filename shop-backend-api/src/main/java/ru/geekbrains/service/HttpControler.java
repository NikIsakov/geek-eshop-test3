package ru.geekbrains.service;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HttpControler {

    @GetMapping("/")
    public String index(Model model, HttpSession session){
        List<String> msg = (List<String>) session.getAttribute("MY_MESSAGES");
        if (msg == null){
            msg = new ArrayList<>();
        }
        model.addAttribute("messages",msg);
        return "index";
    }

    @PostMapping("/messages")
    public String saveMessage(@RequestParam("msg") String msg, HttpServletRequest httpServletRequest){
        List<String> msgs = (List<String>) httpServletRequest.getSession().getAttribute("MY_MESSAGES");
        if (msgs == null){
            msgs = new ArrayList<>();
            httpServletRequest.getSession().setAttribute("MY_MESSAGES", msgs);
        }
        msgs.add(msg);
        return "redirect:/";
    }
}
