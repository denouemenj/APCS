import java.lang.reflect.Array;
import java.util.ArrayList;

public class UserName {

// The list of possible user names, based on a user’s first and last names and initialized by the constructor.

    private ArrayList<String> possibleNames;


    /**
     * Constructs a UserName object as described in part (a).
     * <p>
     * Precondition: firstName and lastName have length greater than 0
     * <p>
     * and contain only uppercase and lowercase letters.
     */

    public UserName(String firstName, String lastName) {
        possibleNames = new ArrayList<String>();
        for (int i = 0; i < firstName.length(); i++) {
            possibleNames.add(lastName + firstName.substring(0, i + 1));
        }
    }


    /**
     * Returns true if arr contains name, and false otherwise.
     */

    public boolean isUsed(String name, String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (name.equals(arr[i])) {
                return true;
            }
        }
        return false;
    }


    /**
     * Removes strings from possibleNames that are found in usedNames as described in part (b).
     */

    public void setAvailableUserNames(String[] usedNames) {
        ArrayList<String> temp = new ArrayList<String>();
        for (int i = 1; i < possibleNames.size(); i++) {
            if (!isUsed(possibleNames.get(i), usedNames)) {
                temp.add(possibleNames.get(i));
            }
        }
        possibleNames = temp;
    }

    public void printPossible() {
        for (int i = 0; i < possibleNames.size(); i++) {
            System.out.println(possibleNames.get(i));
        }
    }

}