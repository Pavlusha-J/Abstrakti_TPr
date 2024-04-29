public class Automobilis extends TransportoPriemone {

    public Automobilis(String marke, String modelis, int gamybMetai) {
        super(marke, modelis, gamybMetai);
    }

    @Override
    public void vaziuoti() {
        System.out.println("Tr.P. vaziuoja.");
    }

    @Override
    public void stabdyti() {
        System.out.println("Tr.P. stabdo.");
    }
}
