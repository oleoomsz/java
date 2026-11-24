package abstracao;

public class C_PrincipalVideoGame {
    public static void main(String[] args) {
        C_VideoGame vg = new C_VideoGame();
        vg.marca = "Sony";
        vg.modelo = "PlayStation 5";
        vg.ligado = false;

        vg.verificarStatus();
        vg.ligar();
        vg.verificarStatus();
        vg.desligar();
        vg.verificarStatus();
    }
}
