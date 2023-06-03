package com.example.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MatriculaVehiculo {

	private LocalDate fechaMatricula;
	private BigDecimal valorMatricula;
	private PropietarioVehiculo propietariov;
	private Vehiculos vehiculo;
	
	//SET y GET
	public LocalDate getFechaMatricula() {
		return fechaMatricula;
	}
	public void setFechaMatricula(LocalDate fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	public BigDecimal getValorMatricula() {
		return valorMatricula;
	}
	public void setValorMatricula(BigDecimal valorMatricula) {
		this.valorMatricula = valorMatricula;
	}
	public PropietarioVehiculo getPropietariov() {
		return propietariov;
	}
	public void setPropietariov(PropietarioVehiculo propietariov) {
		this.propietariov = propietariov;
	}
	public Vehiculos getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculos vehiculo) {
		this.vehiculo = vehiculo;
	}
	@Override
	public String toString() {
		return "MatriculaVehiculo [fechaMatricula=" + fechaMatricula + ", valorMatricula=" + valorMatricula
				+ ", propietariov=" + propietariov + ", vehiculo=" + vehiculo + "]";
	}
	
	
	
}
