public class dugum {
    public int veri;
    public dugum sol;
    public dugum sag;

    public dugum(int deger ){
        this.veri=deger;
        this.sag=null;
        this.sol=null;
    }
    
    public void yazdir(){
        System.out.println(this.veri);
    }
}
