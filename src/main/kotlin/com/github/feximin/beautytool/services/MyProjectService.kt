package com.github.feximin.beautytool.services

import com.intellij.openapi.project.Project
import com.github.feximin.beautytool.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
