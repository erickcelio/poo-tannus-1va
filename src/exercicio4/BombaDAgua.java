package exercicio4;

import java.util.Timer;
import java.util.TimerTask;

public class BombaDAgua {
    private boolean status;
    Timer timer = new Timer();

    public void ligar(int s) {
        System.out.println("Bomba d'Água Ligada!");
        this.status = true;
        timer.schedule(new RemindTask(s),0, 1000);
        try { Thread.sleep ((s + 1)*1000); } catch (InterruptedException ex) {}
    }

    class RemindTask extends TimerTask {
        private int time;
        private int seconds;
        public RemindTask(int time) {
            this.time = time;
        }
        public void run() {
            if (this.seconds < this.time) {
                System.out.println("Em " + (this.time - this.seconds) + " segundos será desligada a bomba!");
                this.seconds = this.seconds + 1;
            } else {
                desligar();
                timer.cancel();
            }
        }
    }

    public void desligar() {
        System.out.println("Bomba d'Água Desligada!");
        this.status = false;
    }
}
