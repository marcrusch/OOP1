public class File extends Element {
    private final long size;
    public File(String name, long size) {
        super(name);
        this.size = size;
    }
    public long getSize() {
        return this.size;
    }
}
