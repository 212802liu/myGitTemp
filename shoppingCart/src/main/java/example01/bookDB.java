package example01;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class bookDB {
	public static Map <String ,book> books=new LinkedHashMap<>();
	static {
		books.put("1",new book("1","java"));
		books.put("2",new book("2","jav"));
		books.put("3",new book("3","ja"));
		books.put("4",new book("4","j"));
		//books.put
	}
	public static Collection<book> getAll(){
		return books.values();
	}
	public static book getBook(String id) {
		return books.get(id);
	}
	
}
