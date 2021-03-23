package ru.netology.rest;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class PostRequest {
    @Test
    void shouldReturnBody() {
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("status") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
        .when()
                .post("/post")
// Проверки
        .then()
                .statusCode(200)
               // .header("Host","postman-echo.com")
                .body("data", equalTo("status"))
        ;
    }
}