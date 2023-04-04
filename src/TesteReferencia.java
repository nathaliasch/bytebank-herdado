public class TesteReferencia {
    public static void main(String[] args) {
        //pode ter do lado esquerdo uma referência do tipo mais genérica
        // e do lado direito o objeto mais específico
        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000.0);

        Funcionario f = new Designer();
        f.setSalario(2000.0);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(f);
        controle.registra(ev);


        System.out.println(controle.getSoma());



    }
}
