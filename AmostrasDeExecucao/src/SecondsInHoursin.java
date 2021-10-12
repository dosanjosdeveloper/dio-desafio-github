import java.util.Scanner;

public class SecondsInHoursin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sec;
        sec = input.nextInt();
        int hour =  0   ;
        if(sec > 3600){
            hour = sec/3600;
            sec = sec-( hour * 3600 );
        }

        System.out.println("Segundos  "+sec);

        int min =  0;
        if(sec > 60){
            min = sec/60;
            sec = sec-( min * 60);
        }


        System.out.println(hour+":"+min+ ":"+sec);
    }
}
