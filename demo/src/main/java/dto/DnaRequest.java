package dto;

import com.demo.ValidDna;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class DnaRequest {
    @ValidDna
    private String[] dna;
}
