//--------------------------using buffered reader---------------------------
import java.io.*;
public class bin{
 
    
    public static void main(String [] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        String ageSr = br.readLine();
        int n= Integer.parseInt(ageSr);
        System.out.println( n);

        br.close();
        isr.close();
    }
}
