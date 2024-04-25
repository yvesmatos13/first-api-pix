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

@Schema(name = "tipoPessoa", description = "")
@JsonTypeName("tipoPessoa")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-25T19:18:58.442807-03:00[America/Sao_Paulo]")
public class TipoPessoa {

  /**
   * 
   */
  public enum TipoPessoaEnum {
    PESSOAFISICA("PessoaFisica"),
    
    PESSOAJURIDICA("PessoaJuridica");

    private String value;

    TipoPessoaEnum(String value) {
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
    public static TipoPessoaEnum fromValue(String value) {
      for (TipoPessoaEnum b : TipoPessoaEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TipoPessoaEnum tipoPessoa;

  public TipoPessoa tipoPessoa(TipoPessoaEnum tipoPessoa) {
    this.tipoPessoa = tipoPessoa;
    return this;
  }

  /**
   * 
   * @return tipoPessoa
  */
  
  @Schema(name = "tipoPessoa", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tipoPessoa")
  public TipoPessoaEnum getTipoPessoa() {
    return tipoPessoa;
  }

  public void setTipoPessoa(TipoPessoaEnum tipoPessoa) {
    this.tipoPessoa = tipoPessoa;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TipoPessoa tipoPessoa = (TipoPessoa) o;
    return Objects.equals(this.tipoPessoa, tipoPessoa.tipoPessoa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoPessoa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoPessoa {\n");
    sb.append("    tipoPessoa: ").append(toIndentedString(tipoPessoa)).append("\n");
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

