package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        cars Cars = new cars();
        System.out.println("Sir Select Your Today Driving Car :    ");
        System.out.println("1."+Cars.car_1 +" 2."+Cars.car_2 + " 3."+Cars.car_3 + " 4."+Cars.car_4);
        Scanner  input = new Scanner(System.in);
        int user_inpur_number = input.nextInt();

        switch (user_inpur_number ){

            //User Select Car
            case 1 :
                System.out.println("Thanks Sir Today Your Car is : " +Cars.car_1);
                System.out.println("Are You Start Driving is Car (Y/N) ?");
                String user_answer = input.next().toLowerCase();
                if (user_answer.equals("y")){
                    System.out.println("Please Select Your Today Diving Model  " +Cars.car_1 +" ???");
                    System.out.println("Cars Available : \n" + "1=> "+Cars.car1_model1 +" 2=>" + Cars.car1_model2 +" 3=>"+  Cars.car1_model3 + " (Select According To Number.)");
                    int User_car_select = input.nextInt();


                    //User Select Car model
                    switch (User_car_select){

                        //User Select Car model 1
                        case 1 :
                            System.out.println("You Selected : " +Cars.car1_model1);
                            System.out.println(Cars.car1_model1 +" is Started ....  " +
                                    "\n  Select Your Driving Version  1. " + Cars.version + " 2." +Cars.version_1 + " 3." +Cars.version_2 );
                            int driving_version_input = input.nextInt();

                            // Car One Driving Version
                            switch (driving_version_input){

                                //driving version one
                                case 1:
                                    System.out.println("Thanks Sir You Chose  " + Cars.version + " (Mode)");
                                    System.out.println( Cars.car1_model1 +" is Started 0_0 " + Cars.start_engine());
                                    int cars_gear = Cars.gears;
                                    System.out.println("You Have : " + cars_gear + " Gears ....     for Increasing Speed ?? (Gear Number)");
                                    int gear_input = input.nextInt();
                                    // 1st Driving mode Gear Input
                                  switch (gear_input){
                                      case 1:
                                          Cars.gear_swifting();
                                          System.out.println(" Your Now 1st Gear your Average Speed now " );
                                          System.out.println("Now Your Running Speed is " +   Cars.speed(1,35) +" KMH" );
                                          break;

                                      case 2:
                                          Cars.gear_swifting();
                                          System.out.println(" Your Now 2nd Gear your Avarage Speed now " );
                                          System.out.println("Now Your Running Speed is " +   Cars.speed(2,35) +" KMH" );
                                          break;

                                      case 3:
                                          Cars.gear_swifting();
                                          System.out.println(" Your Now 3rd Gear your Avarage Speed now " );
                                          System.out.println("Now Your Running Speed is " +   Cars.speed(3,35) +" KMH" );
                                          break;

                                      case 4:
                                          Cars.gear_swifting();
                                          System.out.println(" Your Now 4th Gear your Avarage Speed now " );
                                          System.out.println("Now Your Running Speed is " +   Cars.speed(4,35) +" KMH" );
                                          break;

                                      case 5:
                                          Cars.gear_swifting();
                                          System.out.println(" Your Now 5th Gear your Avarage Speed now " );
                                          System.out.println("Now Your Running Speed is " +   Cars.speed(5,35) +" KMH" );
                                          break;

                                      case 6:
                                          Cars.gear_swifting();
                                          System.out.println(" Your Now 6th Gear your Avarage Speed now " );
                                          System.out.println("Now Your Running Speed is " +   Cars.speed(6,35) +" KMH" );
                                          break;

                                      default:
                                          System.out.println("Fucker Select Right Number for Gear Swifting ");

                                  }

                                    break;

                                  // car 1 2nd driving version
                                case 2:
                                    System.out.println("Thanks Sir You Chose  " + Cars.version_1 + " (Mode)");
                                    System.out.println( Cars.car1_model2 +" is Started 0_0 " + Cars.start_engine());
                                    System.out.println("You Have " +Cars.gears + " Gears ....     for Increasing Speed ?? (Gear Number)");
                                    int gear_input1 = input.nextInt();
                                    // car1 model2 gear input
                                    switch (gear_input1){
                                        case 1:
                                            Cars.gear_swifting();
                                            System.out.println(" Your Now 1st Gear your Average Speed now " );
                                            System.out.println("Now Your Running Speed is " +   Cars.speed(1,40) +" KMH" );

                                            break;

                                        case 2:
                                            Cars.gear_swifting();
                                            System.out.println(" Your Now 2nd Gear your Average Speed now " );
                                            System.out.println("Now Your Running Speed is " +   Cars.speed(2,40) +" KMH" );

                                            break;

                                        case 3:
                                            Cars.gear_swifting();
                                            System.out.println(" Your Now 3rd Gear your Average Speed now " );
                                            System.out.println("Now Your Running Speed is " +   Cars.speed(3,40) +" KMH" );
                                            break;

                                        case 4:
                                            Cars.gear_swifting();
                                            System.out.println(" Your Now 4th Gear your Avarage Speed now " );
                                            System.out.println("Now Your Running Speed is " +   Cars.speed(4,40) +" KMH" );
                                            break;

                                        case 5:
                                            Cars.gear_swifting();
                                            System.out.println(" Your Now 5th Gear your Avarage Speed now " );
                                            System.out.println("Now Your Running Speed is " +   Cars.speed(5,40) +" KMH" );
                                            break;

                                        case 6:
                                            Cars.gear_swifting();
                                            System.out.println(" Your Now 6th Gear your Avarage Speed now " );
                                            System.out.println("Now Your Running Speed is " +   Cars.speed(6,40) +" KMH" );
                                            break;

                                        default:
                                            System.out.println("Fucker Select Right Number for Gear Swifting ");

                                    }

                                    break;

                                // car 1 3rd driving version
                                case 3:
                                    System.out.println("Thanks Sir You Chose  " + Cars.version_2 + " (Mode)");
                               String cars_this = Cars.car1_model3;
                                    System.out.println( cars_this +" is Started 0_0 " + Cars.start_engine());
                                    System.out.println("You Have " +Cars.gears + " Gears ....     for Increasing Speed ?? (Gear Number)");
                                    int gear_input2 = input.nextInt();
                                    switch (gear_input2){
                                        case 1:
                                            Cars.gear_swifting();
                                            System.out.println(" Your Now 1st Gear your Average Speed now " );
                                            System.out.println("Now Your Running Speed is " +   Cars.speed(1,25) +" KMH" );

                                            break;

                                        case 2:
                                            Cars.gear_swifting();
                                            System.out.println(" Your Now 2nd Gear your Average Speed now " );
                                            System.out.println("Now Your Running Speed is " +   Cars.speed(2,25) +" KMH" );

                                            break;

                                        case 3:
                                            Cars.gear_swifting();
                                            System.out.println(" Your Now 3rd Gear your Average Speed now " );
                                            System.out.println("Now Your Running Speed is " +   Cars.speed(3,25) +" KMH" );
                                            break;

                                        case 4:
                                            Cars.gear_swifting();
                                            System.out.println(" Your Now 4th Gear your Average Speed now " );
                                            System.out.println("Now Your Running Speed is " +   Cars.speed(4,25) +" KMH" );
                                            break;

                                        case 5:
                                            Cars.gear_swifting();
                                            System.out.println(" Your Now 5th Gear your Average Speed now " );
                                            System.out.println("Now Your Running Speed is " +   Cars.speed(5,25) +" KMH" );
                                            break;

                                        case 6:
                                            Cars.gear_swifting();
                                            System.out.println(" Your Now 6th Gear your Average Speed now " );
                                            System.out.println("Now Your Running Speed is " +   Cars.speed(6,25) +" KMH" );
                                            break;

                                        default:
                                            System.out.println("Fucker Select Right Number for Gear Swifting ");

                                    }
                                    break;
                                default:
                                    System.out.println("Fucking Loser Do to Hell  (0_0)");
                            }

                            break;


                        //User Select Car2
                        case 2:
                            System.out.println("Thanks For Select : " +Cars.car1_model2);
                            System.out.println(Cars.car1_model2 +" is Started ....  " +
                                    "\n  Select Your Driving Version  1. " + Cars.version + " 2." +Cars.version_1 + " 3." +Cars.version_2 );
                            int driving_version_input2 = input.nextInt();
                         //User Car2 mode Version
                            switch (driving_version_input2){
                                case 1:
                                    System.out.println("Thanks Sir You Chose  " + Cars.version + " (Mode)");
                                    System.out.println( Cars.car1_model2 +" is Started 0_0 " + Cars.start_engine());
                                    System.out.println("You Have " +Cars.gears + " Gears ....     for Increasing Speed ?? (Gear Number)");
                                    int gear_input = input.nextInt();
                                    int cars_gear = Cars.gears;
                                    switch (gear_input){
                                        case 1:
                                            Cars.gear_swifting();
                                            System.out.println(" Your Now 1st Gear your Average Speed now " );
                                            System.out.println("Now Your Running Speed is " +   Cars.speed(1,45) +" KMH" );
                                            break;

                                        case 2:
                                            Cars.gear_swifting();
                                            System.out.println(" Your Now 2nd Gear your Average Speed now " );
                                            System.out.println("Now Your Running Speed is " +   Cars.speed(2,45) +" KMH" );
                                            break;

                                        case 3:
                                            Cars.gear_swifting();
                                            System.out.println(" Your Now 3rd Gear your Average Speed now " );
                                            System.out.println("Now Your Running Speed is " +   Cars.speed(3,45) +" KMH" );
                                            break;

                                        case 4:
                                            Cars.gear_swifting();
                                            System.out.println(" Your Now 4th Gear your Average Speed now " );
                                            System.out.println("Now Your Running Speed is " +   Cars.speed(4,45) +" KMH" );
                                            break;

                                        case 5:
                                            Cars.gear_swifting();
                                            System.out.println(" Your Now 5th Gear your Avarage Speed now " );
                                            System.out.println("Now Your Running Speed is " +   Cars.speed(5,45) +" KMH" );
                                            break;

                                        case 6:
                                            Cars.gear_swifting();
                                            System.out.println(" Your Now 6th Gear your Average Speed now " );
                                            System.out.println("Now Your Running Speed is " +   Cars.speed(6,45) +" KMH" );
                                            break;

                                        default:
                                            System.out.println("Fucker Select Right Number for Gear Swifting ");

                                    }
                                    break;

                                case 2:
                                    System.out.println("Thanks Sir You Chose  " + Cars.version_1 + " (Mode)");
                                    System.out.println( Cars.car1_model2 +" is Started 0_0 " + Cars.start_engine());
                                    System.out.println("You Have " +Cars.gears + " Gears ....     for Increasing Speed ?? (Gear Number)");
                                    int gear_input2 = input.nextInt();
                                    switch (gear_input2){
                                        case 1:
                                            Cars.gear_swifting();
                                            System.out.println(" Your Now 2nd Gear your Avarage Speed now " );
                                            System.out.println("Now Your Running Speed is " +   Cars.speed(1,50) +" KMH" );
                                            break;

                                        case 2:
                                            Cars.gear_swifting();
                                            System.out.println(" Your Now 2nd Gear your Avarage Speed now " );
                                            System.out.println("Now Your Running Speed is " +   Cars.speed(2,50) +" KMH" );

                                            break;

                                        case 3:
                                            Cars.gear_swifting();
                                            System.out.println(" Your Now 2nd Gear your Avarage Speed now " );
                                            System.out.println("Now Your Running Speed is " +   Cars.speed(3,50) +" KMH" );
                                            break;

                                        case 4:
                                            Cars.gear_swifting();
                                            System.out.println(" Your Now 2nd Gear your Avarage Speed now " );
                                            System.out.println("Now Your Running Speed is " +   Cars.speed(4,50) +" KMH" );
                                            break;

                                        case 5:
                                            Cars.gear_swifting();
                                            System.out.println(" Your Now 2nd Gear your Avarage Speed now " );
                                            System.out.println("Now Your Running Speed is " +   Cars.speed(5,50) +" KMH" );
                                            break;

                                        case 6:
                                            Cars.gear_swifting();
                                            System.out.println(" Your Now 2nd Gear your Avarage Speed now " );
                                            System.out.println("Now Your Running Speed is " +   Cars.speed(6,50) +" KMH" );
                                            break;

                                        default:
                                            System.out.println("Fucker Select Right Number for Gear Swifting ");

                                    }

                                    break;

                                case 3:
                                    System.out.println("Thanks Sir You Chose  " + Cars.version_2 + " (Mode)");
                                    System.out.println( Cars.car1_model2 +" is Started 0_0 " + Cars.start_engine());
                                    System.out.println("You Have " +Cars.gears + " Gears ....     for Increasing Speed ?? (Gear Number)");
                                    int gear_input3 = input.nextInt();
                                    switch (gear_input3){
                                        case 1:
                                            Cars.gear_swifting();
                                            System.out.println(" Your Now 2nd Gear your Avarage Speed now " );
                                            System.out.println("Now Your Running Speed is " +   Cars.speed(1,20) +" KMH" );
                                            break;

                                        case 2:
                                            Cars.gear_swifting();
                                            System.out.println(" Your Now 2nd Gear your Avarage Speed now " );
                                            System.out.println("Now Your Running Speed is " +   Cars.speed(2,20) +" KMH" );

                                            break;

                                        case 3:
                                            Cars.gear_swifting();
                                            System.out.println(" Your Now 2nd Gear your Avarage Speed now " );
                                            System.out.println("Now Your Running Speed is " +   Cars.speed(3,20) +" KMH" );
                                            break;

                                        case 4:
                                            Cars.gear_swifting();
                                            System.out.println(" Your Now 2nd Gear your Avarage Speed now " );
                                            System.out.println("Now Your Running Speed is " +   Cars.speed(4,20) +" KMH" );
                                            break;

                                        case 5:
                                            Cars.gear_swifting();
                                            System.out.println(" Your Now 2nd Gear your Avarage Speed now " );
                                            System.out.println("Now Your Running Speed is " +   Cars.speed(5,20) +" KMH" );
                                            break;

                                        case 6:
                                            Cars.gear_swifting();
                                            System.out.println(" Your Now 2nd Gear your Avarage Speed now " );
                                            System.out.println("Now Your Running Speed is " +   Cars.speed(6,20) +" KMH" );
                                            break;

                                        default:
                                            System.out.println("Fucker Select Right Number for Gear Swifting ");

                                    }
                                    break;

                                default:
                                    System.out.println("Fucking Loser Do to Hell  (0_0)");
                            }
                            break;



                        //User Select Car1 model 3
                            case 3:
                                System.out.println("Thanks For Select : " +Cars.car1_model3);
                                System.out.println(Cars.car1_model3 +" is Started ....  " +
                                        "\n  Select Your Driving Version  1. " + Cars.version + " 2." +Cars.version_1 + " 3." +Cars.version_2 );
                                int driving_version_input3 = input.nextInt();

                                // car 3 Driving Version Input
                                switch (driving_version_input3){
                                    case 1:
                                        System.out.println("Thanks Sir You Chose  " + Cars.version + " (Mode)");
                                        System.out.println( Cars.car1_model2 +" is Started 0_0 " + Cars.start_engine());
                                        System.out.println("You Have " +Cars.gears + " Gears ....     for Increasing Speed ?? (Gear Number)");
                                        int gear_input = input.nextInt();
                                        switch (gear_input){
                                            case 1:
                                                Cars.gear_swifting();
                                                System.out.println(" Your Now 1st Gear your Average Speed now " );
                                                System.out.println("Now Your Running Speed is " +   Cars.speed(1,32) +" KMH" );
                                                break;

                                            case 2:
                                                Cars.gear_swifting();
                                                System.out.println(" Your Now 2nd Gear your Average Speed now " );
                                                System.out.println("Now Your Running Speed is " +   Cars.speed(2,35) +" KMH" );

                                                break;

                                            case 3:
                                                Cars.gear_swifting();
                                                System.out.println(" Your Now 3rd Gear your Average Speed now " );
                                                System.out.println("Now Your Running Speed is " +   Cars.speed(3,35) +" KMH" );
                                                break;

                                            case 4:
                                                Cars.gear_swifting();
                                                System.out.println(" Your Now 2nd Gear your Average Speed now " );
                                                System.out.println("Now Your Running Speed is " +   Cars.speed(4,35) +" KMH" );
                                                break;

                                            case 5:
                                                Cars.gear_swifting();
                                                System.out.println(" Your Now 2nd Gear your Average Speed now " );
                                                System.out.println("Now Your Running Speed is " +   Cars.speed(5,35) +" KMH" );
                                                break;

                                            case 6:
                                                Cars.gear_swifting();
                                                System.out.println(" Your Now 2nd Gear your Average Speed now " );
                                                System.out.println("Now Your Running Speed is " +   Cars.speed(6,35) +" KMH" );
                                                break;

                                            default:
                                                System.out.println("Fucker Select Right Number for Gear Swifting ");

                                        }

                                    case 2:
                                        System.out.println("Thanks Sir You Chose  " + Cars.version_1 + " (Mode)");
                                        System.out.println( Cars.car1_model2 +" is Started 0_0 " + Cars.start_engine());
                                        System.out.println("You Have " +Cars.gears + " Gears ....     for Increasing Speed ?? (Gear Number)");
                                        int gear_input2 = input.nextInt();
                                        switch (gear_input2){
                                            case 1:
                                                Cars.gear_swifting();
                                                System.out.println(" Your Now 1st Gear your Average Speed now " );
                                                System.out.println("Now Your Running Speed is " +   Cars.speed(1,42) +" KMH" );
                                                break;

                                            case 2:
                                                Cars.gear_swifting();
                                                System.out.println(" Your Now 2nd Gear your Average Speed now " );
                                                System.out.println("Now Your Running Speed is " +   Cars.speed(2,45) +" KMH" );

                                                break;

                                            case 3:
                                                Cars.gear_swifting();
                                                System.out.println(" Your Now 3rd Gear your Average Speed now " );
                                                System.out.println("Now Your Running Speed is " +   Cars.speed(3,45) +" KMH" );
                                                break;

                                            case 4:
                                                Cars.gear_swifting();
                                                System.out.println(" Your Now 2nd Gear your Average Speed now " );
                                                System.out.println("Now Your Running Speed is " +   Cars.speed(4,45) +" KMH" );
                                                break;

                                            case 5:
                                                Cars.gear_swifting();
                                                System.out.println(" Your Now 2nd Gear your Average Speed now " );
                                                System.out.println("Now Your Running Speed is " +   Cars.speed(5,45) +" KMH" );
                                                break;

                                            case 6:
                                                Cars.gear_swifting();
                                                System.out.println(" Your Now 2nd Gear your Average Speed now " );
                                                System.out.println("Now Your Running Speed is " +   Cars.speed(6,45) +" KMH" );
                                                break;

                                            default:
                                                System.out.println("Fucker Select Right Number for Gear Swifting ");

                                        }

                                    case 3:
                                        System.out.println("Thanks Sir You Chose  " + Cars.version_2 + " (Mode)");
                                        System.out.println( Cars.car1_model2 +" is Started 0_0 " + Cars.start_engine());
                                        System.out.println("You Have " +Cars.gears + " Gears ....     for Increasing Speed ?? (Gear Number)");
                                        int gear_input3 = input.nextInt();
                                        switch (gear_input3){
                                            case 1:
                                                Cars.gear_swifting();
                                                System.out.println(" Your Now 1st Gear your Average Speed now " );
                                                System.out.println("Now Your Running Speed is " +   Cars.speed(1,19) +" KMH" );
                                                break;

                                            case 2:
                                                Cars.gear_swifting();
                                                System.out.println(" Your Now 2nd Gear your Average Speed now " );
                                                System.out.println("Now Your Running Speed is " +   Cars.speed(2,19) +" KMH" );

                                                break;

                                            case 3:
                                                Cars.gear_swifting();
                                                System.out.println(" Your Now 3rd Gear your Average Speed now " );
                                                System.out.println("Now Your Running Speed is " +   Cars.speed(3,19) +" KMH" );
                                                break;

                                            case 4:
                                                Cars.gear_swifting();
                                                System.out.println(" Your Now 2nd Gear your Average Speed now " );
                                                System.out.println("Now Your Running Speed is " +   Cars.speed(4,19) +" KMH" );
                                                break;

                                            case 5:
                                                Cars.gear_swifting();
                                                System.out.println(" Your Now 2nd Gear your Average Speed now " );
                                                System.out.println("Now Your Running Speed is " +   Cars.speed(5,19) +" KMH" );
                                                break;

                                            case 6:
                                                Cars.gear_swifting();
                                                System.out.println(" Your Now 2nd Gear your Average Speed now " );
                                                System.out.println("Now Your Running Speed is " +   Cars.speed(6,19) +" KMH" );
                                                break;

                                            default:
                                                System.out.println("Fucker Select Right Number for Gear Swifting ");

                                        }
                                }



                            default:
                            System.out.println(" *__* ");

                    }


                }else {
                    System.out.println("you don,t want to  Start Car");

                }


                break;

            //User Select Car2 Audi
            case 2:
                System.out.println("Thanks Sir Today Your Car is : " +Cars.car_2);
                System.out.println("Are You Start Driving is Car (Y/N) ?");
                String user_answer2 = input.next().toLowerCase();
                if (user_answer2.equals("y")){
                    System.out.println("you Start Car");
                }else {
                    System.out.println("you don,t want to  Start Car");

                }

                break;

            //User Select Car4
            case 3:

                System.out.println("Thanks Sir Today Your Car is :  " +Cars.car_3);
                System.out.println("Are You Start Driving is Car (Y/N) ?");
                String user_answer3 = input.next().toLowerCase();
                if (user_answer3.equals("y")){
                    System.out.println("you Start Car");
                }else {
                    System.out.println("you don,t want to  Start Car");

                }

                break;

            case 4:
                System.out.println("Thanks Sir Today Your Car is : " +Cars.car_4);
                System.out.println("Are You Start Driving is Car (Y/N) ?");
                String user_answer4 = input.next().toLowerCase();
                if (user_answer4.equals("y")){
                    System.out.println("you Start Car");
                }else {
                    System.out.println("you don,t want to  Start Car");

                }
                break;


            default:
                System.out.println("Please Select Your Car Correctly");
        }



    }
}
