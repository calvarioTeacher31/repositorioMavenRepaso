package utilities;

import models.ItemModel;

import java.util.HashMap;

public class MapParsers {
    private final Logs log = new Logs();

    public HashMap<String, ItemModel> getItemMap() {
        log.debug("Creando map de item model");
        
        var itemList = new ExcelReader().getItemList();
        var map = new HashMap<String, ItemModel>();
        for (var item : itemList) {
            map.put(item.getKey(), item);
        }

        return map;
    }
}
