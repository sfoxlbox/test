package operators;
// import java.util.Scanner;
public class comparison {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int value1 = 1;
        int value2 = 2;
   
        if(value1 == value2)
        {
            System.out.println("Value 1 = Value 2");
        }
        else if(value1 != value2)
        {
            System.out.println("Value 1 not equal to Value 2");
       
            if(value1 > value2) {
                System.out.println(value1 +">"+ value2);
            }
            else if(value1 < value2){
                System.out.println(value1 +"<"+ value2);
            }
            if(value1 != value2) 
            {
                System.out.println(value1 +"!="+ value2);
            }
        }
    }}