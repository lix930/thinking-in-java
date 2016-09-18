public class GenericMethods {
	public <T,M,N> void f(T x,M m,N n) {
		System.out.println(x.getClass().getName());
		System.out.println(m.getClass().getName());
		System.out.println(n.getClass().getName());
	}
	
	public static void main(String[] args) {
		GenericMethods gm = new GenericMethods();
		
		gm.f("hello",gm,123);
		
	}
}
