public class ImNotSittingThereLauncher {



    public static void main(String[] args) {

    ImNotSittingThereLauncher launcher = new ImNotSittingThereLauncher();
    launcher.launch();
    }

    private void launch() {
        PartyController pc = new PartyController();
        pc.start();
    }
}
