import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private ArrayList<Tarefa> tarefas;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        tarefas = new ArrayList<Tarefa>();
    }


    public Tarefa criarTarefa(String titulo, String descricao, Prioridade prioridade) {
        Tarefa novaTarefa = new Tarefa(titulo, descricao, prioridade);
        this.tarefas.add(novaTarefa);
        return novaTarefa;
    }

    public List<Tarefa> getListaDeTarefas() {
        return new ArrayList<Tarefa>(this.tarefas);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
}
