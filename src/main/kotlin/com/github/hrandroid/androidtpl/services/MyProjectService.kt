package com.github.hrandroid.androidtpl.services

import com.intellij.openapi.project.Project
import com.github.hrandroid.androidtpl.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
