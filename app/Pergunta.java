public class Pergunta {
    private String pergunta;
    private String[] respostas;
    private String respostaCerta;

    public Pergunta(String pergunta, String[] respostas, String respostaCerta) {
        this.pergunta = pergunta;
        this.respostas = respostas;
        this.respostaCerta = respostaCerta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String[] getRespostas() {
        return respostas;
    }

    public void setRespostas(String[] respostas) {
        this.respostas = respostas;
    }

    public String getRespostaCerta() {
        return respostaCerta;
    }

    public void setRespostaCerta(String respostaCerta) {
        this.respostaCerta = respostaCerta;
    }
}
