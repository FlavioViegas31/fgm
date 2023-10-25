package com.fgm.domain.medico;

import jakarta.validation.constraints.NotNull;
import com.fgm.domain.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
