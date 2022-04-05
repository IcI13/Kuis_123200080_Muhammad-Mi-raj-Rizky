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
public class PesertaLombaS implements LombaSurat {
    double strukturSurat, isiSurat, penerapanKaidahB, kreativitas, hasil1;

    public PesertaLombaS(double strukturSurat, double isiSurat, double penerapanKaidahB, double kreativitas) {
        this.strukturSurat = strukturSurat;
        this.isiSurat = isiSurat;
        this.penerapanKaidahB = penerapanKaidahB;
        this.kreativitas = kreativitas;
    }
    
    
     @Override
    public double strukturSurat() {
        strukturSurat=(strukturSurat*10)/100;
       return strukturSurat;
    }

    @Override
    public double isiSurat() {
        isiSurat=(isiSurat*40)/100;
       return isiSurat;
    }

    @Override
    public double penerapanKaidahB() {
        penerapanKaidahB=(penerapanKaidahB*20)/100;
       return penerapanKaidahB;
    }

    @Override
    public double kreativitas() {
        kreativitas=(kreativitas*30)/100;
       return kreativitas;
    }

    @Override
    public double hasil1() {
        hasil1=strukturSurat+isiSurat+kreativitas+penerapanKaidahB;
        return hasil1;
    }
}
