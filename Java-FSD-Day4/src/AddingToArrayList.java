import java.util.ArrayList;

public class AddingToArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
        names.add("Fred");
        names.add("Josh");
        names.add("Nicky");
        names.add("Hank");
        System.out.println(names);

        // getting element on a specified index
        System.out.println(names.get(1));

        // adding the element on a specific index
        names.add(1, "John");
        System.out.println(names);

        // merge two list
        ArrayList<String> newNames = new ArrayList<>();
        newNames.add("Tim");
        newNames.add("Bill");
        names.addAll(newNames);

        // adding second list element to the specified position
       // names.addAll(0, newNames);

        System.out.println(names);

        // remove
        //names.remove("Fred");
        System.out.println(names);

        // remote
        //names.remove(0);
        System.out.println(names);

        names.removeAll(newNames);
        System.out.println(names);

        // removing an element based on condition
        names.removeIf(name -> name.contains("Josh"));
        System.out.println(names);
		
	}

}
