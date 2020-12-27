package com.github.donlon.ideaplugintest.services

import com.intellij.openapi.project.Project
import com.github.donlon.ideaplugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
