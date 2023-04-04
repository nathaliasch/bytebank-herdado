
// contrato Autenticável
// quem assinar esse contrato precisa implementar
// método SetSenha
// método autentica
public abstract interface Autenticavel {


    public abstract void setSenha(int senha) ;

    public abstract boolean autentica (int senha);

}
