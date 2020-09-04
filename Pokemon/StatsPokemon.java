package Pokemon;
public class StatsPokemon {
    private String nombrePokemon,colorPokemon,tipoPokemon;
    private int hpPokemon,lvlPokemon;
    public StatsPokemon(String nombrePokemon,String colorPokemon, String tipoPokemon, int hpPokemon, int lvlPokemon){
        this.nombrePokemon = nombrePokemon;
        this.colorPokemon = colorPokemon;
        this.tipoPokemon = tipoPokemon;
        this.hpPokemon = hpPokemon;
        this.lvlPokemon = lvlPokemon;
        System.out.println(nombrePokemon+" creado.");
    }
    public void getInfoPokemon(){
        System.out.println("Datos del pokemon\nNombre: "+nombrePokemon+"\nColor:"+colorPokemon+"\nTipo:"+tipoPokemon+"\nHP:"+hpPokemon+"\nLvl:"+lvlPokemon);
    }

    public void  setHpPokemon(int newHp){
        hpPokemon = newHp;
    }

    public void  setLvlPokemon(int newLvl){
        lvlPokemon = newLvl;
    }

}