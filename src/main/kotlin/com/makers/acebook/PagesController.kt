package com.makers.acebook

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class PagesController {

    @GetMapping("/")
    fun landing_page(model: Model): String {
        model["title"] = "Acebook"
        model["welcome_message"] = "Welcome to Acebook"
        return "landing_page"
    }
}