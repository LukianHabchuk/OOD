package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        ChainOfResponsibility first = new ZeroNumberHundler();
        ChainOfResponsibility second = new PositiveNumberHundler();
        ChainOfResponsibility third  = new NegativeNumberHundler();

        first.nextChain(second);
        second.nextChain(third);

        first.requestProcess(new Number(-1));
        first.requestProcess(new Number(1));
        first.requestProcess(new Number(0));
    }
}
