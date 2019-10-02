package com.heiwig.dfabackendapi.controller

import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BoatController {

    @GetMapping("/boat")
    fun blog(model: Model): String {
        model["title"] = "Blog"
        return model.toString()
    }

}