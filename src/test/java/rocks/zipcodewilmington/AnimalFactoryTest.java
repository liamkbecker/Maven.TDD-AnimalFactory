package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testCreateDog() {
        //Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();

        //When
        Dog dog = new Dog(givenName, givenBirthDate, 0);
        AnimalFactory aF = new AnimalFactory();
        Dog dog2 = aF.createDog(givenName, givenBirthDate);

        //Then
        Assert.assertNotEquals(dog2, dog);

    }

    @Test
    public void testCreateCat(){
        //Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();

        //When
        Cat cat = new Cat(givenName, givenBirthDate, 0);
        AnimalFactory aF = new AnimalFactory();
        Cat cat2 = aF.createCat(givenName, givenBirthDate);

        //Then
        Assert.assertNotEquals(cat2, cat);
    }


}
