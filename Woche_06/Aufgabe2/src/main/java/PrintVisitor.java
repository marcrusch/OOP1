import java.io.PrintStream;

public class PrintVisitor extends FileSystemVisitor {
    private PrintStream printStream;
    private Integer indent = 0;
    public PrintVisitor(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void visit(File file) {
        printStream.append("  ".repeat(indent)).append(file.getName()).append(" (").append(String.valueOf(file.getSize())).append(" byte)").append("\n");
    }

    @Override
    public void visit(Link link) {
        printStream.append("  ".repeat(indent)).append(link.getName()).append(" -> ").append(link.getTarget().getName()).append("\n");
    }

    @Override
    public void visit(Folder folder) {
        printStream.append("  ".repeat(indent)).append(folder.getName() + " (Folder)\n");
        indent++;
    }

    @Override
    public void leave(Folder folder) {
        indent--;
    }
}
