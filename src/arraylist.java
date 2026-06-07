import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<>();
        array.add(85);
        array.add(90);
        array.add(78);
        array.add(92);
        array.add(88);
        array.add(76);
        array.add(95);
        System.out.println(array);
        int highest=Integer.MIN_VALUE;
        int lowest=Integer.MAX_VALUE;
        int count=0;
        int sum=0;
        for (int i :array) {
            sum+=i;
            if(i>80){
                count++;
            }
            if(i>highest){
                highest=i;
            }
            if(i<lowest){
                lowest=i;
            }
        }
        float average=(float) sum/array.size();
        System.out.println("Highest Mark: "+highest);
        System.out.println("Lowest Mark: "+lowest);
        System.out.println("Number of students above 80: "+count);
        System.out.println("Average marks: "+average);
    }
}
