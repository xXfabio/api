package br.com.api.produtos.modelo;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

//a classe é detectada e pode ser injetada em outras e em partes da aplicação
@Component
@Getter
@Setter
public class RespostaModelo {
    private String mensagem;
}
