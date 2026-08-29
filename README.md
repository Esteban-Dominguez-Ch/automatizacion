# Automatización de pruebas

Proyecto Maven con pruebas unitarias automatizadas e integración continua.

## ¿Qué es la integración continua (CI)?

La integración continua es una práctica que consiste en integrar frecuentemente los cambios de código en un repositorio compartido. Cada integración dispara automáticamente un pipeline que compila el proyecto, ejecuta las pruebas automatizadas y entrega feedback inmediato al equipo.

**Beneficios:**
- Detecta errores temprano, evitando que se acumulen.
- Da feedback rápido a quien programó el cambio.
- Aumenta la transparencia: todo el equipo ve el estado del proyecto.
- Reduce riesgos y mejora la calidad del software entregado.

**Por qué importan los commits y merges frecuentes:** hacer commits pequeños y seguidos permite que cada cambio se valide por separado, que los conflictos se detecten apenas aparecen (no semanas después) y que quede un historial claro de cómo evolucionó el proyecto.

## Cómo ejecutar el proyecto

```bash
git clone <url-repositorio>
cd automatizacion
mvn install
mvn test
```

## Estructura del proyecto

```
automatizacion/
├── src/main/java/com/automatizacion/    # código de la aplicación
├── src/test/java/com/automatizacion/    # pruebas automatizadas
│   ├── SumaTest.java
│   └── RestaTest.java
├── pom.xml
├── .gitignore
└── README.md
```

## Sobre las pruebas

`SumaTest` y `RestaTest` son pruebas pequeñas y atómicas: cada una verifica un solo comportamiento (una operación aritmética), sin depender de datos externos ni del resultado de otra prueba. Esto facilita detectar errores, mantener el código y ejecutar las pruebas de forma aislada y repetible.

## Limpieza del entorno

El archivo `.gitignore` evita subir archivos temporales y generados (`target/`, `.class`, `.idea/`) al repositorio, manteniendo el proyecto enfocado solo en el código relevante.