public class Dviratis extends TransportoPriemone {

    public Dviratis(String marke, String modelis, int gamybMetai) {
        super(marke, modelis, gamybMetai);
    }
    @Override
    public void vaziuoti() {
        System.out.println("Dviratis vaziuoja.");
    }
     @Override
    public void stabdyti() {
        System.out.println("Dviratis stabdo.");
    }
}
