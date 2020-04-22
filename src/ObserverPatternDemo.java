public class ObserverPatternDemo {
    public static void main(String[] args){
        Subject subject=new Subject();
        BinaryObserver binaryObserver = new BinaryObserver();
        OctalObserver octalObserver = new OctalObserver();
        HexaObserver hexaObserver = new HexaObserver();

        subject.attach(binaryObserver);
        subject.attach(octalObserver);
        subject.attach(hexaObserver);

        System.out.println("First state change: 15");
        subject.setState(15); //va a cambiar el estado y llamar a notifyAllObservers()
    }
}
