public class OctalObserver implements Observer {

    public OctalObserver(){ }

    @Override
    public void update(int subject) {
        System.out.println("Octal String: "+Integer.toOctalString(subject));
    }
}
