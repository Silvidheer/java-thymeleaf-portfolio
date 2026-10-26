package com.silvidheer.portfolio.controller;

import com.silvidheer.portfolio.model.ContactForm;
import com.silvidheer.portfolio.model.Project;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class PortfolioController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("projects", projects());
        model.addAttribute("contactForm", new ContactForm());
        return "index";
    }

    @PostMapping("/contact")
    public String contact(
            @Valid @ModelAttribute("contactForm") ContactForm contactForm,
            BindingResult bindingResult,
            Model model,
            RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            model.addAttribute("projects", projects());
            model.addAttribute("contactError", "Please check the fields and try again.");
            return "index";
        }

        // Demo behavior: no email is sent and no message is stored yet.
        redirectAttributes.addFlashAttribute(
                "contactNotice",
                "Thanks for reaching out. This demo form is not connected to email or storage yet."
        );
        return "redirect:/#contact";
    }

    private List<Project> projects() {
        return List.of(
                new Project(
                        "Spring Boot REST API",
                        "Backend Engineering",
                        "A REST API starter demonstrating layered architecture, request validation, and clear API contracts.",
                        List.of("Java", "Spring Boot", "REST")
                ),
                new Project(
                        "Kafka Event-Driven POC",
                        "Distributed Systems",
                        "A learning project exploring event publishing, consumer groups, and asynchronous service communication.",
                        List.of("Java", "Kafka", "Docker")
                ),
                new Project(
                        "AI-Assisted Workflow",
                        "AI Engineering",
                        "A concept project for combining an LLM with approved tools, validation, and human review.",
                        List.of("Java", "LLM", "Workflow")
                )
        );
    }
}
