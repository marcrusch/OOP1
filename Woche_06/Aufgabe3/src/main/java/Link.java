import java.util.Objects;

public class Link extends Element {
    private final Element target;
    public Link(String name, Element target) {
        super(name);
        this.target = target;
    }
    @Override
    public long getSize() {
        return 4000;
    }
    public Element getTarget() {
        return this.target;
    }
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
        visitor.leave(this);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Link link = (Link) o;
        return Objects.equals(target, link.target);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(target);
    }
}
