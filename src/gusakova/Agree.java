package gusakova;

public class Agree extends Document {
    public Agree(String docNum, String name, String number, String date, String sum, String product) {
        super(docNum, name, number, date, sum, product);
    }


    @Override
    public void saveDoc() {
        Agree[] array = new Agree[5];
        for (int i = 0; i < 5; i++) {
            scan(docNum, name, number, date, sum, product);
            array[i] = new Agree(docNum, name, number, date, sum, product);
            String s = toString();
            System.out.println(s);
        }
    }
}
