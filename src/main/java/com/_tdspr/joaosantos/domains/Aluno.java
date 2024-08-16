package com._tdspr.joaosantos.domains;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Aluno extends Pessoa {
    private String registro;
    @JsonProperty("registry")
    private String rm;


}
