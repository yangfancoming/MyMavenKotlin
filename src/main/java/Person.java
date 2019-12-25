/**
 * Created by 64274 on 2018/6/19.
 */
public class Person
{
    public Person(String firstName){
        System.out.println(firstName);
    }

    public static void main(String... args){
        Person person = new Person("haha java");
        System.out.println(person);
    }
}

