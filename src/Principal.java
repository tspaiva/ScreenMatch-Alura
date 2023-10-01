import br.com.alura.screenmatch.model.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFixaTecnica();
        meuFilme.avaliaFilme(8);
        meuFilme.avaliaFilme(5);
        meuFilme.avaliaFilme(10);
       // System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.getMedia());
    }
}