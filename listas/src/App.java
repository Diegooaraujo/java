import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        
        List <String> list = new ArrayList<>();
		
		list.add("Diego");
		list.add("Alex");
		list.add("Bob");
		list.add("ana");
		list.add("maria");
		list.add(2, "marco");
		System.out.println(list.size());
		
		list.remove("maria");
		list.remove(2);
		
		for(String x:list) {
			System.out.println(x);
		}
		list.removeIf(x->x.charAt(0) == 'm');
		for(String x :list) {
			System.out.println(x);
		}
		 
		System.out.println("Index do diego:" + list.indexOf("Diego"));
         //filtra por primeira letra
        List<String> result = list.stream().filter(x -> x.charAt(0)=='a').collect(Collectors.toList());

        for(String x :result) {
            System.out.println(x);
        }
        //retorna o primeiroelemento
        String name = list.stream().filter(x->x.charAt(0) == 'a').findFirst().orElse(null);
        System.out.println(name);
    }
    
}
