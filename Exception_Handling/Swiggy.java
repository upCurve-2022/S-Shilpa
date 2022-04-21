package Exception_Handling;

import java.util.*;
class UnavailableException extends RuntimeException {
    public UnavailableException(String error) {
        super(error);
    }
    public UnavailableException(){
        super("Delivery is not available in your area!");
    }
}
public class Swiggy extends UnavailableException
{
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter zip code : ");
        String str = sc.nextLine();
        try{

            if (str.equals("123")||str.equals("456")||str.equals("789")) {
                throw new UnavailableException("Delivery is not available in your area!");
            }
            else{
                System.out.println("“Delivery available in your area!");
            }
        }
        catch(UnavailableException e){
            System.out.println("Delivery is not available in your area!");
        }
    }
}