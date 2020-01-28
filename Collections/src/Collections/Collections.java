package Collections;
import java.util.*;
public class Collections {
	public static void main(String[] args)
	{
		ArrayList<String> list1 =new ArrayList<>();
		list1.add("urmila");
		list1.add("vyshu");
		list1.add("pameela");
		list1.add("haritha");
		list1.add("triveni");
		ArrayList<String> list2 =new ArrayList<>();
		list2.add("sai");
		list1.addAll(list2);
		System.out.println(list1);
		
	}

}
