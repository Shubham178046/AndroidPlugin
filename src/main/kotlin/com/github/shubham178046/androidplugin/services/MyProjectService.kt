package com.github.shubham178046.androidplugin.services

import com.intellij.openapi.project.Project
import com.github.shubham178046.androidplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
