/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5pbo;
import java.util.ArrayList;
public class CarData {
private static ArrayList <Car> carList = new
ArrayList<Car>();
public ArrayList<Car> getCarList() {
return carList;
}
public void setCarList(ArrayList<Car>
carList) {
CarData.carList = carList;
}
public void addCar(String carType, String
polNum, String merk){
Car car = new Car(carType, polNum, merk);
carList.add(car);
}
public void listOfCar(){
System.out.println("============================= ==");
System.out.println(" DAFTAR MOBIL ");
System.out.println("============================= ==");

System.out.println("TIPE MOBIL : " +data.getCarType());
System.out.println("NO.POLISI : " +data.getPolNum());
System.out.println("MERK MOBIL : " +data.getMerk());
System.out.println("-------------------------------");
}
}
