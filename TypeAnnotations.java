package day5;

import java.lang.annotation.Repeatable;
import java.lang.annotation.RetentionPolicy;

//Declare a  repeatable annotations type
//Declare the containing annotation type


//Declaring repeatable annotation type
@Repeatable(Games.class)
@interfaceGame{
	String name();
	String day();
}

//Decalering cintainer for repeatable annotation type
@Retention(RetentionPolicy.RUNTIME)
@interfaceGames{
	Game[] value();
}

//Repeating annotations
@Game(name = "Cricket", day ="Monday")
@Game(name = "Chess", day = "Tuesday")
@Game(name = "Football", day = "Wednesday")

public class TypeAnnotations {

	public static void main(String[] args) {
		
		Game[] game = TypeAnnotations.class.getAnnotationsByType(Game.class);
		
		for(Gamegame2:game) { //iteratinf value
			System.out.println(game2.name()+ " on " + game2.day());
		}

	}

}
