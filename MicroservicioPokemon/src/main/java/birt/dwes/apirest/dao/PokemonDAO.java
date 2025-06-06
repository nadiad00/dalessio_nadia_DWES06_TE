package birt.dwes.apirest.dao;

import java.util.List;

import birt.dwes.apirest.entity.Pokemon;

public interface PokemonDAO {

	public List<Pokemon> getAll();
	
	public Pokemon getById(int id);
	
	public List<Pokemon> getByType(String tipo);
	
	public List<Pokemon> getByGen(int gen);
}
