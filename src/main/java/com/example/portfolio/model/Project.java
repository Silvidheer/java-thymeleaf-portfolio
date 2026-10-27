
package com.example.portfolio.model;

import java.util.List;

public class Project {

    private final String title;
    private final String category;
    private final String description;
    private final List<String> technologies;
    private final String projectType;
    private final String githubUrl;

    public Project(String title, String category,
                   String description, List<String> technologies,
                   String projectType, String githubUrl) {
        this.title = title;
        this.category = category;
        this.description = description;
        this.technologies = technologies;
        this.projectType = projectType;
        this.githubUrl = githubUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getTechnologies() {
        return technologies;
    }

    public String getProjectType() {
        return projectType;
    }

    public String getGithubUrl() {
        return githubUrl;
    }
}
