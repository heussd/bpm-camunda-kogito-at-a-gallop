package com.example.hello

import io.swagger.annotations.Api
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Api
@RestController
class HealthController {

    @GetMapping("/healthcheck")
    fun health(): ResponseEntity<String> {
        return ResponseEntity("I am okay, thanks", HttpStatus.OK)
    }

}
