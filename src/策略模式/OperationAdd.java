package 策略模式;

public class OperationAdd implements Operation{
    @Override
    public int doOperation(int num1, int num2) {
        return num1+num2;
    }
}
