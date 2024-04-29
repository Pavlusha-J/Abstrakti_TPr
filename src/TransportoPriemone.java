public abstract class TransportoPriemone {
    private String marke;
    private String modelis;
    private int gamybMetai;

        public TransportoPriemone(String marke, String modelis, int gamybMetai) {
        this.marke = marke;
        this.modelis = modelis;
        this.gamybMetai = gamybMetai;
    }
        public String getMarke() {
        return marke;
    }
        public String getModelis() {
        return modelis;
    }
        public int getGamybMetai() {
        return gamybMetai;
    }
    public abstract void vaziuoti();
    public abstract void stabdyti();

    public void spausdinkInfo() {
        System.out.println("Tr.P.Marke: " + marke + ", Modelis: " + modelis + ", Pagaminimo Metai: "
                + gamybMetai);
    }
}

