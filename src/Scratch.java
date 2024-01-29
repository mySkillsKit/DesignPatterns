import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class Scratch {

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }

        public String toString() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    static class PersonComparator implements Comparator<Person> {
        @Override
        public int compare(Person person1, Person person2) {
            return person1.name.compareTo(person2.name);
        }
    }

    public static void main(String args[]) {
        checkMap(new HashMap<>());
        checkMap(new LinkedHashMap<>());
        checkMap(new TreeMap<>(new PersonComparator()));
    }

    private static void checkMap(Map<Person, String> map) {
        System.out.println("Checking " + map.getClass());
        for (int i = 0; i < 18; i++) {
            Person person = new Person("Name" + i);
            map.put(person, person.name);
        }
        Person ivan = new Person("Иван");
        Person peter = new Person("Пётр");
        Person maria1 = new Person("Мария");
        Person maria2 = new Person("Мария");
        map.put(ivan, ivan.name);
        map.put(peter, peter.name);
        map.put(maria1, maria1.name);
        map.put(maria2, maria2.name);
        //iterate and println
        for (Map.Entry<Person, String> entry : map.entrySet()) {
            int hashCode = entry.getKey().hashCode();
            int index = (map.size() - 1) & hashCode; // Calculate the index
            System.out.println(entry + " | Index: " + index +" | hashCode % map.size(): " + hashCode % map.size());
        }
        //  maria1.setName("Анна-Мария");
        maria2.setName("Анна-Мария");
        System.out.println("after changed name =====================================");

        for (Map.Entry<Person, String> entry : map.entrySet()) {
            int hashCode = entry.getKey().hashCode();
            int index = hashCode & (map.size() - 1); // Calculate the index
            System.out.println(entry + " | Index: " + index +" | hashCode % map.size(): " + hashCode % map.size());
        }

        System.out.println("map.get(maria1) = " + map.get(maria1));
        System.out.println("map.get(maria2) = " + map.get(maria2));
        System.out.println("==============*******=======================");
    }
}


