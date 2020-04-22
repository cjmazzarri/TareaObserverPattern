public class HexaObserver implements Observer {
    public HexaObserver(){ }

    @Override
    public void update(int subject) {
        System.out.println("Hex String: "+Integer.toHexString(subject));
    }
}
