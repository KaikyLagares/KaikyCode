
package estudo1;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status () {
    System.out.print("Uma caneta " + this.cor);
    System.out.println("\nesta tampada ? " + this.tampada);
    System.out.println(" qual a carga?" + this.carga);
    System.out.println(" Qual a ponta?" + this.ponta);
    System.out.println(" Qual o modelo? " + this.modelo);
}
    void rabiscar(){
      if(this.tampada == true){
          System.out.print(" Erro! Nao e possivel rabiscar ");
      }else{
          System.out.print(" Rabiscando ");
      }
    }
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
}


}
