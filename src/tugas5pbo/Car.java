/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5pbo;

/**
 *
 * @author farrelreginaldo
 */
public class Car {
private String carType;
private String polNum;
private String merk;
private boolean status;
public Car(String carType, String polNum,
String merk, boolean status){
this.carType = carType;
this.polNum = polNum;
this.merk = merk;
this.status = status;
}
public Car(String a, String b, String c){
this.carType = a;
this.polNum = b;
this.merk = c;
}
public String getCarType() {
return carType;
}
public String getPolNum() {
return polNum;
}
public String getMerk() {
return merk;
}
public boolean isStatus() {
return status;
}
public static void setStatus(String status) {
if (status == "true") {
System.out.println("MOBIL BERHASILDISEWA");
} else {
System.out.println("MAAF, MOBIL SUDAH DISEWA");
}
}
public static void status(){
Car.setStatus("true");
Car.setStatus("false");
Car.setStatus("true");
Car.setStatus("false");
}
}
