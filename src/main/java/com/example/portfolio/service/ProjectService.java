
package com.example.portfolio.service;

import com.example.portfolio.model.Project;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    public List<Project> getFeaturedProjects() {
        return List.of(
                new Project(
                        "Air Canada — Enterprise Web Architecture",
                        "Enterprise Applications",
                        "Contributed to enterprise web application development, "
                                + "frontend architecture, accessibility, and performance "
                                + "optimization.",
                        List.of("Angular", "TypeScript", "UI/UX"),
                        "Professional Experience",
                        ""
                ),
                new Project(
                        "Medline — API & Microservices Architecture",
                        "Backend Engineering",
                        "Worked on Spring Boot REST APIs and microservices "
                                + "supporting pharmacy application capabilities and "
                                + "service integration.",
                        List.of("Java", "Spring Boot", "REST APIs", "Gradle"),
                        "Professional Experience",
                        ""
                ),
                new Project(
                        "Kafka — Event-Driven Architecture",
                        "Event-Driven Systems",
                        "Built a Spring Boot proof of concept exploring "
                                + "Kafka producers, consumers, topics, and asynchronous "
                                + "message processing.",
                        List.of("Java", "Spring Boot", "Kafka", "Docker"),
                        "Personal POC",
                        "https://github.com/Silvidheer"
                ),
                new Project(
                        "React — AI Chatbot",
                        "AI & Frontend",
                        "Developed an interactive chatbot interface with "
                                + "React and dynamic message rendering, preparing "
                                + "the foundation for future LLM integration.",
                        List.of("React", "JavaScript", "Vite", "AI", "LLM"),
                        "Personal Experiment",
                        "https://github.com/Silvidheer"
                ),
                // Project 5: Payment Transactions
                new Project(
                        "Payment Transaction & Cloud Operations",
                        "Financial Technology",
                        "Supported payment transaction workflows by validating REST API requests, "
                                + "backend responses, and data consistency across integrated services. "
                                + "Contributed to API testing, release management, AWS batch processing, "
                                + "Snowflake migrations, and secure data transfers across environments.",
                        List.of("REST APIs", "Postman", "Jenkins", "AWS Lambda",
                                "Amazon S3", "Snowflake", "SonarQube"),
                        "Professional Experience",
                        ""
                ),

// Project 6: Insurance Chargeback
                new Project(
                        "Insurance Transactions & Chargeback Processing",
                        "Insurance & Financial Systems",
                        "Supported insurance and financial transaction workflows, including "
                                + "chargeback processing, transaction validation, exception handling, "
                                + "financial adjustments, and reconciliation. Developed backend services, "
                                + "stored procedures, and batch processes for policy administration, "
                                + "commissions, rates, and incentives.",
                        List.of("Java", "Spring Boot", "Hibernate", "MySQL",
                                "REST APIs", "Batch Processing"),
                        "Professional Experience",
                        ""
                ),

// Project 7: Data Science
                new Project(
                        "Data Science & Machine Learning Experiments",
                        "Data Science & Analytics",
                        "Completed a structured Data Science program and worked on capstone "
                                + "projects applying analytical methods to practical problem-solving. "
                                + "Explored data analysis, statistical concepts, and machine learning "
                                + "techniques to identify patterns and derive insights from datasets.",
                        List.of("Python", "Data Analysis", "Statistics",
                                "Machine Learning", "Predictive Analytics"),
                        "Academic Projects",
                        ""
                ),

// Project 8: BNY Mellon
                new Project(
                        "Enterprise Reporting & Web Service Integration",
                        "Enterprise Reporting",
                        "Developed client-specific reports from high-volume datasets using Jasper "
                                + "reporting tools. Implemented business-driven web-service integrations "
                                + "and supported application performance testing, build automation, "
                                + "code-quality analysis, and deployment processes.",
                        List.of("Java", "Spring MVC", "AngularJS", "JasperReports",
                                "JMeter", "Jenkins", "SonarQube"),
                        "Professional Experience",
                        ""
                ),

// Project 9: Banking and Pension Systems
                new Project(
                        "Banking, Pension & Insurance Applications",
                        "Banking & Pensions",
                        "Developed and enhanced enterprise banking, pension, and insurance "
                                + "applications. Contributed to eligibility calculations, reporting, "
                                + "CSV processing, XML service integrations, and employee workflows. "
                                + "Coordinated distributed teams, requirements, estimates, testing, "
                                + "client walkthroughs, and technical mentoring.",
                        List.of("Java", "Spring MVC", "Hibernate", "XML",
                                "CSV Processing", "Agile"),
                        "Professional Experience",
                        ""
                ),

// Project 10: Telecom and Transportation
                new Project(
                        "Telecom, Insurance & Transportation Solutions",
                        "Multi-Domain Systems",
                        "Contributed to enterprise applications across telecom, insurance, and "
                                + "transportation domains. Worked on application design, XML-to-Java "
                                + "transformations, database operations, reporting, unit testing, "
                                + "interface specifications, implementation, and documentation.",
                        List.of("Java", "Spring MVC", "Hibernate", "MySQL",
                                "XML / XSL", "JUnit", "DbUnit"),
                        "Professional Experience",
                        ""
                )
        );
    }
}
