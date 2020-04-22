public class BinaryObserver implements Observer {
    public BinaryObserver() { }

    @Override
    public void update(int subject) {
        System.out.println("Binary String: "+Integer.toBinaryString(subject));
    }
}
