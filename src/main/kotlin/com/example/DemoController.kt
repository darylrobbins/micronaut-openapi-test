package com.example

import io.micronaut.context.annotation.Value
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import jakarta.inject.Inject

@Controller("/demo")
class DemoController(
    // Fails with either of these two present:
    @Inject val demoService: DemoService,
    @Value("\${baseurl:}") val baseUrl: String,
) {

    @Get(uri="/", produces=["application/json"])
    fun index() = ArrayList<AB>()
}

data class AB(val someField: String)
