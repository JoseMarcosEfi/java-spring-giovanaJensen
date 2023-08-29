package med.voll.api.entities.enums;

public enum Especialidade {
    ORTOPEDIA(0),
    CARDIOLOGIA(1),
    GINECOLOGIA(2),
    DERMATOLOGIA(3);

    private final int especialidadeCodigo;

    private Especialidade(int especialidade) {
        this.especialidadeCodigo = especialidade;
    }
    public int getEspecialidade(){
        return especialidadeCodigo;
    }
    public static Especialidade valueOf(int especialidadeCodigo){
        for(Especialidade value : Especialidade.values()){

            if(especialidadeCodigo == value.getEspecialidade())
                return value;
        }
        throw new IllegalArgumentException("Especialidade inválida!");
    }
}
