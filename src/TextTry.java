/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author prathibha
 */
public class TextTry {

    /**
     * @param args the command line arguments
     */
    public void write(String str) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("text.txt")));
            bw.write(str);

            bw.newLine();

            bw.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void read() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("Details.txt")));
            //System.out.println(br.readLine());
            String nw;
            while ((nw = br.readLine()) != null) {

                System.out.println(nw);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ArrayList<String> addArray() {
        ArrayList<String> ar = new ArrayList<String>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("Details.txt")));
            //System.out.println(br.readLine());
            String nw;
            while ((nw = br.readLine()) != null) {
                if(!nw.contains("/*")){
                    ar.add(nw);
                }
                else{
                    System.out.println("comments");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return ar;
    }

    public String getUname(ArrayList array) {
        String Uname = null;
        int index;
        if (array.contains("#Uname")) {
            index = array.indexOf("#Uname");
            Uname = array.get(index+1).toString();
        }
        return Uname;
    }
    
    public String getPath1(ArrayList array) {
        String Path1 = null;
        int index;
        if (array.contains("#Path1")) {
            index = array.indexOf("#Path1");
            Path1 = array.get(index+1).toString();
        }
        return Path1;
    }
    
    public String getPath2(ArrayList array) {
        String Path2 = null;
        int index;
        if (array.contains("#Path2")) {
            index = array.indexOf("#Path2");
            Path2 = array.get(index+1).toString();
        }
        return Path2;
    }

    public String getUserID(ArrayList array) {
        String Userid = null;
        int index;
        if (array.contains("#userid")) {
            index = array.indexOf("#userid");
            Userid = array.get(index+1).toString();
        }
        return Userid;
    }

    /*

    public static void main(String[] args) {
        // TODO code application logic here]
        TextTry tx = new TextTry();
        //tx.write("hello");
        //tx.write("hii");

        //tx.read();
        //String x = tx.getpath(tx.addArray());
        //String y = tx.getuserID(tx.addArray());

        //System.out.println(x);
        //System.out.println(y);
        System.out.println(tx.addArray());
        
        //tx.read();
        //System.out.println(tx.addArray());

    }

    */
}
