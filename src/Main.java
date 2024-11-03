import java.lang.reflect.Array;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        - **Step 1**: Create an **array** to hold five different weather temperatures.

        int[] temperatures  = {10, 23, 37,41,70};
        System.out.println(temperatures[4]);
//        - **Step 2**: Initialize the array with five temperature values of your choice.

        String[] newTemperatures = new String[5];
        newTemperatures[0] = "22";
        newTemperatures[1] = "32";
        newTemperatures[2] = "34";
        newTemperatures[3] = "55";
        newTemperatures[4] = "65";

        System.out.println(newTemperatures[0] + " " + newTemperatures[1] + " " + newTemperatures[2] + " " + newTemperatures[3] + " " + newTemperatures[4]);




//        - **Step 3**: Change the temperature at the third position (index 2) to a new value.

        newTemperatures[2] = "44";


        System.out.println(newTemperatures[0] + " " + newTemperatures[1] + " " + newTemperatures[2] + " " + newTemperatures[3] + " " + newTemperatures[4]);


//        - **Step 4**: Use a loop to display all the temperatures in your array.

        for (var i = 0; i < newTemperatures.length; i++) {
            System.out.println(newTemperatures[i]);
        }
    }
}