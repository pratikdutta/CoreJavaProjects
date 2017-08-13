package finalModifier;

import java.util.ArrayList;
import java.util.List;

public class FinalModifierClass {

	public static void main(String[] args) {
		List<Person> pList = new ArrayList<>();
		final Person p = new Person();
		final Person p123 = p;
		pList.add(p);
		pList.get(0).setName("P1");
		pList.get(0).setAge(12);
		System.out.println(p);
		p123.setAge(23);
		System.out.println(p123);
	}
}
