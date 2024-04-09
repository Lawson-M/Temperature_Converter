/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_3;

/**
 *
 * @author Lawson Meridith
 */

public class TemperatureConverter {
    /*Initialize variables for calculation*/
    private double temp;
    private String choice1;
    private String choice2;
         
    /*Constructor that sets given values to variables*/
    public TemperatureConverter(double t,String c1,String c2) {
        this.temp=t;
        this.choice1=c1;
        this.choice2=c2;
}
    /*Method that decides which Conversion Method to call*/
    public double Calc(){ 
        if(this.choice1.equals("Fahrenheit")&&this.choice2.equals("Celsius")){//tests input and decides method
            return F2C();
        }else if(this.choice1.equals("Celsius")&&this.choice2.equals("Fahrenheit")){
            return C2F();
        }else{
            return this.temp;
        }
        
    }
    /*Converts Fahrenheit to Celsius*/
    private double F2C(){
        double x = (this.temp-32);
        x = x * .5556;
        return x;
    }
    /*Converts Celsius to Fahrenheit*/
    private double C2F(){
        double x = this.temp*1.8;
        x = x + 32;
        return x;
    }
    
}
