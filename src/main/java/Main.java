
public class Main {

    public String grades(int num) {

        String result = "Not an applicable integer";

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
            result = "Adequate";
        }
        else if (num == 0){
            result = "Inadequate";
        }
        else if (num == -3){
            result = "Fail";
        }

        return result;
    }

    public static void main(String args[]) {



    }

}
