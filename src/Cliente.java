public class Cliente {
    private String nome, numTel;

    private static final String REGEX_TEL = "^(\\(\\d{2}\\)|\\d{2}) ?9 ?\\d{4}-?\\d{4}$";

    public Cliente(String nome, String numTel){
        this.nome = nome;
        setNum(numTel);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNum(){
        return numTel;
    }

    public void setNum(String numTel){
        if(numTel.matches(REGEX_TEL))
            this.numTel = numTel;
        else
            throw new IllegalArgumentException("Número inválido!");
    }

    public String getTelFormat(){
        String numero = numTel.replaceAll("\\D", "");

        return String.format("(%s) %s-%s",
                numero.substring(0,2),
                numero.substring(2,7),
                numero.substring(7,11)
        );
    }

    public void imprime(){
        System.out.println("Nome:    "+nome);
        System.out.println("Celular: "+getTelFormat());
    }
}
