package gusakova;

import java.util.Scanner;

public class Act extends Document {
    public Act(String docNum, String name, String number, String date, String sum, String product) {
        super(docNum, name, number, date, sum, product);
    }


    public void saveDoc() {
        Act[] array = new Act[5];
        for (int i = 0; i < 5; i++) {
            scan(docNum, name, number, date, sum, product);
            array[i] = new Act(docNum, name, number, date, sum, product);
            String s = toString();
            System.out.println(s);
        }
    }

}