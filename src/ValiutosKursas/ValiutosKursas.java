/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ValiutosKursas;

public class ValiutosKursas {
    
    String kursoTipas;
    String kursoData;
    String valiutosKodasPrimas;
    Float kursasPirmas;
    String valiutosKodasAntras;
    Float kursasAntras;

    public ValiutosKursas(String kursoTipas, String kursoData, String valiutosKodasPrimas, Float kursasPirmas, String valiutosKodasAntras, Float kursasAntras) {
        this.kursoTipas = kursoTipas;
        this.kursoData = kursoData;
        this.valiutosKodasPrimas = valiutosKodasPrimas;
        this.kursasPirmas = kursasPirmas;
        this.valiutosKodasAntras = valiutosKodasAntras;
        this.kursasAntras = kursasAntras;
    }

    public String getKursoTipas() {
        return kursoTipas;
    }

    public String getKursoData() {
        return kursoData;
    }

    public String getValiutosKodasPrimas() {
        return valiutosKodasPrimas;
    }

    public Float getKursasPirmas() {
        return kursasPirmas;
    }

    public String getValiutosKodasAntras() {
        return valiutosKodasAntras;
    }

    public Float getKursasAntras() {
        return kursasAntras;
    }

    
    public void info(){
        System.out.println("Kurso tipas - \t\t"+this.kursoTipas);
        System.out.println("Kurso data - \t\t"+this.kursoData);
        System.out.println("valiutos kodas - \t"+this.valiutosKodasPrimas + " kursu - " + this.kursasPirmas);
        System.out.println("valiutos kodas - \t"+this.valiutosKodasAntras + " kursu - " + this.kursasAntras);
        System.out.println("");
    }
}
