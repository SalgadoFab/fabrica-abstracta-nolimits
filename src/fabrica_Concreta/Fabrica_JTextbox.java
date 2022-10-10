package fabrica_Concreta;

import java.awt.*;

public class Fabrica_JTextbox {
    private String text;
    private int rows;
    private int columns;

    public Fabrica_JTextbox(String text, int rows, int columns) {
        this.text = text;
        this.rows = rows;
        this.columns = columns;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
}
