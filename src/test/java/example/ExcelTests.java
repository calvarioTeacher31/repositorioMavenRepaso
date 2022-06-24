package example;

import base.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.DataProviders;

public class ExcelTests extends BaseTest {
    @BeforeMethod
    public void setUp() {
        log.info("Hola soy la precondición");
    }

    @Test
    public void readExcelTest() {
        var nombre = "Polera azul XL";
        var precio = 32.11;
        var cantidad = 1;
        var id = "ITEM-21";

        var poleraInfo = new DataProviders().getPoleraInfo();
        log.info("Verificando el nombre que sea correcto");
        softAssert.assertEquals(poleraInfo.getNombre(), nombre, "El nombre no es correcto");

        log.info("Verificando el precio que sea correcto");
        softAssert.assertEquals(poleraInfo.getPrecio(), precio, "El precio no es correcto");

        log.info("Verificando la cantidad que sea correcta");
        softAssert.assertEquals(poleraInfo.getCantidad(), cantidad, "La cantidad no es correcta");

        log.info("Verificando el id que sea correcto");
        softAssert.assertEquals(poleraInfo.getId(), id, "El id no es correcto");
        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown() {
        log.info("Hola soy la postcondición");
    }
}
