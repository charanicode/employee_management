public class pattern {
    public static void main(String[] args) {
//        for (int i = 0; i <5 ; i++) {
//            for (int j = 0; j < 5-i-1; j++) {
//                System.out.print("-");
//            }
//            for (int j = 0; j <2*i+1; j++) {
//                System.out.print("*");
//            }
//            for (int j = 0; j < 5-i-1; j++) {
//                System.out.print("-");
//            }
//            System.out.println();
//        }
//        for (int i = 4; i >=0 ; i--) {
//            for (int j = 0; j < 4-i; j++) {
//                System.out.print("-");
//            }
//            for (int j = 0; j <2*i+1; j++) {
//                System.out.print("*");
//            }
//            for (int j = 0; j < 4-i; j++) {
//                System.out.print("-");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i <5 ; i++) {
//            for (int j = 0; j <=i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 5; i >0 ; i--) {
//            for (int j = 0; j <i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = 0; i <5 ; i++) {
            int start=1;
            if(i%2==0){
                start=1;
            }
            else{
                start=0;
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }

    }
}
