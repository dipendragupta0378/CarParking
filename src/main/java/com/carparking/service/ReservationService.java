package com.carparking.service;

/*Few Validation need to be,
     1. Phone number should be in the length of 10. If fails error message will be thrown as the
     "Mobile Number is invalid please enter again"
	 2. Vehicle details like 4 wheeler or 2 wheeler with valid registration number (need to keep validation here,
	 registration number should not be more
	 than 8 character). If fails error message will be thrown as the "Please provide valid registration number"*/

import com.carparking.entity.ResidentInformation;
import com.carparking.entity.VechicleInFo;

public class ReservationService {

    public boolean validateMobNumber(long monNumber) {
        String mobNumberConverted = String.valueOf(monNumber);
        if (mobNumberConverted != null
                && mobNumberConverted.length() == 10) {
            return true;
        }
        return false;
    }

    public boolean validateVichicleRegistration(int Registration_N) {
        String Registration_NConverted = String.valueOf(Registration_N);
        if (Registration_NConverted != null
                && Registration_NConverted.length() <= 8) {
            return true;
        }
        return false;
    }

    public void displayInformation(ResidentInformation residentInformation, VechicleInFo vehicleInfo){
        System.out.println("Resident name:" + residentInformation.getName()+ "\n"
                +"Resident Mobile Number:" + residentInformation.getMobNumber() + "\n"
                +"Vehicle Type:" + vehicleInfo.getVechicleType() + "\n"
                +"Vehicle Registration Number:" + vehicleInfo.getRegistrationNumber());

    }

}




