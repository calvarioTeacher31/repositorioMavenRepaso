import models.DigimonModel;
import utilities.ExcelReader;
import utilities.JsonReader;
import utilities.Logs;

public class Main {
    public static void main(String[] args) {
        leerJson();
    }

    static void faker() {
        var log = new Logs();

        var digimon = new DigimonModel();

        log.info(digimon.getNombre());
        log.info(digimon.getFrase());
        log.info(digimon.getZipcode());
    }

    static void leerExcel() {
        var log = new Logs();

        var itemList = new ExcelReader().getItemList();

        for (var item : itemList) {
            log.info(item.getNombre());
            log.info(String.valueOf(item.getCantidad()));
        }
    }

    static void leerJson() {
        var log = new Logs();

        var empleado = new JsonReader().getEmpleadoModel();
        log.info(empleado.getName());
        log.info(empleado.getLastname());
        log.info(empleado.getCountry());
        log.info(String.valueOf(empleado.getNumCats()));
        log.info(String.valueOf(empleado.getHeight()));
        log.info(String.valueOf(empleado.isMarried()));

        var librosFavoritos = empleado.getFavoriteBooks();

        var videoJuegosFavoritos = empleado.getVideoGames();

        var hobbiesMap = empleado.getHobbies();

        log.info("");
        log.info("");

        for (var libro : librosFavoritos) {
            log.info(libro);
        }

        log.info("");
        log.info("");

        for (var juego : videoJuegosFavoritos) {
            log.info(juego.getGenre());
            log.info(juego.getName());
            log.info(String.valueOf(juego.getYear()));
            log.info("");
        }

        log.info("");
        log.info("");

        log.info(hobbiesMap.get("sleep").getDescription());
    }
}
