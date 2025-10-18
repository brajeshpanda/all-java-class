 package p2;

 
import java.io.BufferedWriter;

import java.io.FileWriter;



 public class B
 {
public static void main(String[] args) {
 try
 {
 FileWriter fw= new FileWriter("E://test.txt");
   BufferedWriter bw= new BufferedWriter(fw);
   bw.write("brajesh");
   bw.newLine();
   bw.write("panda");
   bw.newLine();
   bw.write("bp");
   bw.close();
   fw.close();
 }
 catch(Exception e) 
 {
 e.printStackTrace();
 }
 }
 }

