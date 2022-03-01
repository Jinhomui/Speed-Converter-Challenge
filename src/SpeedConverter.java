public class SpeedConverter {

    public static long toMilesPerHour (double kilometersPerHour){

        if(kilometersPerHour < 0){
            return -1;
        }
        return Math.round(kilometersPerHour/1.609);
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = Math.round(kilometersPerHour/1.609);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
//            System.out.println(kilometersPerHour + " km/h = " + Math.round(kilometersPerHour/1.609) + " mi/h");
        }

    }
}

