import com.github.clumsy.java.generics.Animal;
import com.github.clumsy.java.generics.Carnivorous;
import com.github.clumsy.java.generics.Herbivorous;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

    public static void main(String[] args) {
        List<Object> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Carnivorous());
        animals.add(new Herbivorous());
        animals.stream().map(a->(Animal)a).forEach(a->a.eat());

    }

    private static void testChildInParentBucket(){
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Carnivorous());
        animals.add(new Herbivorous());
        animals.forEach(a->a.eat());
    }
    private static void testParentInChildBucket(){
        List<Herbivorous> vegan = new ArrayList<>();
      //  vegan.add(new Animal()); // error
        vegan.add(new Herbivorous());
        vegan.forEach(a->a.eat());
    }
}
