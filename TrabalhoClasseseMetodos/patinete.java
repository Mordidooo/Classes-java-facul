public class patinete {
   
    
   //atributos 
   String nome;    
   String marca;
   int rolamento;
   int pe;
   

   //metodos
   void acelerar(int aceleracao){
      rolamento+=aceleracao;
}
   void freiar(int reduzir){
      pe-=reduzir;

}
   void buzinar(){
       System.out.println("ei saia da frente");
   }
    }
    
    
    

