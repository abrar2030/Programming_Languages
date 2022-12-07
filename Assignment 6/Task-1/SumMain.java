import java.io.*;
import java.util.Scanner;

public class SumMain {
    public static void main(String[] args){
        File input = new File(args[0]);
        File ouput = new File(args[1]);
        Scanner sc = null;
        
        
        try{
            sc = new Scanner(input);
            
            PrintWriter pw = new PrintWriter(ouput);
            
            while(sc.hasNextLine()){
                int idx1 = 0;
                int idx2 = 0;
                String []values = sc.nextLine().replace(" ", ",").split(",");
                for(int i = 1 ; i < values.length; i++){
                    int res = Integer.parseInt(values[0]);
                    int valk = Integer.parseInt(values[i]);
                    for(int j = 1; j<values.length;j++){
                        int valj = Integer.parseInt(values[j]);
                        if(i != j){
                            if(valk + valj == res){
                            idx1 = i;
                            idx2 = j;
                            break;
                        }
                    }
                         
                    }
                    if (idx1 != 0 && idx2 !=0) break;
                }
                pw.print(values[0]+ " ");
                if(idx1 == 0 && idx2 ==0) pw.print("none");
                else{
                    pw.print(values[idx1]+" ");
                    pw.println(values[idx2]);
                }
                
                
            
            
            
            }
            sc.close();
            pw.close();

        }catch (FileNotFoundException e) {
            System.out.println("unable to access file" + args[0]);
        }
    }
    
}
