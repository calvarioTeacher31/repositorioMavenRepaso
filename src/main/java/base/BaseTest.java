package base;

import com.github.javafaker.Faker;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import utilities.Logs;

public class BaseTest {
    protected final Logs log = new Logs();
    protected final Faker faker = new Faker();
    protected final SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void setupBase() {
        log.info("");
        log.info("");
        log.info("Hola soy el setup del base");
    }

    @AfterMethod
    public void teardownBase() {
        log.info("Hola soy el teardown del base");
        log.info("");
        log.info("");
    }
}
