package gusakova;


import java.util.Scanner;

public class Document {

    static String docNum;
    static String name;
    static String number;
    static String date;
    static String sum;
    static String product;

    public Document() {

    }

    public Document(String docNum, String name, String number, String date, String sum, String product) {
        this.docNum = docNum;
        this.name = name;
        this.number = number;
        this.date = date;
        this.sum = sum;
        this.product = product;
    }


    public void scan(String numDoc, String nameDoc, String numberDoc, String dateDoc, String sumDoc, String productDoc) {
        Scanner sc = new Scanner(System.in);
        docNum = sc.next();

        name = sc.next();

        number = sc.next();

        date = sc.next();

        sum = sc.next();

        product = sc.next();


    }


    @Override
    public String toString() {
        return "Документ [docNum=" + docNum
                + ", name=" + name
                + ", number=" + number
                + ", date=" + date
                + ", sum=" + sum
                + ", product=" + product + "]";
    }


    public void saveDoc() {
        Document[] array = new Document[10];
        for (int i = 0; i < 11; i++) {
            scan(docNum, name, number, date, sum, product);
            array[i] = new Document(docNum, name, number, date, sum, product);
            String s = toString();
            System.out.println(s);
        }
    }

}
