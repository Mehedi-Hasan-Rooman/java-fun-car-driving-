package com.company;

public class driving {



    public boolean start_engine (){
        System.out.println("Bhuuum Bhuuum Bhuum");
        return true;

    }

    public void gear_swifting (){

        System.out.println("Gear Shifted Completed ");

    }

    public void Horn(){
        System.out.println("Pickkkkkkkkkkkk pickkkkkkkkkkkkkkkkkkk pickkkkkkkkkkk");
    }

    public void Breaked (){
        System.out.println("You pressed break.... now you are slowing down");
    }

    public void Over_taking_cars(){
        System.out.println("you Speed is Incrementing now.... you are over taking other cars");

    }

    public void parking() {
        System.out.println(" Car in Parking now in ground floor.");
    }

    public int  speed (int gear, int KMH){

   return  (gear * KMH);

    }

}
