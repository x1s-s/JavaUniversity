package task9.synchronizedCollection;

import lombok.AllArgsConstructor;

import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

@AllArgsConstructor
public class CollectionController<T> {
    protected Collection<T> firstElement;
    private final CollectionView<T> collectionView;
    protected final ReentrantLock lock = new ReentrantLock();


    public void addElement(T element) {
        new Thread(new MyRunnable<>(element) {
            @Override
            public void run() {
                lock.lock();
                if (firstElement == null || firstElement.getElement() == null) {
                    firstElement = new Collection<>(element);
                } else {
                    findLast().setNextElement(new Collection<>(element));
                }
                lock.unlock();
            }
        }).start();
    }

    public void editElement(T element, int index) {
        new Thread(new MyRunnable<>(element) {
            @Override
            public void run() {
                lock.lock();
                try {
                    findByIndex(index).setElement(element);
                } catch (Exception exception) {
                    System.out.println(exception.getMessage());
                }finally {
                    lock.unlock();
                }

            }
        }).start();
    }

    public void deleteElement(int index) {
        new Thread(() -> {
            lock.lock();
            try {
                if (index == 0) {
                    if (firstElement.getNextElement() == null) {
                        firstElement = null;
                    } else {
                        firstElement.setElement(firstElement.getNextElement().getElement());
                        firstElement.setNextElement(firstElement.getNextElement().getNextElement());
                    }
                } else {
                    Collection<T> temp = findByIndex(index - 1);
                    if (findByIndex(index) == findLast()) {
                        temp.setNextElement(null);
                    } else {
                        temp.setNextElement(temp.getNextElement().getNextElement());
                    }

                }
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            } finally {
                lock.unlock();
            }
        }).start();
    }

    protected Collection<T> findLast() {
        Collection<T> temp = firstElement;
        while (temp != null && temp.getNextElement() != null) {
            temp = temp.getNextElement();
        }
        return temp;
    }

    protected Collection<T> findByIndex(int n) {
        Collection<T> temp = firstElement;
        int i = 0;
        while (temp != null && i != n) {
            temp = temp.getNextElement();
            i++;
        }
        if (i != n) {
            throw new IndexOutOfBoundsException("Index error out of bounds");
        }
        return temp;
    }

    protected int length() {
        int length = 0;
        Collection<T> temp = firstElement;
        while (temp != null) {
            temp = temp.getNextElement();
            length++;
        }
        return length;
    }

    public void updateViews() {
        new Thread(() -> {
            lock.lock();
            collectionView.OutputCollection(firstElement);
            lock.unlock();
        }).start();
    }
}
