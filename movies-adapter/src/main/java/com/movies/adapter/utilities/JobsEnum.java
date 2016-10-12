package com.movies.adapter.utilities;

public enum JobsEnum {
	ACTOR("Actor", 1), DIRECTOR("Director", 2);

	private String tipoJob;
	private Integer id;

	private JobsEnum(String tipoJob, Integer order) {
		this.tipoJob = tipoJob;
		this.id = order;
	}

	public String getTipoJob() {
		return tipoJob;
	}

	public void setTipoJob(String tipoJob) {
		this.tipoJob = tipoJob;
	}

	public Integer getPosEnum() {
		return id;
	}

	public void setPosEnum(Integer order) {
		this.id = order;
	}

}
