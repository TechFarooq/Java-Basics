
import java.util.function.Predicate;

public class TicketBooking {
    public static void main(String[] args) {
        // TicketBooking tb=new TicketBooking();
        // System.out.println(tb.Test(65));
        Predicate<Integer> p=(amount)->(amount>60);
        System.out.println(p.test(55));
    } 
    public boolean Test(int amount){
        if(amount>60){
            return  true;
        }
        else{
            return  false;
        }
    }
}
