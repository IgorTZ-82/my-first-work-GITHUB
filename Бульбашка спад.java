import java.util.Arrays;
public class bullbespad {
    void bullbeArrayAscending (int [] array){
        boolean swapped = false;
        int size = array.length;
        do {
            for (int i=0; i< size-1; i++){
                for(int j=0; j<size-1 -i; j++){
                    if(array[j]< array[j+1]){
                        int temp =array[j];
                        array[j]= array[j+1];
                        array[j+1]=temp;
                        swapped=true;
                    }
                }
            }
        }while(swapped=false);
    }

    public static void main(String[] args) {
        int [] igorok ={1,4,5,2,3};
        bullbespad sort= new bullbespad();
        sort.bullbeArrayAscending(igorok);
        System.out.println(Arrays.toString(igorok));
    }


}
