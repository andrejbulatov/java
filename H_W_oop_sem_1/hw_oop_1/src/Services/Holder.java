package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.Places;
/**
 * Класс пружинок-держателей, на которых расположены продукты
 */
public class Holder {

    private List<Places> places;

    /**
     * Конструктор держателей-пружинок
     * @param xSize Координата X
     * @param ySize Координата Y
     */
    public Holder(int xSize, int ySize){
        places = new ArrayList<>(xSize*ySize);
        for(int x = 0; x < xSize; x++){
            for(int y = 0; y < ySize; y++){
                places.add(new Places(x, y));
            }
        }
    }
/**
 * Свойства класса держателей-пружинок
 */
    public boolean release(int x, int y){
        return places.stream().filter(place -> place.getCol() == x && place.getRow() == y)
                .findFirst().get().setEmpty(true);
    }

    public int getBalance() {
        return 0;
    }
}
