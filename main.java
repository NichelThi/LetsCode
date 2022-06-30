package exercicioaula2;

public class main {
    public static void main(String[] args) {
        DiaDasMaes diaDasMaes = new DiaDasMaes("filho", "mae");
        DiaDosNamorados diaDosNamorados = new DiaDosNamorados("namorado", "namorada");

        escreverCartao(diaDasMaes);
        escreverCartao(diaDosNamorados);



    }
    public static void escreverCartao(CartaoDePresente cartaoDePresente){
        System.out.println(cartaoDePresente.getNomeRemetente());
        System.out.println(cartaoDePresente.getNomeDestinatario());
        System.out.println(cartaoDePresente.mensagem());
    }
}
