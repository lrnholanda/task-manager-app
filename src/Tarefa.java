import java.util.Date;

public class Tarefa {
    private String titulo;
    private String descricao;
    private Date dataDeCriacao;
    private Date conclusao;
    private Prioridade prioridade;
    private boolean status = false;

    public Tarefa(String titulo, String descricao, Prioridade prioridade){
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.dataDeCriacao = new Date();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void setDataDeCriacao(Date dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    public Date getConclusao() {
        return conclusao;
    }

    public void setConclusao(Date conclusao) {
        this.conclusao = conclusao;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataDeCriacao=" + dataDeCriacao +
                ", conclusao=" + conclusao +
                ", prioridade=" + prioridade +
                ", status=" + status +
                '}';
    }
}
