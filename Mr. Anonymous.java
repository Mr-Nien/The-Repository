import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
        int i, y = 0, j;
        double x, w, k, v;
        x = z.nextDouble();
        w = Math.sqrt(x);
        for (i = 0; i <= w; i++) {
            y = i * i;
            if (y == x) {
                System.out.println("It is a perfect square because "+i+" multiplied by "+i+" is "+y);
            }
        }
        if(y!=x){
        j = i * i;       
        k = x - y;
        v = j - x;
        if (k > v) {
            System.out.println("It is not a Perfect Square but \n The Nearest Perfect Square of The number is: " + j);
        } else {
            System.out.println("It is not a Perfect Square but \n The Nearest Perfect Square of The number is: " + y);
        }
        }
	}
}
	
