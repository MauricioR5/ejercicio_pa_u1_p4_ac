package com.example.demo.matricula.service;

import com.example.demo.modelo.PropietarioVehiculo;
import com.example.demo.modelo.Vehiculos;

public interface MatriculaVehiculoService {
	
	public void agregar(String placa);
	public MatriculaVehiculoService actualizar(Vehiculos placa, PropietarioVehiculo id);

}
