package ru.sartfoms.asyncoperations.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MPI_GET_VIEW_DATA_ATTACH_START", schema = "OMCOWNER")
public class GetViewDataAttachStart {
	@Id
	@Column(name = "rid")
	private Long rid;

	@Column(name = "dt_ins")
	private LocalDateTime dtIns;

	@Column(name = "dt")
	private LocalDate dt;

	@Column(name = "usr")
	private String usr;

	@Column(name = "dt_req")
	private LocalDateTime dtreq;

	@Column(name = "err")
	private Boolean hasError;

	@Column(name = "optoken")
	private String opToken;

	public Long getRid() {
		return rid;
	}

	public void setRid(Long rid) {
		this.rid = rid;
	}

	public LocalDateTime getDtIns() {
		return dtIns;
	}

	public void setDtIns(LocalDateTime dtIns) {
		this.dtIns = dtIns;
	}

	public LocalDate getDt() {
		return dt;
	}

	public void setDt(LocalDate dt) {
		this.dt = dt;
	}

	public String getUsr() {
		return usr;
	}

	public void setUsr(String usr) {
		this.usr = usr;
	}

	public LocalDateTime getDtreq() {
		return dtreq;
	}

	public void setDtreq(LocalDateTime dtreq) {
		this.dtreq = dtreq;
	}

	public Boolean getHasError() {
		return hasError;
	}

	public void setHasError(Boolean hasError) {
		this.hasError = hasError;
	}

	public String getOpToken() {
		return opToken;
	}

	public void setOpToken(String opToken) {
		this.opToken = opToken;
	}

}
