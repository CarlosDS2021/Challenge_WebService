package com.aadi.base.stepDefinitions;

import com.aadi.base.steps.challengeWebServiceSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class challengeWebServiceSD {

    @Steps
    public challengeWebServiceSteps challengeWebService;

    @Given("El usuario desea agregar una mascota")
    public void elUsuarioDeseaAgregarUnaMascota() {
    }

    @When("se ingresa el {string}, {string}, {string}, {string}, {string}, {string}, {string} y {string}")
    public void requestPetStore(String id, String category_id, String category_name, String name, String photoUrls, String tags_id, String tags_name, String status) {
        challengeWebService.requestPetStore(id, category_id, category_name, name, photoUrls, tags_id, tags_name, status);
    }


    @Then("el servicio debe responder con status code {int}")
    public void validaQueLaRespuestaEs(int code) {
        challengeWebService.validaStatusCode(code);
    }

    @And("validamos el esquema del response")
    public void validamosElEsquemaDelResponse() {
        challengeWebService.validaEsquema();
    }

    @Given("El usuario desea obtener informacion de una mascota")
    public void elUsuarioDeseaObtenerInformacionDeUnaMascota() {

    }

    @When("se ingresa el {string} de la mascota")
    public void seIngresaElDeLaMascota(String idPet) {
        challengeWebService.GetPet(idPet);
    }

    @Given("El usuario desea actualizar una mascota")
    public void elUsuarioDeseaActualizarUnaMascota() {

    }
}

