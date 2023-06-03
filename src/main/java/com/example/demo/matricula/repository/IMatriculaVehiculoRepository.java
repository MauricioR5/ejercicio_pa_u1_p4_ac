package com.example.demo.matricula.repository;

import com.example.demo.modelo.Vehiculos;

public interface IMatriculaVehiculoRepository {
	public void insertar(Vehiculos vehiculo);
	public void eliminar(Vehiculos vehiculo);
	public IMatriculaVehiculoRepository buscar(IMatriculaVehiculoRepository propietario);
	public IMatriculaVehiculoRepository actualizar(IMatriculaVehiculoRepository vehiculo);
	
	

}
