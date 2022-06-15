public class bst {
    public dugum kok;

    public bst(){
        this.kok=null;

    }
    
    public void ekle( int deger){
        dugum yeni= new dugum(deger);
        if(this.kok==null){
            this.kok=yeni;
            System.out.println("kok:"+deger);
            return;
        }
        dugum parent=null;
        dugum aktif=this.kok;

        while(true){
           parent=aktif;
            ;if(deger<aktif.veri){
                aktif=aktif.sol;
                if(aktif==null){
                    parent.sol=yeni;
                    System.out.println("parent:"+ parent.veri+ "  soluna eklenen:"+ yeni.veri);
                    return;
                }
            }
            else if(deger>aktif.veri){
                aktif=aktif.sag;
                if(aktif==null){
                    parent.sag=yeni;
                    System.out.println("parent:"+ parent.veri+ "  sagina eklenen:"+ yeni.veri);
                    return;}
        }
            else{
            System.out.println("bu degerden var");
            return;
        }
        }
}



public dugum min(){
    if(this.kok==null){
        return null;
    }
    dugum aktif=this.kok;
    while(aktif.sol!=null){
        aktif=aktif.sol;
        
    }
return aktif;

}

public dugum max(){
    if(this.kok==null){
        return null;
    }
    dugum aktif=this.kok;
    while(aktif.sag!=null){
        aktif=aktif.sag;
        
    }
return aktif;

}


public dugum bul(int deger){
    if(this.kok==null){
        return null;
    }
dugum aktif=this.kok;
while(aktif!=null){
    if(aktif.veri==deger){
        return aktif;
    }
    else if(deger<aktif.veri){
        aktif=aktif.sol;
    }
    else{
        aktif=aktif.sag;
    }
}
 return null;
}




public void inorder(dugum localRoot){
    if(localRoot!=null){
        inorder(localRoot.sol);
        localRoot.yazdir();
        inorder(localRoot.sag);
    }
}


}