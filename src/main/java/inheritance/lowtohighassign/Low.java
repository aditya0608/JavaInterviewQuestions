package inheritance.lowtohighassign;

class High
{
    String high="high";
}
public class Low extends  High{

    public static void main(String[] args) {
        Low low=new Low();
        low.high="LOW";
        System.out.println(low.high);
    }
}
