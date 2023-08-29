package med.voll.api.entities.medico;

import jakarta.persistence.Entity;
import med.voll.api.entities.enums.Especialidade;

@Entity
public class Medico {
    private String crm;
    private Especialidade especialidade;
}
