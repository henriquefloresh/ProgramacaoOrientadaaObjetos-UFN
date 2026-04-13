class Carro2 {
    // Atributos (privados)
    private String placa;
    private int numChassi;

    // Getters
    public String getPlaca() {
        return placa;
    }

    public int getNumChassi() {
        return numChassi;
    }

    // Setters
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setNumChassi(int numChassi) {
        this.numChassi = numChassi;
    }

    // Métodos públicos
    public void acelerar() {
        System.out.println("O carro está acelerando...");
    }

    public boolean frear() {
        System.out.println("O carro está freando...");
        return true;
    }
}
