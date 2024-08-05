# TallerCampeonato

Nombre: José Francisco Riofrío Maldonado

Ciclo: 2

Carrera: Computación 

                                                                  Pasos para ejecutar el programa:

Descargue el código, el cual se encuentra en la rama principal (main).

Descomprima el archivo y guárdelo en la carpeta donde se tengan todos los proyectos de IntelliJ IDEA Community Edition 2024.1.1.

Abrir la carpeta contenedora del codigo.

Ejecutar el proyecto desde la clase main, para poder visualizar e interactuar.

Diagrama Uml

![image](https://github.com/user-attachments/assets/1f6f5fe0-8856-46ae-8c53-c78d976a4bac)

                                                                         Estructura del Proyecto

 Clases y Atributos

1. *Campeonato*
- Atributos:
  - numeroEquipos : in
  - nombre : string
  - fechaInicio : time
  - fechaFin : time
  - ubicación : int
- Métodos:
  - calcularPosicion()

2.Inscripcion
- Atributos:
  - fechaInicio : time
  - estado : string
  - numeroEquipos : int
  - cuota : int
  - fechaFin : time
-Métodos:
  - inscribirJugador() : string[]
  - inscribirJugador() : string

3. Arbitro
- Hereda de: Persona

4. Persona
- Atributos:
  - nombre : string
  - dni : int
  - fechaNacimiento : date
  - nacionalidad : string
  - sexo : int

5. Equipos
- *Atributos:*
  - nombre : string
  - fechaInicio : time

6. Partido
- Atributos:
  - fecha : date
  - duracion : time
  - fase : string
  - golesContra : int
  - golesFavor : int

7. Resultado
-Atributos:
  - equipoGanador : equipo

8. Jugador
- Hereda de: Persona

9. Categorías
- Atributos:
  - sub8 : int
  - sub11 : int
  - sub15 : int
  - sub23 : int
  - profesional : int

10. EstadisticasJugador
- Atributos:
  - partidosJugados : int
  - anotaciones : int
  - amonestaciones : int

11. EstadisticaCampeonato
- Atributos:
  - partidosJugados : int
  - puntos : int
  - partidosPerdidos : int
  - partidosGanados : int

12. EstadisticasEquipo
- Atributos:
  - partidosJugados : int
  - puntos : int
  - posición : int
  - partidosGanados : int
  - partidosPerdidos : int

13. TipoCampeonato
- Atributos:
  - liga : string
  - muertesubita : string
  - grupos : string

14.Enumeraciones
deporteEquipo
- Valores:
  - futbol : string
  - basketball : string
  - volleyball : string

deporteIndividual
- Valores:
  - tennis : string
  - ajedrez : string
  - boxeo : string

Relaciones

- Campeonato tiene una relación de agregación (1..*) con Partido.
- Campeonato tiene una relación de asociación (1) con Inscripción.
- Inscripción tiene una relación de asociación (1) con Jugador.
- Jugador hereda de Persona y tiene una relación de asociación (1..*) con Categorías.
- Equipos tiene una relación de composición (1..*) con Partido.
- Equipos tiene una relación de asociación (0..*) con EstadisticasEquipo.
- Partido tiene una relación de agregación (1) con Resultado.
- Arbitro hereda de Persona.
- EstadisticasJugador tiene una relación de asociación (1..*) con Jugador.

- EstadisticasJugador tiene una relación de asociación (1..*) con Jugador.


