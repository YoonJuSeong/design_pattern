package headfirst.visitor.car;

public class Body implements ICarElement{
    public void accept(ICarElementVisitor visitor) {
        visitor.visit(this);
    }
}
