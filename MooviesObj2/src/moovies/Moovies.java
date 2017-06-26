package moovies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import fileReaderManager.FileReaderManager;
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
  private List<Usuario> usuarios;
  
  //lista de peliculas
  private List<Pelicula> peliculas;
  
  //frMan
  private FileReaderManager manager;
  
  /*
   * 
   * Getters
   *  
   */
 

public List<Usuario> getUsuarios(){
	  return usuarios;
  }
  
  public List<Pelicula> getPeliculas(){
	  return peliculas;
  }
  
  /*
   * 
   * Constructor
   *  
   */
  
  public Moovies(FileReaderManager frMan) {
	this.manager = frMan;
	this.usuarios = new ArrayList<Usuario>();
	this.peliculas = new ArrayList<Pelicula>();
}
  
  /*
   * 
   * Otros metodos
   *  
   */
  
  public void addPelicula(Pelicula peli){
	  this.peliculas.add(peli);
  }
  
  public void addUsuario(Usuario user){
	  this.usuarios.add(user);
  }
  
  //retorna una coleccion con las 10 peliculas que tienen el 
  //promedio de rating mayor, ordenada en forma descendente
  public List<Pelicula> mejoresPeliculas(){
	  //Crea una nueva lista para ordenar a las peliculas
	  //List<Pelicula> orderedList = peliculas;
	  //establece la comparacion entre peliculas
	  Comparator<Pelicula> comparator = new Comparator<Pelicula>() {
	      @Override
	      public int compare(Pelicula movie1, Pelicula movie2) {
	          return movie1.compareTo(movie2); 
	      }
	  };
	  //Ordena la lista de mayor a menor
	  Collections.sort(peliculas, comparator); 
	  int index = 10;
	  List<Pelicula> finalList = new ArrayList<>();
	  //Crea una nueva lista con las 10 primeras peliculas
	  for(int i = 0; i < 10; i++){
	    finalList.add(peliculas.get(index));
	  }
	  return finalList;
	  
  }

  //retorna una coleccion con los 10 usuarios que han realizado 
  //el mayor numero de clasificaciones de peliculas, ordenada 
  //en forma descendente
  public List<Usuario> usuariosMasActivos(){
	  //Crea una nueva lista para ordenar a los usuarios
	  //List<Usuario> orderedList = usuarios;
	  //establece la comparacion entre usuarios
	  Comparator<Usuario> comparator = new Comparator<Usuario>() {
	      @Override
	      public int compare(Usuario user1, Usuario user2) {
	          return user1.compareTo(user2); 
	      }
	  };
	  //Ordena la lista de mayor a menor
	  Collections.sort(usuarios, comparator); 
	  int index = 10;
	  List<Usuario> finalList = new ArrayList<>();
	  //Crea una nueva lista con los primeros 10 usuarios
	  for(int i = 0; i < 10; i++){
	    finalList.add(usuarios.get(index));
	  }
	  return finalList;
  }
  
  //Actualiza la informacion en Moovies
  public void actualizarInfo(){
	  this.manager.integrarEnMoovies(this);
  }

} 







	

	

