
public class Main {

    public String grades(int num) {

        String result = "Not an appliable integer";

        if (num == 12) {
            result = "Excellent";
        }
        else if (num == 10){
            result = "Very Good";
        }
        else if (num == 7){
            result = "Good";
        }
        else if (num == 4){
            result = "Fair";
        }
        else if (num == 2){
            result = "Adequete";
        }
        else if (num == 0){
            result = "Inadequete";
        }
        else if (num == -3){
            result = "Fail";
        }

        return result;
    }

    public static void main(String args[]) {



    }

}
