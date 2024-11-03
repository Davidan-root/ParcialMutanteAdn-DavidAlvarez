package com.demo.dto;

import com.demo.Validators.ValidDna;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class DnaRequest {
    @ValidDna
    private String[] dna;
}
