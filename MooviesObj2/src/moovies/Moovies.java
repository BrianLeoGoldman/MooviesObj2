package moovies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import moovies.Usuario;
import moovies.Pelicula;

/*
* Clase que define Moovies.
* La misma tiene la lista de los usuarios, y
* la lista de las peliculas.
*/

public class Moovies {
  
 /*
 * 
 * Colaboradores internos (variables de instancia) de la clase Moovies
 *  
 */
	
  //lista de usuarios
  private ArrayList<Usuario> usuarios;
  
  //lista de peliculas
  private ArrayList<Pelicula> peliculas;
  
  /*
   * 
   * Getters
   *  
   */
  
  public ArrayList<Usuario> getUsuarios(){
	  return usuarios;
  }
  
  public ArrayList<Pelicula> getPeliculas(){
	  return peliculas;
  }
  
  //retorna una colecci�n con las 10 pel�culas que tienen el 
  //promedio de rating mayor, ordenada en forma descendente
  public Collection<Pelicula> mejoresPel�culas(){
	  //Crea una nueva lista para ordenar a las peliculas
	  List<Pelicula> orderedList = peliculas;
	  //establece la comparacion entre peliculas
	  Comparator<Pelicula> comparator = new Comparator<Pelicula>() {
	      @Override
	      public int compare(Pelicula movie1, Pelicula movie2) {
	          return movie1.compareTo(movie2); 
	      }
	  };
	  //Ordena la lista de mayor a menor
	  Collections.sort(orderedList, comparator); 
	  int index = 10;
	  List<Pelicula> finalList = new ArrayList<>();
	  //Crea una nueva lista con las 10 primeras peliculas
	  for(int i = 0; i < 10; i++){
	    finalList.add(orderedList.get(index));
	  }
	  return finalList;
	  
  }

  //retorna una colecci�n con los 10 usuarios que han realizado 
  //el mayor n�mero de clasificaciones de pel�culas, ordenada 
  //en forma descendente
  public Collection<Usuario> usuariosM�sActivos(){
	  //Crea una nueva lista para ordenar a los usuarios
	  List<Usuario> orderedList = usuarios;
	  //establece la comparacion entre usuarios
	  Comparator<Usuario> comparator = new Comparator<Usuario>() {
	      @Override
	      public int compare(Usuario user1, Usuario user2) {
	          return user1.compareTo(user2); 
	      }
	  };
	  //Ordena la lista de mayor a menor
	  Collections.sort(orderedList, comparator); 
	  int index = 10;
	  List<Usuario> finalList = new ArrayList<>();
	  //Crea una nueva lista con los primeros 10 usuarios
	  for(int i = 0; i < 10; i++){
	    finalList.add(orderedList.get(index));
	  }
	  return finalList;
  }

}







	

	

