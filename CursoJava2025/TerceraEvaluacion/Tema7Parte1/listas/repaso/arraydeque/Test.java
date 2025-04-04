package TerceraEvaluacion.Tema7Parte1.listas.repaso.arraydeque;

public class Test {
    public static void main(String[] args) {

        LogBuffer lg = new LogBuffer(10000);
        for(int i=1; i <= 10005; i++)
            lg.addLog("Mensaje " + i);

        lg.showLogs();
    }
}
