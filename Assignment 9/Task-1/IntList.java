import java.util.ArrayList;
class IntList {
    public ArrayList<Integer>data;
    public int currentSize, maxSize;

    public IntList(int maxSize) {
        data = new ArrayList<>(maxSize);
        this.maxSize = maxSize;
    }

    public void add(int item) { //add an item to the IntList
        if (currentSize == maxSize) {
            throw new IllegalStateException("the IntList is full, you cannot add another item to it!");
        } else {
            data.add(item);
        }
    }

    public void concat(IntList that) {
        if (currentSize + that.currentSize > maxSize) {
            throw new IllegalStateException("IntList is full");
        }
        for (int idx = 0; idx < that.currentSize; ++idx) {
            data.add(that.data.get(idx));
        }
        this.currentSize += that.currentSize;
    }

    public void removeItemsGreaterThan(int limit) {
        ArrayList<Integer> newData = new ArrayList<>(maxSize);
        
        int newCurrentSize = 0;

        for (int idx=0; idx < currentSize; ++idx) {
            int item = data.get(idx);
            if (item <= limit) {
                newData.add(item);
                newCurrentSize++;
            }
        }
        this.data = newData;
        this.currentSize = newCurrentSize;
    }
    public void getData(){
        for(int i = 0 ; i < data.size(); i++){
            System.out.println(data.get(i));
        }

    }

    @Override
    public String toString() {
        if (currentSize <= 0) {
            return "empty IntList";
        }
        StringBuilder sb = new StringBuilder();
        for (int idx = 0; idx < currentSize; ++idx) {
            int item = data.get(idx);
            sb.append(item);
            sb.append(",");
        }
        return sb.toString();
    }
}

class NamedIntList extends IntList{
    public String name;
    IntList a = new IntList(currentSize);

    public NamedIntList(int maxSize, String name) {
        super(maxSize);
        this.name = name;
        
    }

    @Override
    public String toString(){
        return a.toString() + this.name;
    }
    
}
