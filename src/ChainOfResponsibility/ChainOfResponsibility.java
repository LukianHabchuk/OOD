package ChainOfResponsibility;

public interface ChainOfResponsibility {
    void nextChain(ChainOfResponsibility nextChain);
    void requestProcess(Number number);
}
