package com.automatizacion.steps;

import org.junit.Assert;

import com.automatizacion.LoginService;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class LoginSteps {

    private final LoginService loginService = new LoginService();
    private String resultado;

    @Dado("un usuario registrado {string} con contraseña {string}")
    public void unUsuarioRegistradoConContrasena(String usuario, String contrasena) {
        loginService.registrarUsuario(usuario, contrasena);
    }

    @Cuando("intenta iniciar sesion con usuario {string} y contraseña {string}")
    public void intentaIniciarSesionConUsuarioYContrasena(String usuario, String contrasena) {
        resultado = loginService.iniciarSesion(usuario, contrasena);
    }

    @Entonces("el resultado del acceso es {string}")
    public void elResultadoDelAccesoEs(String resultadoEsperado) {
        Assert.assertEquals(resultadoEsperado, resultado);
    }
}