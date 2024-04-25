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

@Schema(name = "consultarChaveResponse", description = "")
@JsonTypeName("consultarChaveResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-25T19:18:58.442807-03:00[America/Sao_Paulo]")
public class ConsultarChaveResponse {

  private String chave;

  public ConsultarChaveResponse chave(String chave) {
    this.chave = chave;
    return this;
  }

  /**
   * 
   * @return chave
  */
  
  @Schema(name = "chave", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("chave")
  public String getChave() {
    return chave;
  }

  public void setChave(String chave) {
    this.chave = chave;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultarChaveResponse consultarChaveResponse = (ConsultarChaveResponse) o;
    return Objects.equals(this.chave, consultarChaveResponse.chave);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chave);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultarChaveResponse {\n");
    sb.append("    chave: ").append(toIndentedString(chave)).append("\n");
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

