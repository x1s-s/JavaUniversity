package task9.synchronizedCollection;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class MyRunnable<T> implements Runnable {
    protected T element;
}
