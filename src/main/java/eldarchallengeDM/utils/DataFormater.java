package eldarchallengeDM.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import eldarchallengeDM.exception.ChallengeException;

public class DataFormater {
    public String fechaFormat(LocalDate date){    
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
            return date.format(formatter);
        } catch (Exception e) {
           throw new ChallengeException("Error al formatear la fecha");
        } 
    }
}
