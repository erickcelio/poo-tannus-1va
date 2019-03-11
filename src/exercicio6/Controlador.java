package exercicio6;

import java.util.Timer;
import java.util.TimerTask;

public class Controlador {
    private int codSeguranca;
    private boolean ativo = false;
    private boolean alarmeAtivado = false;
    private Alarme sirene = new Alarme("Sirene");
    private Alarme campainha = new Alarme("Campainha");
    private Sensor[] sensores = new Sensor[10];
    private Timer timer;

    public Controlador(int codSeguranca) {
        this.codSeguranca = codSeguranca;
        for (int i = 0; i < 10; i++) {
            this.sensores[i] = new Sensor("sensor" + i);
        }
    }

    public int getCodSeguranca() {
        return codSeguranca;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void ligarSistema() {
        this.timer = new Timer();
        for (Sensor sensor : this.sensores) {
            sensor.ligar();
        }
        this.ativo = true;
        TimerTask check = new TimerTask() {
            public void run() {
                verificarSensores();
            }
        };
        this.timer.schedule(check, 1000, 1000);
    }

    public void desligarSistema() {
        for (Sensor sensor : this.sensores) {
            timer.cancel();
            sensor.desativar();
            if(sensor.isAtivado())
                sensor.desligar();
        }
        this.ativo = false;
    }

    public boolean verificarCodigo(int cod) {
        return this.codSeguranca == cod;
    }

    public void ativarAlarmes(Sensor sensor) {
        if(!this.alarmeAtivado) {
            this.alarmeAtivado = true;
            this.sirene.ativar();
            this.campainha.ativar();
            System.out.println("------------------------- Atenção -----------------------");
            System.out.println("Foi detectado presença na localização do: " + sensor.getCodigo());
            System.out.println("Digite o código de segurança para desativar!");
            System.out.println("---------------------------------------------------------");
        }
    }

    public void desativarAlarmes() {
        this.alarmeAtivado = false;
        this.sirene.desativar();
        this.campainha.desativar();
        for (Sensor sensor : this.sensores) {
            sensor.desativar();
        }
    }

    public boolean isAlarmeAtivado() {
        return alarmeAtivado;
    }

    public void verificarSensores() {
        for (Sensor sensor : this.sensores) {
            if (sensor.isLigado() && sensor.isAtivado()) {
                this.ativarAlarmes(sensor);
            }
        }
    }

    public void ligarSensor(String cod) {
        boolean sensorAtivo = false;
        for (Sensor sensor : this.sensores) {
            if (sensor.getCodigo().equals(cod) && !sensor.isLigado()) {
                sensor.ligar();
                sensorAtivo = true;
            }
        }
        if (!sensorAtivo) {
            System.out.println("Código do sensor inválido!");
        }
    }

    public void desligarSensor(String cod) {
        boolean sensorDesativo = false;
        for (Sensor sensor : this.sensores) {
            if (sensor.getCodigo().equals(cod) && sensor.isLigado()) {
                sensor.ligar();
                sensorDesativo = true;
            }
        }
        if (!sensorDesativo) {
            System.out.println("Código do sensor inválido!");
        }
    }

    public void testarSensor(String cod) {
        boolean sensorTestado = false;
        for (Sensor sensor : this.sensores) {
            if (sensor.getCodigo().equals(cod) && sensor.isLigado()) {
                sensorTestado = true;
                sensor.ativar();
            }
        }
        if (!sensorTestado) {
            System.out.println("Código do sensor inválido!");
        }
    }

    public void mostrarStatusSensores() {
        System.out.println("Verificando Sensores...");
        for (Sensor sensor : this.sensores) {
            System.out.println("Sensor - Código: " + sensor.getCodigo() + " - Status: " + (sensor.isLigado() ? "Ligado" : "Desligado") + " - " + (sensor.isAtivado() ? " Ativado" : "Desativado"));
        }
    }

    public void mostrarSensoresLigados() {
        int num = 0;
        System.out.println("Sensores Ligados");
        for (Sensor sensor : this.sensores) {
            if (sensor.isLigado()) {
                num++;
                System.out.println("Sensor - Código: " + sensor.getCodigo() + " - Status: " + (sensor.isLigado() ? "Ligado" : "Desligado") + " - " + (sensor.isAtivado() ? " Ativado" : "Desativado"));
            }
        }
        if (num == 0) {
            System.out.println("Nenhum sensor está ligado!");
        }
    }

    public void mostrarSensoresDesligados() {
        int num = 0;
        System.out.println("Sensores Desligados");
        for (Sensor sensor : this.sensores) {
            if (!sensor.isLigado()) {
                num++;
                System.out.println("Sensor - Código: " + sensor.getCodigo() + " - Status: " + (sensor.isLigado() ? "Ligado" : "Desligado") + " - " + (sensor.isAtivado() ? " Ativado" : "Desativado"));
            }
        }
        if (num == 0) {
            System.out.println("Nenhum sensor está desligado!");
        }
    }
}
