public class List {
    Object[] list;
    public void add(Object element) {
        this.list = new Object[this.list!=null?this.list.length+1:1];
        this.list[this.list.length-1] = element;
    }
    public Object get(int position) {
        if(this.size() <= position) return null;
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
        for(Object item: this.list) {
            if(item == null) continue;
            if(item.equals(element)) {
                item = null;
            }
        }
    }
    public int size() {
        return this.list.length;
    }
}
