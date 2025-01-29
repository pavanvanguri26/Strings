0
// }

// import java.util.Scanner;
// public class Strings{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter a String:");
//         String input=sc.nextLine();
//         int VowelCount=0;
//         input=input.toLowerCase();
//         for(int i=0;i<input.length();i++){
//             char ch=input.charAt(i);
//             if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//                 VowelCount++;
//             }
//         }
//         System.out.println("No.of vowels in the string:"+ VowelCount);
//         sc.close();
//     }
// }

// import java.util.Scanner;
// public class Strings{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         String str=sc.nextLine();
//         String str="abcdf";
//         String str1="";
//         for(int i=str.length()-1;i>=0;i--){
//             str1=str1 +str.charAt(i);
//         }
//         sc.close();
//         System.out.println("Reversed string is:"+str1);
       
//     }
   
// }

// import java.util.Scanner;
// public class Strings{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter any integer");
//         int num=sc.nextInt();
//         if(num>0){
//             System.out.println("Positive");
//         }
//         else if(num<0){
//             System.out.println("negative");
//         }else{
//             System.out.println("zero");
//         }
//     }
// }

// public class Strings{
//     public static void main(String[] args) {
//         int a=54;
//         int b=99;
//         int c=83;
//         if(a>b){
//             if(a>c){
//                 System.out.println(" a is big ");
//             }
//             else{
//                 System.out.println("c is big");
//             }
//         }
//         else if(b>c){
//             if(b>a){
//                 System.out.println("b is big");
//             }else{
//                 System.out.println("a is big");
//             }
//         }
//     }
// }


public class Strings{
    public static void main(String[] args) {
        int year=2024;
        if(((year%4==0)&&(year%100!=0))||(year%400==0))
        {
            System.out.println("leap year");
        }else{
            System.out.println("not a leap year");
        }
    }
}