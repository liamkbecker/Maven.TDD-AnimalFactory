package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)` X
    // TODO - Create tests for `speak` X
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)` X
    // TODO - Create tests for `Integer getId()` X
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword` X
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword` X


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testSetName() {
        //Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        //When
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        cat.setName("Lazu");
        String retrievedName = cat.getName();

        //Then
        Assert.assertEquals("Lazu", retrievedName);

    }

    @Test
    public void testSpeak() {
        //Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        //When
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //Then
        Assert.assertEquals("meow!", cat.speak());
    }

    @Test
    public void testEat() {
        //Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        //When
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Food lasagna = new Food();
        cat.eat(lasagna);
        cat.eat(lasagna);
        int retrievedMeals = cat.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(2, retrievedMeals);
    }

    @Test
    public void testGetId() {
        //Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        //When
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Integer retrievedId = cat.getId();

        //Then
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testCatIsMammal() {
        //Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        //When
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //Then
        Assert.assertTrue(cat instanceof Mammal);
    }

    @Test
    public void testCatIsAnimal() {
        //Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        //When
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //Then
        Assert.assertTrue(cat instanceof Animal);
    }

    /*@Test
    public void testSetBirthDate() {
        //Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        //When
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        cat.setBirthDate((2000; ));
        long expectedDate = cat.getBirthDate();

    } */

}
