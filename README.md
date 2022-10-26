# Proyecto Challenge - Web Service

Este proyecto se basará en un mantenimiento del servicio Pet.

## Empezamos
Con las siguientes instrucciones se logrará el correcto
funcionamiento del proyecto en su máquina local para fines de desarrollo y prueba.
 
### Pre - requisitos
Lo que necesita para instalar el software:

* Java SDK 8.x or higher
* Maven 3.x or higher

### Ejecución
1)Realizar la ejecución de los siguientes comandos de maven:

```
Use esto para la ejecución de etiquetas:
        mvn clean verify -Dcucumber.filter.tags=@WebServicePet

```

2)Realizar la siguiente ejecución mediante la clase baseTest

```
Colocamos el nombre del tag a ejecutar:
        tags = "@WebServicePet"
```

### Reporte

Para obtener el reporte de la ejecución

```
1) Nos dirigimos a la carpeta targeta > site > serenity > index.html.
2) Para abrir el reporte index.html lo podemos realizar por cualquier navegador de su preferencia.
```

## El proyecto esta construido 
El proyecto usa las siguientes librerias para el Build y Test:

* [Maven](https://maven.apache.org/) - Gestor de dependencias
* [RestAssured](https://github.com/rest-assured/rest-assured/wiki/Usage) - Test API REST
* [SerenityBDD](http://www.thucydides.info/docs/serenity/#first-steps) - Librería SerenityBDD 
* [PMD](https://pmd.github.io/latest/pmd_rules_java.html) - Analizador de código estático
* [Spotbugs](https://find-sec-bugs.github.io/bugs.htm) - Analizador de seguridad en código

## Authors
**Carlos Durand Silva**  



