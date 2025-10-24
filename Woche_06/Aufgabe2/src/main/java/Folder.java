import java.util.ArrayList;

public class Folder extends Element {
    private ArrayList<Element> entries = new ArrayList<Element>();
    public Folder(String name) {
        super(name);
    }
    public void addEntry(Element entry) {
        this.entries.add(entry);
    }
    public long getSize() {
        return entries.stream().mapToLong(Element::getSize).sum();
    }
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
        for (Element entry : entries) {
            entry.accept(visitor);
        }
        visitor.leave(this);
    }
}
