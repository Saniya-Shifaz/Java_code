package polymorphism.methodoverriding;

public class MethodOverridingDemo {
	public static void main(String[] args) {
		Parent p=new Parent();
		p.login("Gayatri", "123");
        p=new Child();
        p.login("David", "xyz");
	}

}
