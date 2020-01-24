package HomeWork3;

import java.util.Objects;

public class Employee {
     double salary;
     String position;
     int age;

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         Employee employee = (Employee) o;
         return Double.compare(employee.salary, salary) == 0 &&
                 age == employee.age &&
                 Objects.equals(position, employee.position);
     }

     @Override
     public int hashCode() {
         return Objects.hash(salary, position, age);
     }
}
