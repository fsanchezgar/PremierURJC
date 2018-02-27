package com.example.demo;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseUsersLoader {

	// Inyectamos los repositorios
	@Autowired
	private RepositorioTorneo torneoRepository;
	@Autowired
	private RepositorioEquipo equipoRepository;
	@Autowired
	private RepositorioJugador jugadorRepository;
	@Autowired
	private RepositorioEntrenador entrenadorRepository;

	@PostConstruct
	private void initDataBase() {

		/*
		 * Creamos los Torneos. Torneo lnfs = new Torneo("LNFS", 20); Torneo copa = new
		 * Torneo("Copa del Rey", 20);
		 * 
		 * torneoRepository.save(lnfs); torneoRepository.save(copa);
		 * 
		 * // Creamos los Equipos de la LNFS. Equipo interMovistar = new
		 * Equipo("Inter Movistar", "LNFS", "España", 50); Equipo barcelona = new
		 * Equipo("Barcelona", "LNFS", "España", 32);
		 * 
		 * Equipo pozo = new Equipo("El Pozo", "Copa del Rey", "España", 10); Equipo
		 * laSerna = new Equipo("U.D La Serna", "Copa del Rey", "España", 15);
		 * 
		 * interMovistar.setTorneo(lnfs); barcelona.setTorneo(lnfs);
		 * 
		 * pozo.setTorneo(copa); laSerna.setTorneo(copa);
		 * 
		 * //Guardamos los equipos en el repositorio de equipos
		 * equipoRepository.save(interMovistar); equipoRepository.save(barcelona);
		 * equipoRepository.save(pozo); equipoRepository.save(laSerna);
		 * 
		 * //Creamos los jugadores.
		 * 
		 * Jugador ricardinho = new
		 * Jugador("Ricardo Filipe Da Silva Braga","Inter Movistar","Ala",32,"Portugal",
		 * 60000000); Jugador bebe = new
		 * Jugador("Rafael García Aguilera","Inter Movistar","Cierre",28,"España",
		 * 20000000);
		 * 
		 * Jugador sedano = new
		 * Jugador("Paco Sedano ","Barcelona","Portero",38,"España",40000000); Jugador
		 * leonardo = new
		 * Jugador("Leonardo Santana Da Silva ","Barcelona ","Cierre",30,"Brasil",
		 * 20000000);
		 * 
		 * Jugador elias = new
		 * Jugador("Elías Beltrán Fernández","El Pozo","Ala",25,"España",30000000);
		 * Jugador manuel = new
		 * Jugador("Manuel Piqueras Dólera","El Pozo","Cierre",18,"España",10000000);
		 * 
		 * Jugador ruben = new
		 * Jugador("Rubén Beltrán Sánchez","U.D La Serna","Cierre",25,"España",30000000)
		 * ; Jugador david = new
		 * Jugador("David Beltrán Sánchez","U.D La Serna","Cierre",25,"España",30000000)
		 * ;
		 * 
		 * 
		 * ricardinho.setEquipo(interMovistar); bebe.setEquipo(interMovistar);
		 * sedano.setEquipo(barcelona); leonardo.setEquipo(barcelona);
		 * elias.setEquipo(pozo); manuel.setEquipo(pozo); ruben.setEquipo(laSerna);
		 * david.setEquipo(laSerna);
		 * 
		 * 
		 * //Guardamos los jugadores en el repositorio de jugadores
		 * 
		 * jugadorRepository.save(ricardinho); jugadorRepository.save(bebe);
		 * jugadorRepository.save(sedano); jugadorRepository.save(leonardo);
		 * jugadorRepository.save(elias); jugadorRepository.save(manuel);
		 * jugadorRepository.save(ruben); jugadorRepository.save(david);
		 * 
		 * Creamos los entrenadores de los equipos Entrenador eduardo = new
		 * Entrenador("Eduardo Sao","El Pozo","edu","pozo"); eduardo.setEquipo(pozo);
		 * entrenadorRepository.save(eduardo);
		 * 
		 * 
		 * Entrenador jesus = new
		 * Entrenador("Jesús Velasco","Inter Movistar","jesus","movistar");
		 * eduardo.setEquipo(interMovistar); entrenadorRepository.save(jesus);
		 * 
		 * 
		 * Entrenador plaza = new Entrenador("Andreu Plaza","Barcelona","plaza","bcn");
		 * eduardo.setEquipo(barcelona); entrenadorRepository.save(plaza);
		 * 
		 * 
		 * Entrenador miguel = new
		 * Entrenador("Miguel Angel Beltran","U.D La Serna","ma","serna");
		 * eduardo.setEquipo(laSerna); entrenadorRepository.save(miguel);
		 */

	}

}
