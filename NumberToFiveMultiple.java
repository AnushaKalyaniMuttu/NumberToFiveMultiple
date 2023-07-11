import java.util.*;
import java.util.stream.Collectors;

public class NumberToFiveMultiple {
    public static void main(String args[]) {
    List<Integer> list=Arrays.asList(1,3,4,5,6);
		 
		 list.stream().map(n->n*5).collect(Collectors.toList()).forEach(System.out::println);
    }
}
