
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prathibha
 */
class CountAny {
    

    public int getCount() {

        int count = 0;
        try {
            if ( !new File("myCount.txt").exists())
                return 1;
            else {
                BufferedReader br = new BufferedReader(new FileReader(new File("myCount.txt")));
                String s = br.readLine();
                count = Integer.parseInt(s);
                br.close();
            }                
        } catch(Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public void putCount(int count) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("myCount.txt")));
            bw.write(Integer.toString(count));
            bw.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public String doMethod() { 
        int count = getCount();            
        System.out.println("You are running this program " + count + " number of times");
        count++;
        putCount(count);  
        return Integer.toString(count);
    }
    
    public void resetCount() { 
        int count = getCount();            
        //System.out.println("reset now your count"+count);
        count=0;
        putCount(count);            
    }
    
    public String getCounttolable() { 
        int count = getCount();            
        //putCount(count);  
        return Integer.toString(count);
    }
    
}
