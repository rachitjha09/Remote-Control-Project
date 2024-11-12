//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PrometheanRemoteControl implements PrometheanRemoteInterface {
    public static void main(String[] args) {

    }
    @Override public void reset(){
        System.out.println("Resetting Device");
    }
    @Override public int handleErrors(int errorId){
        return 0;
    }
    @Override public void powerOn(){
        System.out.println("Power is on");
    }
    @Override public int moveUp(int amount){
        return 0;
    }
    @Override public int moveDown(int amount){
        return 0;
    }
    @Override public boolean freeze(){
        return false;
    }
}