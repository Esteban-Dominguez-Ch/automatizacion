package com.automatizacion;

import java.util.HashMap;
import java.util.Map;

public class LoginService {

    private final Map<String, String> usuariosRegistrados = new HashMap<>();

    public void registrarUsuario(String usuario, String contrasena) {
        usuariosRegistrados.put(usuario, contrasena);
    }

    public String iniciarSesion(String usuario, String contrasena) {
        String contrasenaRegistrada = usuariosRegistrados.get(usuario);
        if (contrasenaRegistrada != null && contrasenaRegistrada.equals(contrasena)) {
            return "concedido";
        }
        return "rechazado";
    }
}