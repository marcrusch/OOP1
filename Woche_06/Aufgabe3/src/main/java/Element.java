import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Element element = (Element) o;
        return Objects.equals(name, element.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}

