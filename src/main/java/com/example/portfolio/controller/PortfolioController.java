package com.example.portfolio.controller;

import com.example.portfolio.model.ContactForm;
import com.example.portfolio.model.Project;
import com.example.portfolio.service.ProjectService;
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
    private final ProjectService projectService;

    public PortfolioController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("projects", projects());
        model.addAttribute("contactForm", new ContactForm());
        model.addAttribute(
                "featuredProjects",
                projectService.getFeaturedProjects()
        );

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
                        List.of("Java", "Spring Boot", "REST API"),
                        "Hands-On POC",
                        "https://github.com/Silvidheer/Spring-boot-examples"
                ),
                new Project(
                        "Kafka Event-Driven POC",
                        "Distributed Systems",
                        "A learning project exploring event publishing, consumer groups, and asynchronous service communication.",
                        List.of("Java", "Kafka", "Docker"),
                        "Hands-On POC",
                        "https://github.com/Silvidheer/Kafka_Poc"
                ),
                new Project(
                        "AI Chatbot",
                        "AI Engineering",
                        "An interactive AI chatbot concept built with React, featuring a responsive user interface, dynamic message rendering, and a foundation for integrating LLM-powered conversational capabilities.",
                        List.of("React", "JavaScript", "Vite", "AI", "LLM"),
                        "Hands-On POC",
                        "https://github.com/Silvidheer/chat-bot_React"
                ),
                new Project(
                        "AI-Assisted Workflow",
                        "AI Engineering",
                        "A concept project for combining an LLM with approved tools, validation, and human review.",
                        List.of("Java", "LLM", "Workflow"),
                        "Hands-On POC",
                        ""
                ),
                new Project(
                        "Data Science & Machine Learning — Predictive Analytics",
                        "Data Science & Machine Learning",
                        "Developed a machine learning workflow to analyze datasets, identify meaningful patterns, and generate data-driven predictions. Applied data preprocessing, exploratory data analysis (EDA), feature engineering, model training, and performance evaluation to translate raw data into actionable insights.",
                        List.of("Python", "Pandas", "NumPy", "Matplotlib", "Seaborn", "Scikit-learn"),
                        "Hands-On POC",
                        "https://github.com/Silvidheer"
                )
        );
    }
}
