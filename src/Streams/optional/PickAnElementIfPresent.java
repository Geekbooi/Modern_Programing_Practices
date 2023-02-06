
package Streams.optional;


import java.util.List;
import java.util.Optional;

public class PickAnElementIfPresent {
  public static void pickName(
    final List<String> names, final String startingLetter) {
     
	  final Optional<String> foundName = 
		      names.stream()
		           .filter(name ->name.startsWith(startingLetter))
		           .findFirst();
      
	  foundName.ifPresent(name -> System.out.println("Hello " + name));
	 // System.out.println(foundName.get()); / Throw exception if stream is empty
  }

  public static void main(final String[] args) {

    pickName(Folks.friends, "N");
    pickName(Folks.friends, "Z");

  }
}
