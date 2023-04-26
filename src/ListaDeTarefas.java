import java.util.ArrayList;

public class ListaDeTarefas {
    private ArrayList<Tarefa> tarefas;

    public ListaDeTarefas() {
        tarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public ArrayList<Tarefa> listarTarefas() {
        return tarefas;
    }


}
