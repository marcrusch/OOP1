import java.util.Objects;

public class File extends Element {
    private final long size;
    public File(String name, long size) {
        super(name);
        this.size = size;
    }
    public long getSize() {
        return this.size;
    }
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
        visitor.leave(this);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return size == file.size;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(size);
    }
}
