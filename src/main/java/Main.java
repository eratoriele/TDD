
public class Main {         // Should have changed the name

    public String grades(int input) {

        String result;

        switch (input) {
            case 12:
                result = "Excellent";           // Maybe return here instead of breaking?
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
