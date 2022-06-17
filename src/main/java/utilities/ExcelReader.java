package utilities;

import com.poiji.bind.Poiji;
import models.ItemModel;

import java.io.File;
import java.util.List;

public class ExcelReader {
    private final String excelPath = "src/test/resources/data/dataPrueba.xlsx";
    private final Logs log = new Logs();

    public List<ItemModel> getItemList() {
        log.debug("Leyendo item list de excel");
        return Poiji.fromExcel(new File(excelPath), ItemModel.class);
    }
}
