package Domen;
/**
 * Класс Месторасположение
 */
public class Places {

    private int row;
    private int col;
    private boolean empty;
/**
 * Конструктор класса месторасположение
 * @param row поле позиция по вертикали
 * @param col поле позиция по горизонтали
 */
    public Places(int row, int col) {
        this.row = row;
        this.col = col;
    }
/**
 * Свойства класса Месторасположение
 * @return
 */
    public boolean isEmpty(){
        return empty;
    }

    public boolean setEmpty(boolean empty) {
        boolean result = this.empty;
        this.empty = empty;
        return result;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}
