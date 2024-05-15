import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JAVA_basic_syntax{
    public static void main(String [] args){
        //-----------------------------------------INPUT in java----------------        
        // Scanner obj=new Scanner(System.in);//system.in says take input from console
        // int n=obj.nextInt(0); //.nextInt() says take input as int type
        // String str=obj.nextLine(); //nextLine() sayys take input as string type
        
        
     // -----------------------------------take input from array
    //  int arr[] = new int[10];
    //  for (int i = 0; i < arr.length; i++) {
    //     Scanner obj=new Scanner(System.in);
    //     arr[i]=obj.nextInt();        
    //  }

        //----------------------------------------ARRAY SYNTAX--------------------
        // int arr[]={2,34,2,5,6};
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }



        //----------------------------LEARN LEARN LEARN LEARN ---------------    
        //2. what is typecasting ?
        //3. String handling?

        //------------------------------CLASS METHOD AND OBJECT------------------------------
        // jatin obj= new jatin();
        // obj.n=15;
        // obj.show();
        // obj.show_N();

        //---------------multi level inheritance-----------
            // Animal a1 = new Animal();
            // a1.sound();
            // cat d1= new cat();
            // d1.sound();
            // d1.put();
            // d1.dhoom();
        
    
        // cat c1=new cat();
        // c1.sound();
        // c1.mwoe();
        // c1.bark();        
}

}


//------------------------------CLASS METHOD AND OBJECT------------------------------
// class jatin{
//     public void show(){
//         System.out.println("this function created inside jatin class");
//     }
//     public int n;
//     public void show_N(){
//         System.out.println(n);
//     }
    
// }


//---------------multi level inheritance-----------
// class Animal{
    //     public void sound(){
        //         System.out.println("animals--");
//     }

//     public void dhoom(){
    //         System.out.println("dhoom machcale--");
// }}
// class dog extends Animal{
//     public void sound(){
    //         System.out.println("Bark bark--");
    //     }
//     public void put(){
    //         System.out.println("this is dog class");
//     }
// }
// class cat extends dog{
//     public void sound(){
    //         System.out.println("meow meow");
//     }
// }
    



//---------------heirarchy inheritance-----------
// class animals{
//     public void sound(){
//         System.out.println("animal sound");
//     }
// }
// class dog extends animals{
//     public void bark(){
//         System.out.println("barking...");
//     }
// }
// class cat extends animals{
//     public void mwoe(){
//         System.out.println("meowing...");
//     }
// }
