# language: es
Característica: Inicio de sesión de usuario
  Como usuario registrado
  Quiero iniciar sesión con mi usuario y contraseña
  Para acceder al sistema

  Escenario: Login exitoso con credenciales válidas
    Dado un usuario registrado "admin" con contraseña "clave123"
    Cuando intenta iniciar sesion con usuario "admin" y contraseña "clave123"
    Entonces el resultado del acceso es "concedido"

  Escenario: Login rechazado por contraseña incorrecta
    Dado un usuario registrado "admin" con contraseña "clave123"
    Cuando intenta iniciar sesion con usuario "admin" y contraseña "clave_erronea"
    Entonces el resultado del acceso es "rechazado"

  Esquema del escenario: Validación de combinaciones de usuario y contraseña
    Dado un usuario registrado "<usuario_registrado>" con contraseña "<clave_registrada>"
    Cuando intenta iniciar sesion con usuario "<usuario_ingresado>" y contraseña "<clave_ingresada>"
    Entonces el resultado del acceso es "<resultado>"

    Ejemplos:
      | usuario_registrado | clave_registrada | usuario_ingresado | clave_ingresada | resultado |
      | admin               | clave123          | admin              | clave123         | concedido |
      | admin               | clave123          | admin              | clave999         | rechazado |
      | admin               | clave123          | desconocido        | clave123         | rechazado |