public class OOP5_211 {
    public static void main(String[] args) {
        Person raj = new Person(false);
        raj.display("rajkumar");
        Person lina = new Person(true);
        lina.display("lina");
    }
}
class Person{
    boolean female = false;
    String name;
    String tag1 = "Mr ";
    String tag2 = "Ms ";
    Person(boolean female){
        this.female = female;
    }

    void display(String name){
        this.name = name;
        if(female == false){
            System.out.println("hello "+tag1+this.name+" how are you? ");
        }
        else{
            System.out.println("hello "+tag2+this.name+" how are you? ");
        }
    }


}