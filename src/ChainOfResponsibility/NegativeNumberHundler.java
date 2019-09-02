package ChainOfResponsibility;

public class NegativeNumberHundler implements ChainOfResponsibility {

    private ChainOfResponsibility chain;

    @Override
    public void nextChain(ChainOfResponsibility nextChain) {
        chain = nextChain;
    }

    @Override
    public void requestProcess(Number number) {
        if( number.getNumber() < 0){
            System.out.println("NegativeNumberHundler: "+number.getNumber());
        } else {
            chain.requestProcess(number);
        }
    }
}
