package utilities;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.empleado.EmpleadoModel;

import java.io.File;
import java.io.IOException;

public class JsonReader {
    private final String jsonFolder = "src/test/resources/data/jsons";
    private final Logs log = new Logs();

    private ObjectMapper getObjectMapper() {
        var mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
        return mapper;
    }

    public EmpleadoModel getEmpleadoModel() {
        var nombreJson = "dataJson4";
        var jsonPath = String.format("%s/%s.json", jsonFolder, nombreJson);
        var mapper = getObjectMapper();

        try {
            log.debug("Leyendo de json");
            return mapper.readValue(new File(jsonPath), EmpleadoModel.class);
        } catch (IOException ioException) {
            log.error("Error al leer de json");
            log.error(ioException.getLocalizedMessage());
            return null;
        }
    }
}
