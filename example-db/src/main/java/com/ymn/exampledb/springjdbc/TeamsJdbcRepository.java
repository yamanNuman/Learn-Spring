//package com.ymn.exampledb.springjdbc;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
////@Repository
//public class TeamsJdbcRepository {
//
//	@Autowired
//	private JdbcTemplate springJdbcTemplate;
//	
//	private String INSERT_QUERY = "INSERT INTO teams (id,name,country,league_name) values(?,?,?,?)";
//	private String DELETE_QUERY = "DELETE FROM teams WHERE id=?";
//	private String SELECT_QUERY = "SELECT * FROM teams WHERE id=?";
//	
//	public void insert(Teams teams) {
//		springJdbcTemplate.update(INSERT_QUERY,teams.getId(),teams.getName(),teams.getCountry(),teams.getLeague_name());
//	}
//	
//	public void delete(long id) {
//		springJdbcTemplate.update(DELETE_QUERY,id);
//	}
//	
//	public Teams findById(long id) {
//		return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Teams.class),id);
//	}
//}
