package com.example.rotues

import com.example.data.model.Image
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

// Emulator's external IP address
private const val BASE_URL = "http://10.0.2.2:8080"
private val images = listOf(
    Image("Cat", "A curious cat observes with curiosity.", "$BASE_URL/Images/Image1.jpg"),
    Image("Dog", "Puppy looks cute wearing tiny boots.", "$BASE_URL/Images/Image2.jpg"),
    Image("Racoon", "Racoons have very tiny hands.", "$BASE_URL/Images/Image3.jpg"),
    Image("Otter", "Otters are highly social beings.", "$BASE_URL/Images/Image4.jpg"),
    Image("Squirrel", "Squirrels collect acorn before the winter.", "$BASE_URL/Images/Image5.jpg"),
)

fun Route.randomImage() {
    get("/randomImage") {
        call.respond(
            HttpStatusCode.OK,
            images.random()
        )
    }
}