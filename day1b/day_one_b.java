import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class day_one_b{



    public static void main(String[] args){
        Scanner input;
        try {
            input = new Scanner(new File("input.txt"));
            ArrayList<Integer> data = new ArrayList<Integer>();
            while(input.hasNextInt())
            {
                 data.add(input.nextInt());
            }

            //System.out.println("data: " + data);
            int count = 0;
            for(int i=0;i<data.size()-3;i++){
                if(data.get(i+3)>data.get(i)){
                    count++;
                }
            }

            System.out.println("Window increments: " + count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}