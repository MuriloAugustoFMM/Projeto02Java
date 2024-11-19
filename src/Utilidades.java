import java.awt.*;


public class Utilidades extends  Component{
    private  int Width ;
    private  int Height;
    public void CentralizarNoContainer( Component Referencia){
        this.setBounds(Referencia.getX()/2 - Width/2,Referencia.getY()/2 - Height/2,Width,Height);
    }

    public void AlinharAbaixo(Component Referencia){
        this.setBounds( Referencia.getX() , Referencia.getY() + Height ,Width,Height );

    }

    public void AlinharAcima(Component Referencia){
        this.setBounds( Referencia.getX() , Referencia.getY() - Height ,Width,Height );
    }

    public void DefinirComponentePrincipal(Component Principal){
        Width = Principal.getWidth();
        Height = Principal.getHeight();
    }

}
