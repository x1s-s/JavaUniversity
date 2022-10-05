package task6.second;

import lombok.AllArgsConstructor;

import java.util.Arrays;
import java.util.Objects;
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

    public void editElement(T element, int index){
        try {
            collection.getArray()[index] = element;
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void deleteElement(int index){
        try {
            collection.getArray()[index] = null;
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
