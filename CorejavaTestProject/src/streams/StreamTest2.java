package streams;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest2 {

	public static void main(String[] args) {
		
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("key1", "something1");
		map1.put("key2", "somethin2");
		map1.put("key3", "something");
		map1.put("key4", "something3");
		map1.put("key5", "something4");
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		
		
		String result = map1.entrySet().stream()
				.filter(map -> "something".equals(map.getValue()))
				.map(map->map.getValue())
				.collect(Collectors.joining());
		
		System.out.println("Result: "+ result);

/*			//Map -> Stream -> Filter -> MAP
			Map<Integer, String> collect = map2.entrySet().stream()
				.filter(map -> map.getKey() == 2)
				.collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
			
			collect.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));
*/
	}

}
