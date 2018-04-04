package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class appiCopia {
	
	ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>()
	
	private static final ObjectMapper JSON_MAPPER = new ObjectMapper();
	
	public static void salvarDatos() {
		ArrayList<Jugador> copiaJugador = null;
		try {
			copiaJugador = JSON_MAPPER.readValue(new URL("http://127.0.0.1:8443/pedirDatos"), ArrayList.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("LOOOOONGITUD: "+copiaJugador.size());
		
	}
}
