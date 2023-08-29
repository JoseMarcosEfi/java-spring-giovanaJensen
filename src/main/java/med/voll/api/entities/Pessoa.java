package med.voll.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import med.voll.api.endereco.DadosEndereco;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class Pessoa
{
    protected String nome;
    protected String email;
    protected String telefone;
    protected String cpf;
    protected DadosEndereco endereco;

}
