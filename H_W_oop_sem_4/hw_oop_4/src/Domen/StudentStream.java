package Domen;

import java.util.Iterator;
import java.util.List;
/**
 * Класс поток студентов, имплементировал итератор
 */
public class StudentStream implements Iterable<StudentGroup> {
    
    private List<StudentGroup> stream;
    private Integer numberStream;
/**
 * Конструктор класса поток студентов
 * @param stream список групп в потоке
 * @param numberStream номер потока
 */
    public StudentStream(List<StudentGroup> stream, Integer numberStream) {
        this.stream = stream;
        this.numberStream = numberStream;
    }
/**
 * Получение потока групп студентов
 * @return поток
 */
    public List<StudentGroup> getStream() {
        return stream;
    }
/**
 * Установка потока групп студентов
 * @param stream поток
 */
    public void setStream(List<StudentGroup> stream) {
        this.stream = stream;
    }
/**
 * Получение номера потока
 * @return номер потока
 */
    public Integer getNumberStream() {
        return numberStream;
    }
/**
 * Установка номера потока
 * @param numberStream номер потока
 */
    public void setNumberStream(Integer numberStream) {
        this.numberStream = numberStream;
    }
/**
 * Переопределение метода toString
 */
     @Override
    public String toString() {
        return "StudentStream{" +
                "stream = " + stream +
                ", idGroup = " + numberStream +
                '}';
    }
/**
 * Переопределение итератора 
 * @return
 */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {

            private int counter;

            @Override
            public boolean hasNext() {
                if(counter < stream.size())
                {
                    return true;
                }
                else
                {
                    return false;
                }            
            }

            @Override
            public StudentGroup next() {            
                return stream.get(counter++);
            }
        };   
    }   
}