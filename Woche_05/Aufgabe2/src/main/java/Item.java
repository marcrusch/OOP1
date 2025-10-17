public abstract class Item {
    protected final String description;

    protected Item(String description) {
        this.description = description;
    }
    public abstract Double getPrice();
    public abstract void print();
}
