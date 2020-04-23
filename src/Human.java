import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

//Jeśli w klasie Human użyłeś typów prostych zamień je na odpowiadające im klasy (int => Integer)

public class Human {

    Integer age;
    Double weight;
    Double height;
    String name;
    Boolean male;

    public Integer getAge() {
        return age;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public Boolean isMale(Boolean male) {
        if (male.equals(TRUE)){
            return TRUE;
        } else {
            return FALSE;
        }
    }
}
