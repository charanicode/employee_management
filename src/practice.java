import java.util.ArrayList;

public class practice {
    public static void main(String[] args) {
//        ArrayList<Integer> array =new ArrayList<>();
//        array.add(10);
//        array.add(20);
//        array.add(30);
//        array.add(40);
//        array.add(50);
//        array.add(2,25);
//        array.remove(4);
//        for (int i = 0; i < array.size(); i++) {
//            System.out.println(array.get(i));
//        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(45);
        int largest=Integer.MIN_VALUE;
        int second_largest=arrayList.get(0);
        for (int i = 0; i <arrayList.size(); i++) {
            int current= arrayList.get(i);
            if(current>largest){
                second_largest=largest;
               largest=current;
            }
            else if(current>second_largest&& current!=largest){
                second_largest=current;
            }
        }
        System.out.println(largest);
        System.out.println(second_largest);
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(10);
//        arrayList.add(20);
//        arrayList.add(10);
//        arrayList.add(30);
//        arrayList.add(20);
//        arrayList.add(40);
//        ArrayList<Integer> result = new ArrayList<>();
//        for (int i = 0; i <arrayList.size(); i++) {
//            int current= arrayList.get(i);
//            if(!result.contains(current)){
//                result.add(current);
//            }
//        }
//        System.out.println(result);
//         ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(10);
//        arrayList.add(20);
//        arrayList.add(30);
//        arrayList.add(20);
//        arrayList.add(40);
//        arrayList.add(20);
//        int count=0;
//        for (int i = 0; i < arrayList.size(); i++) {
//            if (arrayList.get(i)==20){
//                count++;
//            }
//        }
//        System.out.println("20 appears "+count+ "times");
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(10);
//        arrayList.add(20);
//        arrayList.add(30);
//        arrayList.add(40);
//        arrayList.add(50);
//        int largest=Integer.MIN_VALUE;
//        int smallest=Integer.MAX_VALUE;
//        for (int i = 0; i < arrayList.size(); i++) {
//            int current=arrayList.get(i);
//            if(current>largest){
//                largest=current;
//            }
//            if(current<smallest){
//                smallest=current;
//            }
//        }
//        System.out.println("largest number: "+largest);
//        System.out.println("smallest number: "+smallest);
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("Ram");
//        arrayList.add("shyam");
//        arrayList.add("rahul");
//        arrayList.add("priya");
//        String key = "rahul";
//        boolean found=false;
//        for (int i = 0; i < arrayList.size(); i++) {
//            if (arrayList.get(i).equals(key)) {
//                found=true;
//            }
//        }
//        if(found){
//            System.out.println("Rahul Found");
//        }
//        else{
//            System.out.println("Rahul Not found");
//        }
    }
}
