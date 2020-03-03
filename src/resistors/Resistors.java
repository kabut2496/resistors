/**
 * Karl Butler
 * 03/03/2020
 * a program used to find the value of a resistor in ohms
 */

package resistors;
import javax.swing.*;
/**
 *
 * @author kabut2496
 */
public class Resistors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   //declaring variables
      String band1,band2,band3,all,all2;
      String band="";
      char x;
      int y=0;
      int z,nBand1,nBand2,nBand3;
      z=0;
      nBand1=0;
      nBand2=0;
      nBand3=0;
     //creatng array 
      String colour[] = new String[10];
      colour[0]="black";
      colour[1]="brown";
      colour[2]="red";
      colour[3]="orange";
      colour[4]="yellow";
      colour[5]="green";
      colour[6]="blue";
      colour[7]="violet";
      colour[8]="grey";
      colour[9]="white";
      //getting user inputs
      all = JOptionPane.showInputDialog("please input the clours of your resister with a - in between your clours ");
      all2=all;
     //changeing user input to lower case
      all=all.toLowerCase();
     //getting the value of the band
      for(int i=0;i<=all.length()-1;i++){
     
          x = all.charAt(i);
          band= band + x;
          if(x =='-'){
             y++;
             if(y==1){
              nBand1=z;  
             }else if(y==2){
                 nBand2=z;
             }else if(y==3){
                 nBand3=z;
             }
              band = "";
          }else if(colour[0].equals(band)){
              z=0;
          }else if(colour[1].equals(band)){
              z=1;
          }else if(colour[2].equals(band)){
              z=2;
          }else if(colour[3].equals(band)){
              z=3;
          }else if(colour[4].equals(band)){
              z=4;
          }else if(colour[5].equals(band)){
              z=5;
          }else if(colour[6].equals(band)){
              z=6;
          }else if(colour[7].equals(band)){
              z=7;
          }else if(colour[8].equals(band)){
              z=8;
          }else if(colour[9].equals(band)){
              z=9;
          }
      }
      //outputs
        System.out.println("yout enterd " + all2);
       System.out.println("the value of your resistors is "+(((nBand1*10)+nBand2)*10^nBand3) + "ohms");

    }
    
}
