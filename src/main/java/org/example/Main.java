import net.datafaker.Faker;
import org.example.eroeNonIdoneoException;
import org.example.reclutatore;
import org.example.superEroe;

import static java.lang.IO.println;

void main(){
    reclutatore r = new reclutatore();

    Integer livelloMissione = 75;

    for(int i =0; i<5; i++ ){
        superEroe s = r.recluta();
        try{
            confronta(s, livelloMissione);
            println("eroe: " + s.getNome() + " | livello: " + s.getlivello() + " | idoneo");
        }catch(eroeNonIdoneoException e){
            println("eroe: " + s.getNome() + " | livello: " + s.getlivello() + " | non idoneo");
        }
    }
}

public void confronta(superEroe s, Integer livelloMissione) throws eroeNonIdoneoException {
    if(s.getlivello()<livelloMissione){
        throw new eroeNonIdoneoException(s.getNome(), s.getlivello());
    }
}