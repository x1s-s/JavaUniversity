package task7;

import lombok.AllArgsConstructor;

import javax.swing.JLabel;
import java.util.Arrays;

@AllArgsConstructor
public class CollectionController<T> {
    protected Collection<T> collection;
    private final CollectionView<T> collectionView;

    public void addElement(T element) {
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

    public void editElement(T element, String strIndex, JLabel label) {
        int index;
        try {
            index = Integer.parseInt(strIndex);
        } catch (Exception e) {
            label.setText("Неверный индекс");
            return;
        }
        try {
            collection.getArray()[index] = element;
        } catch (Exception e){
            label.setText("Неверный индекс");
        }
    }

    public void deleteElement(String strIndex, JLabel label) {
        int index;
        try {
            index = Integer.parseInt(strIndex);
        } catch (Exception e) {
            label.setText("Неверный индекс");
            return;
        }
        try {
            collection.getArray()[index] = null;
        } catch (Exception e){
            label.setText("Неверный индекс");
        }
    }


    public void updateViews(JLabel label) {
        collectionView.OutputCollection(collection, label);
    }
}
