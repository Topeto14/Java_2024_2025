package SegundaEvaluacion.Tema6.poliformismoInterfaces;

public class Test {
    public static void main(String[] args) {

        Documento doc1 = new Documento("file1.pdf", 1000, "root");
        Documento doc2 = new Documento("file2.pdf", 5000, "profesor");
        DocumentoPDF doc3 = new DocumentoPDF("file3.pdf",3000, "profesor", true);
        Video vid1 = new Video("http://www.youtube.com/watch/1", 100);
        Video vid2 = new Video("http://www.youtube.com/watch/2", 290);

        Envios envios = new Envios();
        envios.addElemento(doc1);
        envios.addElemento(doc2);
        envios.addElemento(doc3);
        envios.addElemento(vid1);
        envios.addElemento(vid2);

        for(Validator v: envios.getElementos()) {
            System.out.println(v.validate());

            if (v instanceof Documento) {
                System.out.println( ((Documento) v).getNombre() );
            }

            if (v instanceof Video) {
                System.out.println( ((Video) v).getUrl());
            }
        }




    }
}
