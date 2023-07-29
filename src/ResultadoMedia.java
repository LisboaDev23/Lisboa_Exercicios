
public class ResultadoMedia {
    public static void main(String[] args) {
      System.out.println("Esse sistema irá clacular a media das suas quatro notas ");
      CalculandoMedia media = new CalculandoMedia();
      media.setNota1(8.5);
      System.out.println("Sua primeira nota foi " + media.getNota1());
      media.setNota2(6.5);
      System.out.println("Sua segunda nota foi " + media.getNota2());
      media.setNota3(7.5);
      System.out.println("Sua terceira nota foi " + media.getNota3());
      media.setNota4(8.0);
      System.out.println("Sua úlitma nota foi " + media.getNota4());
      System.out.println("Sua media final é " + media.calculaMedia());
       if (media.calculaMedia()<7) {
           System.out.println("Poxa, você foi reprovado!");
       }
       if (media.calculaMedia()>=7){
           System.out.println("Parabéns, você foi aprovado!");
       }
    }

}