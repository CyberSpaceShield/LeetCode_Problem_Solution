import java.util.*;

public class PowerOfTwo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = 0;
        if(n<=0){
            result=0;
        }
        else{
            for(int i=0;i<=31;i++){
                int power = (int) Math.pow(2, i);
                System.out.println("2^"+i+"="+power);
                if(power==n){
                    result=1;
                    break;
                }
                else if(power>n){
                     break;
                }
                else{
                    result=0;
                }
            }
        }
        System.out.println();
        if(result==1){
            System.out.println(n+" is a power of 2");
        }
        else{
            System.out.println(n+" is not a power of 2");
        }
    }
}
