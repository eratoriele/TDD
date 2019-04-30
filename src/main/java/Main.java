
public class Main {

    public String grades(int num) {

        String result = "";

        switch (num) {
            case 12:
                result = "Excellent";
                break;
            case 10:
                result = "Very Good";
                break;
            case 7:
                result = "Good";
                break;
            case 4:
                result = "Fair";
                break;
            case 2:
                result = "Adequate";
                break;
            case 0:
                result = "Inadequate";
                break;
            case -3:
                result = "Fail";
                break;
            default:
                result = "Not an applicable integer";
        }

        return result;
    }

    public static void main(String args[]) {



    }

}
