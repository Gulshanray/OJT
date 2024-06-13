

import comAnimal.animals.Animal;
import comAnimal.animals.Dog;
import comAnimal.animals.Cat;

public class MainAnim {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
