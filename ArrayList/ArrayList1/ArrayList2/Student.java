package MyExercisesJavaAdvanced.ArrayList.ArrayList1.ArrayList2;

public class Student {
    String nome,cognome;
    int età;

    public Student (String nome, String cognome, int età){
        this.nome=nome;
        this.cognome=cognome;
        this.età=età;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEtà() {
        return età;
    }

    public void setEtà(int età) {
        this.età = età;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", età=" + età +
                '}';
    }


}
