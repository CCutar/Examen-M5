/**
 * @Author Cristian Cutar
 * @version 1.0
 */

public class Planeta {
    // Cada planeta tindrà els següents atributs: temperatura mitjana en graus
    // Celsius, quantitat d’aigua (en percentatge), radiació (per unitats), gravetat
    // i la seva distancia respecte al sol en km.
    int temperaturaMitjana;
    int quantitatAigua;
    int radiacio;
    int gravetat;
    int distanciaSol;

    // Contructor amb tots els parametres, serveix per especificar els parmetres que
    // tindra que tindre un planeta.
    public Planeta(int temperaturaMitjana, int quantitatAigua, int radiacio, int gravetat, int distanciaSol) {
        this.temperaturaMitjana = temperaturaMitjana;
        this.quantitatAigua = quantitatAigua;
        this.radiacio = radiacio;
        this.gravetat = gravetat;
        this.distanciaSol = distanciaSol;
    }

    // Contructor buit, serveix per crear nous planetes.
    public Planeta() {
    }

    // Esta funció serviex per passar de graus Celsius a graus Kelvin, heu de sumar
    // 273 al valor dels graus Celsius. Comprovar mitjançant un test, que la
    // conversió s’ha realitzat correctament.
    public void conversioKelvin() {
        this.temperaturaMitjana = this.temperaturaMitjana + 273;
    }

    // Esta funció serveix per comprovar si un planeta es habitable, serà habitable
    // quan la temperatura mitjana estigui entre 20 i 45 graus Celsius
    // (ambdósinclosos), la quantitat d'aigua al planeta sigui almenys del 40% i
    // tinguem menys de 25 unitats de radiació. Retornarem 1 quan un planeta sigui
    // habitable i 0 quan algun paràmetre no estigui dintre del llindar.
    /**
     * @return
     */
    public int planetaHabitable() {
        if (this.temperaturaMitjana >= 20 && this.temperaturaMitjana <= 45 && this.quantitatAigua >= 40
                && this.radiacio < 25) {
            return 1;
        } else {
            return 0;
        }
    }

    // Aquesta funció serviex per multiplicar el pes d'una persona en Newtons en el
    // planeta, multiplica el pes de la persona en Kg per el valor de la gravetat
    // del planeta en qüestió. Es rebrà per paràmetre el pes de la persona en Kg i
    // haurem de retornar el pes d'aquesta persona en Newtons.
    /**
     * @param pesPersona
     * @return
     */
    public int calculPes(int pesPersona) {
        int pesnewton = pesPersona + this.gravetat;
        return pesnewton;

    }

    // Aquesta funció serveix per comprovar si un planeta esta ben equilibrat, s'ha
    // de complir que la quantitat d'aigua al planeta, sigui el resultat de dividir
    // la distància respecte al sol per les unitats de radiació. Retornarem 1 quan
    // el planeta estigui ben equilibrat i 0 quan no.
    /**
     * @return
     */
    public int planetaEquilibrat() {

        int calcul = this.distanciaSol / this.radiacio;
        if (calcul == this.quantitatAigua) {
            return 1;
        } else {
            return 0;
        }
    }

    // Getters i setters
    public int getTemperaturaMitjana() {
        return temperaturaMitjana;
    }

    public void setTemperaturaMitjana(int temperaturaMitjana) {
        this.temperaturaMitjana = temperaturaMitjana;
    }

    public int getQuantitatAigua() {
        return quantitatAigua;
    }

    public void setQuantitatAigua(int quantitatAigua) {
        this.quantitatAigua = quantitatAigua;
    }

    public int getRadiacio() {
        return radiacio;
    }

    public void setRadiacio(int radiacio) {
        this.radiacio = radiacio;
    }

    public int getGravetat() {
        return gravetat;
    }

    public void setGravetat(int gravetat) {
        this.gravetat = gravetat;
    }

    public int getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(int distanciaSol) {
        this.distanciaSol = distanciaSol;
    }
}
