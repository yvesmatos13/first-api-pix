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

@Schema(name = "tipoChave", description = "")
@JsonTypeName("tipoChave")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-25T19:18:58.442807-03:00[America/Sao_Paulo]")
public class TipoChave {

  /**
   * Gets or Sets tipoChave
   */
  public enum TipoChaveEnum {
    CPF_("CPF\""),
    
    CNPJ("CNPJ"),
    
    TELEFONE("Telefone"),
    
    EMAIL("Email"),
    
    EVP("EVP");

    private String value;

    TipoChaveEnum(String value) {
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
    public static TipoChaveEnum fromValue(String value) {
      for (TipoChaveEnum b : TipoChaveEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TipoChaveEnum tipoChave;

  public TipoChave tipoChave(TipoChaveEnum tipoChave) {
    this.tipoChave = tipoChave;
    return this;
  }

  /**
   * Get tipoChave
   * @return tipoChave
  */
  
  @Schema(name = "tipoChave", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tipoChave")
  public TipoChaveEnum getTipoChave() {
    return tipoChave;
  }

  public void setTipoChave(TipoChaveEnum tipoChave) {
    this.tipoChave = tipoChave;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TipoChave tipoChave = (TipoChave) o;
    return Objects.equals(this.tipoChave, tipoChave.tipoChave);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoChave);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoChave {\n");
    sb.append("    tipoChave: ").append(toIndentedString(tipoChave)).append("\n");
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

