package models;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("items")
public class ItemModel {
    @ExcelCellName("key")
    private String key;
    @ExcelCellName("nombre")
    private String nombre;
    @ExcelCellName("precio")
    private double precio;
    @ExcelCellName("cantidad")
    private int cantidad;
    @ExcelCellName("id")
    private String id;

    public String getKey() {
        return key;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getId() {
        return id;
    }
}
