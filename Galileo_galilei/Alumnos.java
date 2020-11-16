package Galileo_galilei;

public class Alumnos extends Info_base {
    private String division;
    public Alumnos(String division){
        this.division = division;
    }
    public String getDivision(){
        return division;
    }
}
