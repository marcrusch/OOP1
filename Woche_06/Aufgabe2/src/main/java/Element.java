public abstract class Element {
    protected final String name;
    public Element(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public abstract long getSize();
    public abstract void accept(FileSystemVisitor visitor);
}

