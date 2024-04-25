package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * 
 */

@Schema(name = "excecaoInfraEstrutura", description = "")
@JsonTypeName("excecaoInfraEstrutura")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-25T19:18:58.442807-03:00[America/Sao_Paulo]")
public class ExcecaoInfraEstrutura {

  private Integer codigo;

  private String mensagem;

  private String descricao;

  public ExcecaoInfraEstrutura codigo(Integer codigo) {
    this.codigo = codigo;
    return this;
  }

  /**
   * 
   * @return codigo
  */
  
  @Schema(name = "codigo", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("codigo")
  public Integer getCodigo() {
    return codigo;
  }

  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }

  public ExcecaoInfraEstrutura mensagem(String mensagem) {
    this.mensagem = mensagem;
    return this;
  }

  /**
   * 
   * @return mensagem
  */
  
  @Schema(name = "mensagem", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mensagem")
  public String getMensagem() {
    return mensagem;
  }

  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  public ExcecaoInfraEstrutura descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }

  /**
   * 
   * @return descricao
  */
  
  @Schema(name = "descricao", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExcecaoInfraEstrutura excecaoInfraEstrutura = (ExcecaoInfraEstrutura) o;
    return Objects.equals(this.codigo, excecaoInfraEstrutura.codigo) &&
        Objects.equals(this.mensagem, excecaoInfraEstrutura.mensagem) &&
        Objects.equals(this.descricao, excecaoInfraEstrutura.descricao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, mensagem, descricao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExcecaoInfraEstrutura {\n");
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    mensagem: ").append(toIndentedString(mensagem)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

