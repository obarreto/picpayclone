package br.com.dio.picpayclone.modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

//nomenclaturas basicas do lombok
@Data
@Builder // design patterns
@AllArgsConstructor // construtor com todos atributos
@NoArgsConstructor // construtor sem atributos
@EqualsAndHashCode(callSuper = false) // Se precisar utyilizrt da subclasse
@Entity // mostra que é uma entidade
@Table(name = "TRANSACOES") // nome da tabela
public class Transacoes extends EntidadeBase {
	
}
