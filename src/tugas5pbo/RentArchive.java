/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5pbo;

import java.util.ArrayList;
public class RentArchive {
private static ArrayList <CarRent> rentData =
new ArrayList<CarRent>();
public void Rent(CarRider rider, Car car, int rentDur){
CarRent rent = new CarRent(rider, car,
rentDur);
rentData.add(rent);
}
public void info(){
System.out.println("============================= ==");
System.out.println(" INFORMASI PELANGGAN ");
System.out.println("============================= ==");
for (CarRent data : RentArchive.rentData) {
System.out.println("NAMA PEMINJAM : " + data.getRider().getName());
System.out.println("TIPE MOBIL : " + data.getCar().getCarType());
System.out.println("NO. POLISI : " + data.getCar().getPolNum());

System.out.println("LAMA RENTAL : " + data.getRentDur());
System.out.println("-------------------------------");
}
}
}