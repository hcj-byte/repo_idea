package com.example.dao;

import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;

public interface GitMapper {
        void addGit(ProjectInfoProperties.Git git);
}
