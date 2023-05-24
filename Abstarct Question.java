abstract class pen{
    abstract void write();
    abstract void refill();

class fountainPen extends pen{
    void write(){
        System.out.println("writing....");
    }
    void refill(){
        System.out.println("refilling...");
    }
    public void changeNib(){
        System.out.println("changing nib...");
    }
public class  Main{
    public  void main(String[] args) {
        fountainPen Pen = new fountainPen();
        Pen.refill();
        Pen.write();
        Pen.changeNib();


    }
}


}


}
