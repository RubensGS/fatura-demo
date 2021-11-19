package com.demo.entities.req;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Transacao {

    private Double valor;
    private String estabelecimento;

    @EqualsAndHashCode.Include
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String tipo;

    private String data;

}
