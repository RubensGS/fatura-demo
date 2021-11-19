package com.demo.payloads;

import com.demo.entities.resp.Fatura;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class ResponseDAO {
    private Fatura fatura;
}
