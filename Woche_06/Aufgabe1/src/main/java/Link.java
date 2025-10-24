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
}
