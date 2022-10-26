package com.aadi.base.steps;

import io.cucumber.java.Before;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import net.thucydides.core.annotations.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class challengeWebServiceSteps {


    private static final Logger LOGGER = LoggerFactory.getLogger(challengeWebServiceSteps.class);
    public static String RequestPetStore;
    static private final String BASE_URL = "https://petstore.swagger.io/v2/pet/";

    private static RequestSpecification requestSpec;
    private static ResponseSpecification responseSpec;

    private Response response;
    private RequestSpecBuilder builder;
    private RequestSpecification requestSpecification;
    private String bodyPost;

    @Before
    public void init() {



        LOGGER.info(" Inicializa el constructor request ");
        requestSpec = new RequestSpecBuilder()
                .setBaseUri(BASE_URL)
                .addHeader("Content-Type","application/json")
                .build();


        LOGGER.info(" Inicializa el constructor response ");
        responseSpec = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectContentType(ContentType.JSON)
                .build();
    }

    @Step("Registra Pet")
    public void requestPetStore(String id, String category_id, String category_name, String name, String photoUrls, String tags_id, String tags_name, String status) {

        RequestPetStore="{\"id\":"+id+",\"category\":{\"id\":"+category_id+",\"name\":\""+category_name+"\"},\"name\":\""+name+"\",\"photoUrls\":[\""+photoUrls+"\"],\"tags\":[{\"id\":"+tags_id+",\"name\":\""+tags_name+"\"}],\"status\":\""+status+"\"}";

            given().
                    log().all().
                    spec(requestSpec)
                    .body(RequestPetStore)
             .post("")
             .then()
                    .spec(responseSpec)
             .and()
                    .log().all();

    }

    @Step("Obtener Pet")
    public void GetPet(String idPet) {

        given().
                log().all().
                spec(requestSpec).
                pathParams("idPet",idPet)
        .get("/{idPet}")
        .then()
                .spec(responseSpec)
        .and()
                .log().all();

    }

    public void validaStatusCode(int code) {
        assertThat(lastResponse().statusCode(), is(code));
    }

    public void validaEsquema() {
        lastResponse()
                .then()
                .body(matchesJsonSchemaInClasspath("schemaValidator.json"));
    }

}

