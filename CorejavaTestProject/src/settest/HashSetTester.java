package settest;

import java.util.Set;

public class HashSetTester {

	public static void main(String[] args) {

		Set<Employee> emps = new TestSetImpl<>();
		emps.add(null);
		emps.add(new Employee("Shyam", "Kapoor"));
		emps.add(new Employee("Mannu", "Kapoor1"));
		emps.add(new Employee("Kunal", "Kapoor2"));
		emps.add(null);
		emps.add(new Employee("Shuv", "Kapoor4"));
		emps.add(null);
		emps.add(new Employee("Punit", "Kapoor5"));
		emps.add(new Employee("Ajay", "Kapoor6"));
		
		Employee[] empArr = new Employee[8];
		
		empArr = (Employee[]) emps.toArray(empArr);
		for(int l = 0; l<empArr.length; l++){
			System.out.println(empArr[l]);
		}
	}

}
