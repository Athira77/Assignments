
public class swap {
	
	     public static final  <T> void swap(T[] array, int i , int j){
	         T temp = array[i];
	         array[i] = array[j];
	         array[j] = temp;
	     }

	    public static void main(String[] args) {
	        Integer [] a = {1,2,5,7,6,9,8};
	        swap(a,1,6);                           // swap Integer array
	        for(Integer e : a){
	            System.out.print(e +" ");
	        }
	        System.out.println();
	        String [] b = {"What","doing","you","are","?"};
	        swap(b,1,3);                                // swap String array
	        for (String s: b) {
	            System.out.print(s +" ");
	        }
	    }
	}



