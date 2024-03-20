package Example5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SomeList implements Iterable<String> {
    private List<String> stringList;
    SomeList(){
        stringList = new ArrayList<>();
    }
    public void addWord(String word){
        stringList.add(word);
    }
    @Override
    public Iterator<String> iterator() {
        return stringList.iterator();
    }
}
