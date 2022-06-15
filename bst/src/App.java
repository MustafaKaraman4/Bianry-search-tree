public class App {
    public static void main(String[] args) throws Exception {
        bst bst=new bst();
        bst.ekle(10);
        bst.ekle(5);
        bst.ekle(8);
        bst.ekle(15);
        bst.ekle(3);
        bst.ekle(13);
        bst.ekle(18);
        bst.inorder(bst.kok);

        dugum enkucuk=bst.min();
        System.out.println("en kucuk deger:"+ enkucuk.veri);

        dugum enbuyuk=bst.max();
        System.out.println("en buyuk deger:"+ enbuyuk.veri);

        dugum aranan =bst.bul(15);
        if(aranan==null)
        System.out.println("aranan sayi bulunamadı");
        else{
        System.out.println("bulundu:"+ aranan.veri);}

    }
}
