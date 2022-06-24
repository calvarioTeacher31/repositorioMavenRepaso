package example;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExampleTests extends BaseTest {
    @BeforeMethod
    public void setUp() {
        log.info("Hola soy la precondición");
    }

    @Test
    public void example1Test() {
        log.info("Hola soy un el test example 1");
    }

    @Test
    public void example2Test() {
        log.info("Hola soy el test example2 !!!!!!!!!");
    }

    @Test
    public void fakerTest() {
        log.info("Creo el numero 1");
        var num1 = faker.number().numberBetween(5, 15);
        log.debug("num1: " + num1);

        log.info("Creo el numero 2");
        var num2 = faker.number().numberBetween(1, 2);
        log.debug("num2: " + num2);

        log.info("Comparo los numeros");
        Assert.assertEquals(num1, num2);
    }

    @Test
    public void faker2Test() {
        log.info("Creo el numero el random boolean");
        var randomBool = faker.bool().bool();
        log.debug("randomBool: " + randomBool);

        log.info("Verifico que random bool sea true");
        Assert.assertTrue(randomBool);
    }

    @Test
    public void variosHardAssertTest() {
        log.info("Creo el numero 1");
        var num1 = faker.number().numberBetween(1, 2);
        log.debug("num1: " + num1);

        log.info("Creo el numero 2");
        var num2 = faker.number().numberBetween(1, 2);
        log.debug("num2: " + num2);

        log.info("Comparo los numeros");
        Assert.assertEquals(num1, num2, "Los numeros no son iguales");

        log.info("Creo el numero el random boolean");
        var randomBool = faker.bool().bool();
        log.debug("randomBool: " + randomBool);

        log.info("Verifico que random bool sea true");
        Assert.assertTrue(randomBool, "Random bool es false");
    }

    @Test
    public void softAssertTest() {
        log.info("Creo el numero 1");
        var num1 = faker.number().numberBetween(1, 2);
        log.debug("num1: " + num1);

        log.info("Creo el numero 2");
        var num2 = faker.number().numberBetween(1, 2);
        log.debug("num2: " + num2);

        log.info("Creo el numero el random boolean");
        var randomBool = faker.bool().bool();
        log.debug("randomBool: " + randomBool);

        log.info("Verifico que num1 y num2 sean iguales");
        softAssert.assertEquals(num1, num2, "los numeros no son iguales");

        log.info("Verifico que randomBool sea true");
        softAssert.assertTrue(randomBool, "el randombool es false");

        softAssert.assertAll(); //verifico todas los softAssert
        log.info("NO me caí");
    }

    @AfterMethod
    public void tearDown() {
        log.info("Hola soy la postcondición");
    }
}
