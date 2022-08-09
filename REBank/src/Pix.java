public class Pix extends Cliente implements Tansferencia {

    private double limite;
    private String chaveAleatoria;


    public Pix () {
    }
    public Pix(String nome){
        this.nome = nome;
    }
    public Pix(String nome, double cpf){
        this.nome = nome;
        this.cpf = cpf;
    }


    public void transPix(){
        System.out.println ("Informe a quantidade de dinheiro a ser transferida");
        double trans = entrada.nextDouble ();
        System.out.println ("informe a chave");
        double chave = entrada.nextDouble ();
        System.out.println ("qual o tipo");
        int tipo = entrada.nextInt ();
        if(tipo == 1){

        }else if(tipo == 2){

        }else if(tipo == 3){

        }
                //colocar leitura de arquivo para ter o nome da pessoas
    }


    @Override
    public void transferir () {

        System.out.println ("Vaalor da transferencia com tarifa de 10 reais ");
        double qtdtrans = entrada.nextDouble () + 10;

        if (limite > qtdtrans){
            if (this.saldo > qtdtrans) {
                System.out.println ("valer final a ser transferido:" + qtdtrans);
                System.out.println ("Concorda com essa transação");
                String resposta = entrada.next ();
                if(resposta.equals ("sim")) {
                    this.saldo -= qtdtrans;
                    System.out.println ( "Transferencia concluida com sucesso" );
                }else if(resposta.equals ("nao")) {
                    System.out.println ("Transação cancelada");
                }
                //COLOCAR TRATAMENTO PARA NUMERO*
            }
        }else if(limite < qtdtrans) {
            System.out.println ("Essa transferencia está passando do limite definido");
        }
    }

    @Override
    public void depositar () {
        System.out.println("Qual a sua quantia de deposito?");
        double deposito = entrada.nextDouble ();

        if (limite > deposito){
            System.out.println ("Você deseja continuar com a operação ? ");
            String confirmar = entrada.next ();

            if (confirmar.equals ("sim")){
                System.out.println ("deposito feito com sucesso'" );
                System.out.println ("Agora você possui na sua conta: " + saldo + deposito);

                saldo += deposito;
            }else if(confirmar.equals ("nao")){
                System.out.println ("Deposito cancelado");
            }
        }
    }

    @Override
    public void doacao () {
        System.out.println ("Quantia para doação");
        double doa = entrada.nextDouble ();

        System.out.println ("Obrigado pela doação");
        saldo -= doa;
    }
}
