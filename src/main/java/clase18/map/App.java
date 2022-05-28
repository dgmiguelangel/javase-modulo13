package clase18.map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		Map<Integer, String> sites = new HashMap<Integer, String>();
		sites.put(1, "clarin.com");
		sites.put(2, "infobae.com");
		sites.put(3, "aws.amazon.com");
		
		String res = null;
		
		for (Map.Entry<Integer, String> e : sites.entrySet()) {
			if(e.getValue().equals("infobae.com")) {
				res = e.getValue();
			}
		}		
		System.out.println("Modo tradicional: " + res);
		
				
		System.out.println("---------------------------------------");
		
		
		res = sites.entrySet().stream().filter(s -> s.getValue().equals("infobae.com"))
				.map(v -> v.getValue()).collect(Collectors.joining());
		
		System.out.println("Modo funcional: " + res);
		
		
		System.out.println("---------------------------------------");
		
		
		Map<Integer, String> resMap = sites.entrySet().stream().filter(s -> s.getValue().equals("infobae.com"))
				.collect(Collectors.toMap(v -> v.getKey(), v -> v.getValue()));
		
//		Map<Integer, String> resMap = sites.entrySet().stream().filter(s -> s.getValue().equals("infobae.com"))
//				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println("Modo funcional: " + resMap);

	}

}
