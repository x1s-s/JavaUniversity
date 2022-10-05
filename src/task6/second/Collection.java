package task6.second;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Collection<T> {
    private T[] array;
    public Collection(T[] array){
        this.array = array;
    }
}
