import java.util.Arrays;

public class List {
    Object[] list;
    public List() {
        this.list = new Object[0];
    }
    public void add(Object element) {
        Object[] newList = new Object[this.list.length+1];
        for(int i = 0; i <= this.list.length-1; i++) {
            newList[i] = this.list[i];
        }
        this.list = newList;
        this.list[this.size()] = element;
    }
    public Object get(int position) {
        if(position > this.list.length-1) return null;
        return this.list[position];
    }
    public boolean contains(Object element) {
        for(Object item: this.list) {
            if(item == null) continue;
            if(item.equals(element)) {
                return true;
            }
        }
        return false;
    }
    public void remove(Object element) {
        boolean elementRemoved = false;
        for(int i = 0; i <= this.list.length-1; i++) {
            if(this.list[i] == null) continue;
            if(this.list[i].equals(element) && !elementRemoved) {
                this.list[i] = null;
                elementRemoved = true;
                continue;
            }
            if(this.list[i-1] != null) continue;
            this.list[i-1] = this.list[i];
            this.list[i] = null;
        }
    }
    public int size() {
        return Arrays.stream(this.list).filter(item -> item != null).toArray().length;
    }
}
