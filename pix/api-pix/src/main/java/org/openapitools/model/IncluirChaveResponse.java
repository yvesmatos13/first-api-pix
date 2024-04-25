package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
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

@Schema(name = "incluirChaveResponse", description = "")
@JsonTypeName("incluirChaveResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-25T19:18:58.442807-03:00[America/Sao_Paulo]")
public class IncluirChaveResponse {

  private String chave;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dataCriacaoChave;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dataInicioPosseChave;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dataAberturaReivindicacao;

  public IncluirChaveResponse chave(String chave) {
    this.chave = chave;
    return this;
  }

  /**
   * Get chave
   * @return chave
  */
  
  @Schema(name = "chave", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("chave")
  public String getChave() {
    return chave;
  }

  public void setChave(String chave) {
    this.chave = chave;
  }

  public IncluirChaveResponse dataCriacaoChave(OffsetDateTime dataCriacaoChave) {
    this.dataCriacaoChave = dataCriacaoChave;
    return this;
  }

  /**
   * Get dataCriacaoChave
   * @return dataCriacaoChave
  */
  @Valid 
  @Schema(name = "dataCriacaoChave", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataCriacaoChave")
  public OffsetDateTime getDataCriacaoChave() {
    return dataCriacaoChave;
  }

  public void setDataCriacaoChave(OffsetDateTime dataCriacaoChave) {
    this.dataCriacaoChave = dataCriacaoChave;
  }

  public IncluirChaveResponse dataInicioPosseChave(OffsetDateTime dataInicioPosseChave) {
    this.dataInicioPosseChave = dataInicioPosseChave;
    return this;
  }

  /**
   * Get dataInicioPosseChave
   * @return dataInicioPosseChave
  */
  @Valid 
  @Schema(name = "dataInicioPosseChave", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataInicioPosseChave")
  public OffsetDateTime getDataInicioPosseChave() {
    return dataInicioPosseChave;
  }

  public void setDataInicioPosseChave(OffsetDateTime dataInicioPosseChave) {
    this.dataInicioPosseChave = dataInicioPosseChave;
  }

  public IncluirChaveResponse dataAberturaReivindicacao(OffsetDateTime dataAberturaReivindicacao) {
    this.dataAberturaReivindicacao = dataAberturaReivindicacao;
    return this;
  }

  /**
   * Get dataAberturaReivindicacao
   * @return dataAberturaReivindicacao
  */
  @Valid 
  @Schema(name = "dataAberturaReivindicacao", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataAberturaReivindicacao")
  public OffsetDateTime getDataAberturaReivindicacao() {
    return dataAberturaReivindicacao;
  }

  public void setDataAberturaReivindicacao(OffsetDateTime dataAberturaReivindicacao) {
    this.dataAberturaReivindicacao = dataAberturaReivindicacao;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncluirChaveResponse incluirChaveResponse = (IncluirChaveResponse) o;
    return Objects.equals(this.chave, incluirChaveResponse.chave) &&
        Objects.equals(this.dataCriacaoChave, incluirChaveResponse.dataCriacaoChave) &&
        Objects.equals(this.dataInicioPosseChave, incluirChaveResponse.dataInicioPosseChave) &&
        Objects.equals(this.dataAberturaReivindicacao, incluirChaveResponse.dataAberturaReivindicacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chave, dataCriacaoChave, dataInicioPosseChave, dataAberturaReivindicacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncluirChaveResponse {\n");
    sb.append("    chave: ").append(toIndentedString(chave)).append("\n");
    sb.append("    dataCriacaoChave: ").append(toIndentedString(dataCriacaoChave)).append("\n");
    sb.append("    dataInicioPosseChave: ").append(toIndentedString(dataInicioPosseChave)).append("\n");
    sb.append("    dataAberturaReivindicacao: ").append(toIndentedString(dataAberturaReivindicacao)).append("\n");
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

