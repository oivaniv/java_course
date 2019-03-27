import java.util.ArrayList;
import java.util.List;

public class Array {

    public String people[] = new String[5];


    public static void main(String[] args) {
        String people[] = new String[5];
        people[0] = "Pavlo";
        people[1] = "Anriy";
        people[2] = "Ostap";
        people[3] = "Sanya";
        people[4] = "Vitya";

        for (String person : people) {
            System.out.println(person);
        }

        List<String> peopleList=new ArrayList<String>();
        peopleList.add("gggg");
        peopleList.add("gggg");
        peopleList.add("gggg");
        peopleList.add("gggg");
        peopleList.add("aaaa");
        peopleList.add("gggg");
        peopleList.add("gggg");
        peopleList.remove("gggg")
    }



}
