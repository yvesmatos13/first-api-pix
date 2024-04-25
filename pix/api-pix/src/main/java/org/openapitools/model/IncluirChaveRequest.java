package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import org.openapitools.model.MotivoInclusao;
import org.openapitools.model.TipoChave;
import org.openapitools.model.TipoConta;
import org.openapitools.model.TipoPessoa;
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

@Schema(name = "incluirChaveRequest", description = "")
@JsonTypeName("incluirChaveRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-25T19:18:58.442807-03:00[America/Sao_Paulo]")
public class IncluirChaveRequest {

  private TipoChave tipoChave;

  private String chave;

  private String ispb;

  private String codigoAgencia;

  private TipoConta tipoConta;

  private String numeroConta;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dataHoraAberturaConta;

  private TipoPessoa tipoPessoa;

  private String documentoFiscal;

  private String nome;

  private String nomeFantasia;

  private MotivoInclusao motivoInclusao;

  public IncluirChaveRequest tipoChave(TipoChave tipoChave) {
    this.tipoChave = tipoChave;
    return this;
  }

  /**
   * Get tipoChave
   * @return tipoChave
  */
  @Valid 
  @Schema(name = "tipoChave", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tipoChave")
  public TipoChave getTipoChave() {
    return tipoChave;
  }

  public void setTipoChave(TipoChave tipoChave) {
    this.tipoChave = tipoChave;
  }

  public IncluirChaveRequest chave(String chave) {
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

  public IncluirChaveRequest ispb(String ispb) {
    this.ispb = ispb;
    return this;
  }

  /**
   * Get ispb
   * @return ispb
  */
  
  @Schema(name = "ispb", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ispb")
  public String getIspb() {
    return ispb;
  }

  public void setIspb(String ispb) {
    this.ispb = ispb;
  }

  public IncluirChaveRequest codigoAgencia(String codigoAgencia) {
    this.codigoAgencia = codigoAgencia;
    return this;
  }

  /**
   * Get codigoAgencia
   * @return codigoAgencia
  */
  
  @Schema(name = "codigoAgencia", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("codigoAgencia")
  public String getCodigoAgencia() {
    return codigoAgencia;
  }

  public void setCodigoAgencia(String codigoAgencia) {
    this.codigoAgencia = codigoAgencia;
  }

  public IncluirChaveRequest tipoConta(TipoConta tipoConta) {
    this.tipoConta = tipoConta;
    return this;
  }

  /**
   * Get tipoConta
   * @return tipoConta
  */
  @Valid 
  @Schema(name = "tipoConta", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tipoConta")
  public TipoConta getTipoConta() {
    return tipoConta;
  }

  public void setTipoConta(TipoConta tipoConta) {
    this.tipoConta = tipoConta;
  }

  public IncluirChaveRequest numeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
    return this;
  }

  /**
   * Get numeroConta
   * @return numeroConta
  */
  
  @Schema(name = "numeroConta", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numeroConta")
  public String getNumeroConta() {
    return numeroConta;
  }

  public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
  }

  public IncluirChaveRequest dataHoraAberturaConta(OffsetDateTime dataHoraAberturaConta) {
    this.dataHoraAberturaConta = dataHoraAberturaConta;
    return this;
  }

  /**
   * Get dataHoraAberturaConta
   * @return dataHoraAberturaConta
  */
  @Valid 
  @Schema(name = "dataHoraAberturaConta", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataHoraAberturaConta")
  public OffsetDateTime getDataHoraAberturaConta() {
    return dataHoraAberturaConta;
  }

  public void setDataHoraAberturaConta(OffsetDateTime dataHoraAberturaConta) {
    this.dataHoraAberturaConta = dataHoraAberturaConta;
  }

  public IncluirChaveRequest tipoPessoa(TipoPessoa tipoPessoa) {
    this.tipoPessoa = tipoPessoa;
    return this;
  }

  /**
   * Get tipoPessoa
   * @return tipoPessoa
  */
  @Valid 
  @Schema(name = "tipoPessoa", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tipoPessoa")
  public TipoPessoa getTipoPessoa() {
    return tipoPessoa;
  }

  public void setTipoPessoa(TipoPessoa tipoPessoa) {
    this.tipoPessoa = tipoPessoa;
  }

  public IncluirChaveRequest documentoFiscal(String documentoFiscal) {
    this.documentoFiscal = documentoFiscal;
    return this;
  }

  /**
   * Get documentoFiscal
   * @return documentoFiscal
  */
  
  @Schema(name = "documentoFiscal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("documentoFiscal")
  public String getDocumentoFiscal() {
    return documentoFiscal;
  }

  public void setDocumentoFiscal(String documentoFiscal) {
    this.documentoFiscal = documentoFiscal;
  }

  public IncluirChaveRequest nome(String nome) {
    this.nome = nome;
    return this;
  }

  /**
   * Get nome
   * @return nome
  */
  
  @Schema(name = "nome", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public IncluirChaveRequest nomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
    return this;
  }

  /**
   * Get nomeFantasia
   * @return nomeFantasia
  */
  
  @Schema(name = "nomeFantasia", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nomeFantasia")
  public String getNomeFantasia() {
    return nomeFantasia;
  }

  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }

  public IncluirChaveRequest motivoInclusao(MotivoInclusao motivoInclusao) {
    this.motivoInclusao = motivoInclusao;
    return this;
  }

  /**
   * Get motivoInclusao
   * @return motivoInclusao
  */
  @Valid 
  @Schema(name = "motivoInclusao", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("motivoInclusao")
  public MotivoInclusao getMotivoInclusao() {
    return motivoInclusao;
  }

  public void setMotivoInclusao(MotivoInclusao motivoInclusao) {
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
    IncluirChaveRequest incluirChaveRequest = (IncluirChaveRequest) o;
    return Objects.equals(this.tipoChave, incluirChaveRequest.tipoChave) &&
        Objects.equals(this.chave, incluirChaveRequest.chave) &&
        Objects.equals(this.ispb, incluirChaveRequest.ispb) &&
        Objects.equals(this.codigoAgencia, incluirChaveRequest.codigoAgencia) &&
        Objects.equals(this.tipoConta, incluirChaveRequest.tipoConta) &&
        Objects.equals(this.numeroConta, incluirChaveRequest.numeroConta) &&
        Objects.equals(this.dataHoraAberturaConta, incluirChaveRequest.dataHoraAberturaConta) &&
        Objects.equals(this.tipoPessoa, incluirChaveRequest.tipoPessoa) &&
        Objects.equals(this.documentoFiscal, incluirChaveRequest.documentoFiscal) &&
        Objects.equals(this.nome, incluirChaveRequest.nome) &&
        Objects.equals(this.nomeFantasia, incluirChaveRequest.nomeFantasia) &&
        Objects.equals(this.motivoInclusao, incluirChaveRequest.motivoInclusao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoChave, chave, ispb, codigoAgencia, tipoConta, numeroConta, dataHoraAberturaConta, tipoPessoa, documentoFiscal, nome, nomeFantasia, motivoInclusao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncluirChaveRequest {\n");
    sb.append("    tipoChave: ").append(toIndentedString(tipoChave)).append("\n");
    sb.append("    chave: ").append(toIndentedString(chave)).append("\n");
    sb.append("    ispb: ").append(toIndentedString(ispb)).append("\n");
    sb.append("    codigoAgencia: ").append(toIndentedString(codigoAgencia)).append("\n");
    sb.append("    tipoConta: ").append(toIndentedString(tipoConta)).append("\n");
    sb.append("    numeroConta: ").append(toIndentedString(numeroConta)).append("\n");
    sb.append("    dataHoraAberturaConta: ").append(toIndentedString(dataHoraAberturaConta)).append("\n");
    sb.append("    tipoPessoa: ").append(toIndentedString(tipoPessoa)).append("\n");
    sb.append("    documentoFiscal: ").append(toIndentedString(documentoFiscal)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    nomeFantasia: ").append(toIndentedString(nomeFantasia)).append("\n");
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

