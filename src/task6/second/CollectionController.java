package task6.second;

import lombok.AllArgsConstructor;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

@AllArgsConstructor
public class CollectionController<T> {

    protected Collection<T> collection;
    private final CollectionView<T> collectionView;

    public void addElement(T element){
        T[] array = collection.getArray();
        for (int i = 0; i < array.length; i++) {
            if(array[i] == null){
                array[i] = element;
                return;
            }
        }
        array = Arrays.copyOf(array, array.length * 2);
        array[array.length / 2] = element;
        collection.setArray(array);
    }

    @SuppressWarnings("unchecked")
    public void editElement(Types type, int index, Scanner scanner){
        try {
            collection.getArray()[index] = null;
            collection.getArray()[index] = (T)Factory.getFromFactory(type, scanner);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void deleteElement(int index){
        try {
            collection.getArray()[index] = null;
            System.arraycopy(collection.getArray(), index + 1, collection.getArray(), index, collection.getArray().length - index - 1);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public void updateViews(){
        collectionView.OutputCollection(collection);
    }
    protected int length(){
        return (int)Stream.of(collection.getArray()).filter(Objects::nonNull).count();
    }
}
