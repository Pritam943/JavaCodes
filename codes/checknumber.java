import java.util.Scanner;

public class checknumber {

    private int num;
    public checknumber(int no){
        num = no;
    }
    public boolean checkEvenodd(){
        if(num%2 == 0){
           return true;
        }
        else {
            return false;
        }
    }
}

class fact {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int x = Integer.parseInt(in.nextLine());
            checknumber ob = new checknumber(x);
            if(ob.checkEvenodd()){
                System.out.println("Even");
            }
            else {
                System.out.println("odd");
            }
        }
        catch (Exception e){
            System.out.println("not valid");
        }
    }
}
