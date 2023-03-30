package com.carparking.main;


/*Write a java Program for Car Parking lot of Housing Apartment:
Background of car parking systems, in housing apartment there are 2 type of parking
level one for 4 wheeler another for 2 wheeler.
Now we have to write a java program where residents will register their respective
 4 wheeler and 2 wheeler for the parking.

Save the resident information to Database with parking information.
Resident details like, 'name', 'email', 'flatNumber', 'mobileNumber', 'vechicleInfo'.
Under vehicleInfo, ‘type’ and ‘registrationNumber’.

Few Validation need to be,
     1. Phone number should be in the length of 10. If fails error message will be thrown as
     the "Mobile Number is invalid please enter again"

	 2. Vehicle details like 4 wheeler or 2 wheeler with valid registration number
	 (need to keep validation here, registration number should not be more than 8 character).
	 If fails error message will be thrown as the "Please provide valid registration number"

Create a hibernate xml application
create 2 table name "Resident" and "Vehicle". Resident table will be connected with Vehicle table in OneToOne relationship.*/


import com.carparking.dataSources.DataSources;
import com.carparking.entity.ResidentInformation;
import com.carparking.entity.VechicleInFo;
import com.carparking.service.ReservationService;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReservationMain {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        VechicleInFo vechicleInFo = new VechicleInFo();
        ResidentInformation residentInformation = new ResidentInformation();
        ReservationService reservationService = new ReservationService();
        DataSources dataSources = new DataSources();


        System.out.println("Well - Come to Classic Appartment & Prarking");

       /* System.out.println("Plz Enter Your ID ");
        int residentId = scanner.nextInt();
        residentInformation.setResidentId(residentId);
*/
        System.out.println("Plz Enter Your Name ");
        String name = scanner.next();
        residentInformation.setName(name);

        System.out.println("Plz Enter Your Mobile Number");
        long mobNumber = scanner.nextLong();
        if (reservationService.validateMobNumber((mobNumber))) {

            System.out.println("Correct Mobile Number");
            residentInformation.setMobNumber(mobNumber);
        } else {

            System.out.println("Invalid Mobile Number Plz Enter Again ");
        }

        System.out.println("Plz Enter Your Email ");
        String email = scanner.next();
        residentInformation.setEmail(email);

        System.out.println("Plz Enter Your Appartment No. ");
        int apt = scanner.nextInt();
        residentInformation.setApt(apt);

  /*      System.out.println("Plz Enter Your Vehicle Information  ");
        String vechicleInfo = scanner. next();
        residentInformation.setVechicleInFo(vechicleInfo);*/

  /*      System.out.println( "Plz Enter Your Vehicle ID" );
        int vechicleid = scanner.nextInt() ;
        vechicleInFo.setVechicleId(vechicleid);
*/
        System.out.println( "Plz Enter Your Vehicle Name" );
        String vechicleName = scanner.next() ;
        vechicleInFo.setVechicleName(vechicleName);

        System.out.println("Plz Enter Your Vehicle Type : 2 Wheeler or 4 Wheeler");
        int vechicleType = scanner.nextInt();
        vechicleInFo.setVechicleType(vechicleType);

     /* System.out.println( " Plz Enter Your Registration No " );
        int Registration_N = scanner.nextInt() ;    */

        System.out.println("Please Enter your Vehicle Registration");
        int registrationNumber = scanner.nextInt();
        if (vechicleType == 2) {
            if (reservationService.validateVichicleRegistration(registrationNumber)) {
                System.out.println("Successful Registration for 2 wheeler");
                vechicleInFo.setRegistrationNumber(registrationNumber);
            }
        } else if (vechicleType == 4) {
            if (reservationService.validateVichicleRegistration(registrationNumber)) {
                System.out.println("Successful Registration for 4 wheeler");
                vechicleInFo.setRegistrationNumber(registrationNumber);
            } else {
                System.out.println("Please provide valid registration number");
            }

        } else {
            System.out.println("invalid Vehicle type");
        }

        reservationService.displayInformation(residentInformation, vechicleInFo);

        dataSources.storeDataInDatabase(residentInformation, vechicleInFo);


    }

}
