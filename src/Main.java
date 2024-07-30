import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        // Crear campeonatos
        System.out.println("Ingrese el nombre del campeonato:");
        String nombreCampeonato = scanner.nextLine();
        Campeonato campeonato1 = new Campeonato();
        campeonato1.setNombre(nombreCampeonato);

        try {
            System.out.println("Ingrese la fecha de inicio del campeonato (dd/MM/yyyy):");
            String fechaInicioStr = scanner.nextLine();
            Date fechaInicio = format.parse(fechaInicioStr);
            campeonato1.setFechaInicio(fechaInicio);

            System.out.println("Ingrese la fecha de finalización del campeonato (dd/MM/yyyy):");
            String fechaFinStr = scanner.nextLine();
            Date fechaFin = format.parse(fechaFinStr);
            campeonato1.setFechaFin(fechaFin);
        } catch (ParseException e) {
            System.out.println("Error al parsear la fecha. Asegúrate de que estás ingresando la fecha en el formato correcto (dd/MM/yyyy).");
        }

        System.out.println("¿Cuántos árbitros desea inscribir en el campeonato?");
        int numeroArbitros = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        List<Arbitro> arbitrosCampeonato1 = new ArrayList<>();
        for (int i = 0; i < numeroArbitros; i++) {
            System.out.println("Ingrese el nombre del árbitro " + (i + 1) + ":");
            String nombreArbitro = scanner.nextLine();
            Arbitro arbitro = new Arbitro();
            arbitro.setNombre(nombreArbitro);
            arbitrosCampeonato1.add(arbitro);
        }

        campeonato1.setArbitros(arbitrosCampeonato1);

        //Equipos Inscritos
        System.out.println("¿Cuántos equipos desea inscribir en el campeonato?");
        int numeroEquipos = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        List<Equipos> equiposCampeonato1 = new ArrayList<>();
        for (int i = 0; i < numeroEquipos; i++) {
            System.out.println("Ingrese el nombre del equipo " + (i + 1) + ":");
            String nombreEquipo = scanner.nextLine();
            Equipos equipo = new Equipos();
            equipo.setNombre(nombreEquipo);
            equipo.setFechaInicio(new Date());

            System.out.println("¿Cuántos jugadores desea agregar al equipo " + (i + 1) + "?");
            int numeroJugadores = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            // Crear jugadores
            List<Jugador> jugadoresEquipo = new ArrayList<>();
            for (int j = 0; j < numeroJugadores; j++) {
                System.out.println("Ingrese el nombre del jugador " + (j + 1) + " del equipo " + (i + 1) + ":");
                String nombreJugador = scanner.nextLine();
                Jugador jugador = new Jugador();
                jugador.setNombre(nombreJugador);

                System.out.println("Ingrese el número de partidos jugados por el jugador " + (j + 1) + ":");
                int partidosJugados = scanner.nextInt();
                scanner.nextLine(); // consume the newline
                jugador.setPartidosJugados(partidosJugados);

                System.out.println("Ingrese el número de anotaciones del jugador " + (j + 1) + ":");
                int anotaciones = scanner.nextInt();
                scanner.nextLine(); // consume the newline
                jugador.setAnotaciones(anotaciones);

                System.out.println("Ingrese el número de amonestaciones del jugador " + (j + 1) + ":");
                int amonestaciones = scanner.nextInt();
                scanner.nextLine(); // consume the newline
                jugador.setAmonestaciones(amonestaciones);


                jugadoresEquipo.add(jugador);
            }

            // Asignar jugadores a equipos
            equipo.setJugadores(jugadoresEquipo);



            //Partidos de los equipos
            System.out.println("Ingrese el número de partidos ganados por el equipo " + (i + 1) + ":");
            int partidosGanados = scanner.nextInt();
            scanner.nextLine(); // consume the newline
            equipo.setPartidosGanados(partidosGanados);

            System.out.println("Ingrese el número de partidos perdidos por el equipo " + (i + 1) + ":");
            int partidosPerdidos = scanner.nextInt();
            scanner.nextLine(); // consume the newline
            equipo.setPartidosPerdidos(partidosPerdidos);

            System.out.println("Ingrese el número de partidos empatados por el equipo " + (i + 1) + ":");
            int partidosEmpatados = scanner.nextInt();
            scanner.nextLine(); // consume the newline
            equipo.setPartidosEmpatados(partidosEmpatados);

            System.out.println("Ingrese el número de goles a favor del equipo " + (i + 1) + ":");
            int golesFavor = scanner.nextInt();
            scanner.nextLine(); // consume the newline
            equipo.setGolesFavor(golesFavor);

            System.out.println("Ingrese el número de goles en contra del equipo " + (i + 1) + ":");
            int golesContra = scanner.nextInt();
            scanner.nextLine(); // consume the newline
            equipo.setGolesContra(golesContra);

            equiposCampeonato1.add(equipo);
        }

        campeonato1.setEquipos(equiposCampeonato1);

        Collections.sort(equiposCampeonato1, new Comparator<Equipos>() {
            @Override
            public int compare(Equipos e1, Equipos e2) {
                return Integer.compare(e2.getPuntos(), e1.getPuntos());
            }
        });

        System.out.println("\n---------Datos ingresados----------:");
        System.out.println("Nombre del campeonato: " + nombreCampeonato);
        System.out.println("Fecha de inicio del campeonato: " + campeonato1.getFechaInicio());
        System.out.println("Fecha de finalización del campeonato: " + campeonato1.getFechaFin());
        System.out.println("\nFecha de inicio del campeonato: " + campeonato1.getFechaInicio());
        System.out.println("\nÁrbitros del campeonato:");
        for (int i = 0; i < arbitrosCampeonato1.size(); i++) {
            System.out.println("Nombre del árbitro " + (i + 1) + ": " + arbitrosCampeonato1.get(i).getNombre());
        }

        System.out.println("\n---------Equipos del campeonato:----------");
        for (int i = 0; i < equiposCampeonato1.size(); i++) {
            System.out.println("Nombre del equipo " + (i + 1) + ": " + equiposCampeonato1.get(i).getNombre());
            System.out.println("Jugadores del equipo " + (i + 1) + ":");
            for (Jugador jugador : equiposCampeonato1.get(i).getJugadores()) {
                System.out.println(jugador.getNombre());
            }
        }

        System.out.println("\n---------Tabla de posiciones:------------");
        for (int i = 0; i < equiposCampeonato1.size(); i++) {
            System.out.println("Puesto " + (i + 1) + ":");
            System.out.println("Nombre del equipo " + (i + 1) + ": " + equiposCampeonato1.get(i).getNombre());
            System.out.println("Puntos: " + equiposCampeonato1.get(i).calcularPuntos());
            System.out.println("Goles a favor: " + equiposCampeonato1.get(i).getGolesFavor());
            System.out.println("Goles en contra: " + equiposCampeonato1.get(i).getGolesContra());
            System.out.println("Partidos ganados: " + equiposCampeonato1.get(i).getPartidosGanados());
            System.out.println("Partidos perdidos: " + equiposCampeonato1.get(i).getpartidosPerdidos());
            System.out.println("Partidos empatados: " + equiposCampeonato1.get(i).getPartidosEmpatados());

        }
    }
}