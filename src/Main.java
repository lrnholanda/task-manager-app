public class Main {
    public static void main(String[] args) {


     Usuario lore = new Usuario("Lorena", "lrnholanda","12345");

     Tarefa tarefa1 = lore.criarTarefa("Aprender Java todos os dias", "tentar programar todos os dias", Prioridade.ALTA);

     Tarefa tarefa2 = lore.criarTarefa("Ir à academia", "Ir à academia fazer exercícios", Prioridade.MÉDIA);

     Tarefa tarefa3 = lore.criarTarefa("modelagem 3d", "fazer arte utilizando Blender3D", Prioridade.BAIXA);

     // Exibe a lista de tarefas do usuário
        System.out.println("Lista de tarefas do usuário " + lore.getNome() + ":");
        for(Tarefa tarefa : lore.getListaDeTarefas()) {
            System.out.println("- " + tarefa.getTitulo() + " (prioridade " + tarefa.getPrioridade() + ")");
        }

    }
}