package modelo;

public interface IState
{
    public String diceEstado();
    public void activa();
    public void suspende();
    public void cancela();
    public void finaliza();
}
