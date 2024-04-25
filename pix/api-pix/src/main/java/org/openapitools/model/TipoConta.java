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

@Schema(name = "tipoConta", description = "")
@JsonTypeName("tipoConta")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-25T19:18:58.442807-03:00[America/Sao_Paulo]")
public class TipoConta {

  /**
   * Gets or Sets tipoConta
   */
  public enum TipoContaEnum {
    CONTACORRENTE("ContaCorrente"),
    
    CONTASALARIO("ContaSalario"),
    
    CONTAPOUPANCA("ContaPoupanca"),
    
    CONTAPAGAMENTO("ContaPagamento");

    private String value;

    TipoContaEnum(String value) {
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
    public static TipoContaEnum fromValue(String value) {
      for (TipoContaEnum b : TipoContaEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TipoContaEnum tipoConta;

  public TipoConta tipoConta(TipoContaEnum tipoConta) {
    this.tipoConta = tipoConta;
    return this;
  }

  /**
   * Get tipoConta
   * @return tipoConta
  */
  
  @Schema(name = "tipoConta", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tipoConta")
  public TipoContaEnum getTipoConta() {
    return tipoConta;
  }

  public void setTipoConta(TipoContaEnum tipoConta) {
    this.tipoConta = tipoConta;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TipoConta tipoConta = (TipoConta) o;
    return Objects.equals(this.tipoConta, tipoConta.tipoConta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoConta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoConta {\n");
    sb.append("    tipoConta: ").append(toIndentedString(tipoConta)).append("\n");
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

