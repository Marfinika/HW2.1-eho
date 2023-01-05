package ru.netology.rest;

import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

class MobileBankApiTestV3 {
    @Test
    void shouldReturnDemoAccounts() {
      // Given - When - Then
      // Предусловия
      given()
          .baseUri("https://postman-echo.com")
              .body("some data")
      // Выполняемые действия
      .when()
              .post("/post")
      // Проверки
      .then()
          .statusCode(200)
          // специализированные проверки - лучше
          .contentType(ContentType.JSON)
          .body("", hasSize(3))

      ;
    }
}
