package moovies;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MecanismoDeRecomendacion_PuntajeBajo implements MecanismoDeRecomendacion {

	@Override
	public List<Pelicula> recomendarPeliculaPara(Usuario user, Moovies moovies) {
		int condicionMinimaDeAmigos = 0;	//0 para que la comparacion de amigos en esRecomendacion (que usa >) 
											//cuente a partir del 1er amigo en adelante, para no repetir codigo.
		
		//Obtengo las peliculas y filtro segun las condiciones para recomendar con puntaje alto.
		Stream<Pelicula> mejoresPeliculas = moovies.mejoresPeliculas().stream();
		
		return mejoresPeliculas	.filter(p -> p.esRecomendacionPara(user, 0, condicionMinimaDeAmigos))
								.collect(Collectors.toList());
	}

}
