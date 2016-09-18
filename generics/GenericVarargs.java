
import java.util.*;

public class GenericVarargs {
	public static <T> List<T> makelist(T... args) {
		List<T> result = new ArrayList<T>();
		for (T item : args)
			result.add(item);
		return result;
	}
	
	public static void main(String[] args) {
	
		List<String> ls = makelist("A");
		
		System.out.println(ls);
		
		ls = makelist("a", "b", "c");
		System.out.println(ls);
		
		ls = makelist("123456789abcdefghigklmnopqrstuvwxyz".split(""));
		System.out.println(ls);
	}
}
