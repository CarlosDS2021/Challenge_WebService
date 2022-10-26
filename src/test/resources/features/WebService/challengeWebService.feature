@WebServicePet
Feature: Automatización de mantenimiento del servicio Pet

  @AgregarMascota
  Scenario Outline: Usuario desea agregar una mascota
    Given El usuario desea agregar una mascota
    When se ingresa el "<id>", "<category_id>", "<category_name>", "<name>", "<photoUrls>", "<tags_id>", "<tags_name>" y "<status>"
    Then el servicio debe responder con status code 200
    And validamos el esquema del response

    Examples:
    | id | category_id  | category_name | name  | photoUrls | tags_id  |    tags_name     |     status     |
    | 1  |      1       |   Perros      | Flaki |           |   1      |  Color Negro     |   available    |
    | 2  |      2       |   Gatos       | Michi |           |   1      |  Color Atigrado  |   available    |


    @ObtenerUnaMascota
    Scenario Outline: Usuario desea obtener informacion de una mascota
      Given El usuario desea obtener informacion de una mascota
      When se ingresa el "<id>" de la mascota
      Then el servicio debe responder con status code 200
      And validamos el esquema del response

      Examples:
      | id |
      | 1  |
      | 2  |


  @ActualizarMascota
  Scenario Outline: Usuario desea actualizar una mascota
    Given El usuario desea actualizar una mascota
    When se ingresa el "<id>", "<category_id>", "<category_name>", "<name>", "<photoUrls>", "<tags_id>", "<tags_name>" y "<status>"
    Then el servicio debe responder con status code 200
    And validamos el esquema del response

    Examples:
      | id | category_id  | category_name | name  | photoUrls | tags_id  |    tags_name     |     status     |
      | 1  |      1       |   Perros      | Flaki |           |   1      |  Color Negro     |   sold         |
      | 2  |      2       |   Gatos       | Michi |           |   1      |  Color Atigrado  |   sold         |