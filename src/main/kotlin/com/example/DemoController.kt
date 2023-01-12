package com.example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/demo")
class DemoController {

    @Get(uri="/", produces=["application/json"])
    fun index() = ArrayList<AB>()
}

data class AB(val someField: String)
