public class armstrong {
	public static void main(String[] args) {
        int sum = 0;
        int temp;
        //System.out.println("Amstrong number btw 100-999 are :");
        for (int i = 100; i <= 999; i++) {
            
           

                temp = i % 10;
                sum = sum + (temp * temp * temp);
                i = i / 10;
                
            
            if (sum == i) {
                System.out.println(i);
            }
            
        }
    }
}



