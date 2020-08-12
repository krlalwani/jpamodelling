package com.jpamodelling.demo.controllers;

import com.jpamodelling.demo.model.Category;
import com.jpamodelling.demo.model.UnitOfMeasure;
import com.jpamodelling.demo.repositories.CategoryRepository;
import com.jpamodelling.demo.repositories.UnitOfMeasureRepository;
import com.jpamodelling.demo.services.ReceipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {
    private final ReceipeService receipeService;

    public IndexController(ReceipeService receipeService) {
        this.receipeService = receipeService;
    }

    @RequestMapping({"","/","index"})
    public String getIndexPage(Model model){
        model.addAttribute("receipes",receipeService.getReceipes());
        return "index";
    }

}
