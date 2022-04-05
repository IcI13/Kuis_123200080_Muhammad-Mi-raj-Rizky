/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis;

/**
 *
 * @author D15kY
 */
public class PesertaLomba implements LombaAnimasi{
    double alur,konten,kreativitas,sinematografi,hasil;

    public PesertaLomba(double alur, double konten, double kreativitas, double sinematografi) {
        this.alur = alur;
        this.konten = konten;
        this.kreativitas = kreativitas;
        this.sinematografi = sinematografi;
    }

    

    
    
    
    
    

    @Override
    public double alur() {
       alur=(alur*15)/100;
       return alur;
    }

    @Override
    public double konten() {
        konten=(konten*35)/100;
       return konten;
    }

    @Override
    public double kreativitas() {
        kreativitas=(kreativitas*35)/100;
       return kreativitas;
    }

    @Override
    public double sinematografi() {
        sinematografi=(sinematografi*15)/100;
       return sinematografi;
    }

   
    @Override
    public double hasil() {
        hasil=alur+konten+kreativitas+sinematografi;
        return hasil;
    }

   
    
}
