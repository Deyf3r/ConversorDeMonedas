# Conversor de Monedas en Java

Este proyecto es parte de un **Challenge del Curso Alura LATAM**, en el cual se desarrolla un **Conversor de Monedas** utilizando **Java** y consumiendo la API pública de [ExchangeRate-API](https://www.exchangerate-api.com/).

El objetivo es aprender a trabajar con solicitudes HTTP, manipular datos en formato JSON y presentar los resultados de forma clara al usuario.

---

## Desafío

En este emocionante desafío de programación, se invita a construir un conversor de monedas completo.  
A lo largo del reto se trabajan las siguientes etapas:

1. **Configuración del Ambiente Java**  
2. **Creación del Proyecto**  
3. **Consumo de la API**  
4. **Análisis de la Respuesta JSON**  
5. **Filtro de Monedas**  
6. **Exhibición de Resultados a los Usuarios**

Se trata de una experiencia práctica diseñada para consolidar conocimientos en **Java**, programación orientada a objetos, consumo de APIs y manipulación de datos JSON.

---

## Metodología de Trabajo

Para la organización de tareas se propone el uso de un **sistema ágil de desarrollo con Trello**:

- **Listos para iniciar** → Tareas pendientes por desarrollar.  
- **En Desarrollo** → Tareas en progreso.  
- **Pausado** → Tareas iniciadas pero detenidas por algún motivo.  
- **Concluido** → Tareas finalizadas.  

El Trello se utiliza de forma **individual** para el seguimiento personal de avances y no forma parte de la evaluación.

---

## Tecnologías Utilizadas

- **Java 17+**
- **Gson** (para manejo de JSON)
- **HttpURLConnection** (para solicitudes a la API)
- **ExchangeRate-API** (fuente de datos en tiempo real)

---

## Estructura del Proyecto

### Clases principales

- **`CurrencyService`**  
  Gestiona el consumo de la API y la conversión de divisas.  

- **`Currency`**  
  Representa la respuesta de la API con sus tasas de cambio.  

- **`ExchangeResponse`**  
  Clase auxiliar para manejar datos de conversión.  

- **`CurrencyAPI`**  
  Proporciona un método para convertir montos usando las tasas de cambio.  

- **`CurrencyFilter`**  
  Permite filtrar monedas específicas de las tasas obtenidas.  

- **`CurrencyConverterApp`**  
  Clase principal que inicia la aplicación.  

---

