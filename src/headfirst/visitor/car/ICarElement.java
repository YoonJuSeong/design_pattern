package headfirst.visitor.car;

public interface ICarElement {
	void accept(ICarElementVisitor visitor);
}
