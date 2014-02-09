import java.io.IOException;
import java.util.*;


public class Test {

	public static void main(String[] args) throws IOException {
		Map<String, Integer> m = new HashMap<String ,Integer>();
		m.put("a", 1);
		m.put("b", 1);
		m.put("c", 1);
		for(String k : m.keySet()) {
			
			m.put(k, 2);
		}
		for(String key : m.keySet()) {
			c.d(m.get(key));
		}
	}

}
