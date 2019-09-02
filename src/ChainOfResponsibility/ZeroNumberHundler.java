package ChainOfResponsibility;

public class ZeroNumberHundler implements ChainOfResponsibility {

    private ChainOfResponsibility chain;

    @Override
    public void nextChain(ChainOfResponsibility nextChain) {
        chain = nextChain;
    }

    @Override
    public void requestProcess(Number number) {
        if( number.getNumber() == 0){
            System.out.println("ZeroNumberHundler: "+number.getNumber());
        } else {
            chain.requestProcess(number);
        }
    }

}
