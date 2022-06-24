package utilities;

import models.ItemModel;

public class DataProviders {
    private final Logs log = new Logs();

    public ItemModel getPoleraInfo() {
        var map = new MapParsers().getItemMap();
        return map.get("polera");
    }
}
