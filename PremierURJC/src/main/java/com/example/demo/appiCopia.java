package com.example.demo;
import java.util.List;

@RestController
public class appiCopia {

	private static final ObjectMapper JSON_MAPPER = new ObjectMapper();
	
	@Autowired
	private RepositorioJugador repositorio_de_jugadores;
  
