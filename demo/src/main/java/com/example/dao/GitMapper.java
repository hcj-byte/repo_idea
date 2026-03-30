package com.example.dao;

import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;

public interface GitMapper {
        void addGit(ProjectInfoProperties.Git git);

        void updateGit(ProjectInfoProperties.Git git);

        void deleteGit(ProjectInfoProperties.Git git);

        void testGit(ProjectInfoProperties.Git git);
}
