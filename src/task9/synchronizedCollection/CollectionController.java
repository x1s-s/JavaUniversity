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
        T[] array = collection.getArray();
        for (int i = 0; i < array.length; i++) {
            if(array[i] == null){
                reentrantLock.lock();
                array[i] = element;
                reentrantLock.unlock();
                return;
            }
        }
        array = Arrays.copyOf(array, array.length * 2);
        array[array.length / 2] = element;
        reentrantLock.lock();
        collection.setArray(array);
        reentrantLock.unlock();
    }

    @SuppressWarnings("unchecked")
    public void editElement(Types type, int index, Scanner scanner){
        try {
            collection.getArray()[index] = null;
            reentrantLock.lock();
            collection.getArray()[index] = (T) Factory.getFromFactory(type, scanner);
            reentrantLock.unlock();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void deleteElement(int index){
        try {
            collection.getArray()[index] = null;
            reentrantLock.lock();
            System.arraycopy(collection.getArray(), index + 1, collection.getArray(), index, collection.getArray().length - index - 1);
            reentrantLock.unlock();
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
