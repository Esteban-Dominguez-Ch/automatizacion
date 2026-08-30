package com.automatizacion;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import com.sun.net.httpserver.HttpServer;

public class LoginServer {

    public static void main(String[] args) throws IOException {
        LoginService loginService = new LoginService();
        loginService.registrarUsuario("admin", "clave123");

        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/login", exchange -> {
            Map<String, String> params = parseQuery(exchange.getRequestURI());
            String usuario = params.getOrDefault("usuario", "");
            String contrasena = params.getOrDefault("contrasena", "");
            String resultado = loginService.iniciarSesion(usuario, contrasena);

            byte[] respuesta = resultado.getBytes();
            exchange.sendResponseHeaders(200, respuesta.length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(respuesta);
            }
        });
        server.start();
        System.out.println("Servidor de login escuchando en http://localhost:8080/login");
    }

    private static Map<String, String> parseQuery(URI uri) {
        Map<String, String> params = new HashMap<>();
        String query = uri.getQuery();
        if (query != null) {
            for (String pair : query.split("&")) {
                String[] kv = pair.split("=", 2);
                if (kv.length == 2) {
                    params.put(kv[0], kv[1]);
                }
            }
        }
        return params;
    }
}