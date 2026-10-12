import java.util.ArrayList;

public class BasicCRUD {
    public static void main(String[] args) {
        ArrayList<String> students=new ArrayList<>();

        students.add("sai");
        students.add("abhi");
        students.add("mehul");

        System.out.println("students: "+students);

        students.set(1,"sai");
        System.out.println("after uppdate:"+students);

        students.remove("mehul");
        System.out.println("After delete:"+students);

    }
}
