package task9.synchronizedCollection;

import task6.second.Types;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Stream;

public class CollectionController<T> {

    protected Collection<T> collection;
    private final CollectionView<T> collectionView;
    protected ReentrantLock reentrantLock = new ReentrantLock();

    public CollectionController(Collection<T> collection, CollectionView<T> collectionView) {
        this.collection = collection;
        this.collectionView = collectionView;
    }

    public void addElement(T element){
        reentrantLock.lock();
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
        reentrantLock.unlock();
    }

    @SuppressWarnings("unchecked")
    public void editElement(Types type, int index, Scanner scanner){
        reentrantLock.lock();
        try {
            collection.getArray()[index] = null;
            collection.getArray()[index] = (T) Factory.getFromFactory(type, scanner);
        } catch (Exception e){
            e.printStackTrace();
        }
        reentrantLock.unlock();
    }

    public void deleteElement(int index){
        reentrantLock.lock();
        try {
            collection.getArray()[index] = null;
            System.arraycopy(collection.getArray(), index + 1, collection.getArray(), index, collection.getArray().length - index - 1);
        } catch (Exception e){
            e.printStackTrace();
        }
        reentrantLock.unlock();
    }
    public void updateViews(){
        collectionView.OutputCollection(collection);
    }
    protected int length(){
        return (int)Stream.of(collection.getArray()).filter(Objects::nonNull).count();
    }
}
