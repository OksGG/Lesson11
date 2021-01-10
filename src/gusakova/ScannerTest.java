package gusakova;

public class ScannerTest {


    public static void main(String[] args) {
        Act act = new Act(Act.docNum, Act.name, Act.number, Act.date, Act.sum, Act.product);
        act.saveDoc();
        Agree agree = new Agree(Agree.docNum, Agree.name, Agree.number, Agree.date, Agree.sum, Agree.product);
        agree.saveDoc();
    }
}
