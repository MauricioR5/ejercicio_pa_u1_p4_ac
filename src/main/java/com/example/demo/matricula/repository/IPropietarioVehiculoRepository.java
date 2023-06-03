package com.example.demo.matricula.repository;

public interface IPropietarioVehiculoRepository {
	
	public void insertar(String id);
	public void eliminar(String id);
	public IPropietarioVehiculoRepository buscar(String id);
	public IPropietarioVehiculoRepository actualizar(IPropietarioVehiculoRepository propietario);

}
