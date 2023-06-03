package com.example.demo.matricula.repository;

import com.example.demo.modelo.Vehiculos;

public interface IVehiculoRepository {
	
	public void insertar(String placa);
	public void eliminar(String placa);
	public Vehiculos buscar(String placa);
	public Vehiculos actualizar(Vehiculos vehiculos);
	
	

}
