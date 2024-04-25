package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
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

@Schema(name = "motivoInclusao", description = "")
@JsonTypeName("motivoInclusao")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-25T19:18:58.442807-03:00[America/Sao_Paulo]")
public class MotivoInclusao {

  /**
   * Gets or Sets motivoInclusao
   */
  public enum MotivoInclusaoEnum {
    SOLICITACAOCLIENTE("SolicitacaoCliente"),
    
    RECONCILIACAO("Reconciliacao");

    private String value;

    MotivoInclusaoEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MotivoInclusaoEnum fromValue(String value) {
      for (MotivoInclusaoEnum b : MotivoInclusaoEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private MotivoInclusaoEnum motivoInclusao;

  public MotivoInclusao motivoInclusao(MotivoInclusaoEnum motivoInclusao) {
    this.motivoInclusao = motivoInclusao;
    return this;
  }

  /**
   * Get motivoInclusao
   * @return motivoInclusao
  */
  
  @Schema(name = "motivoInclusao", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("motivoInclusao")
  public MotivoInclusaoEnum getMotivoInclusao() {
    return motivoInclusao;
  }

  public void setMotivoInclusao(MotivoInclusaoEnum motivoInclusao) {
    this.motivoInclusao = motivoInclusao;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MotivoInclusao motivoInclusao = (MotivoInclusao) o;
    return Objects.equals(this.motivoInclusao, motivoInclusao.motivoInclusao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(motivoInclusao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MotivoInclusao {\n");
    sb.append("    motivoInclusao: ").append(toIndentedString(motivoInclusao)).append("\n");
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

