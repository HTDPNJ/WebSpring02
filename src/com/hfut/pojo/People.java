package com.hfut.pojo;

import com.sun.xml.internal.ws.wsdl.parser.MemberSubmissionAddressingWSDLParserExtension;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public  class People {
	private int id;
	private String name;
	private Set<String> sets;
	private List<String> list;
	private String[]strs;
	private Map<String,String> map;
	private Desk desk;

	public Desk getDesk() {
		return desk;
	}

	public void setDesk(Desk desk) {
		this.desk = desk;
	}

	@Override
	public String toString() {
		return "People{" +
				"id=" + id +
				", name='" + name + '\'' +
				", sets=" + sets +
				", list=" + list +
				", strs=" + Arrays.toString(strs) +
				", map=" + map +
				", desk=" + desk +
				'}';
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public String[] getStrs() {
		return strs;
	}

	public void setStrs(String[] strs) {
		this.strs = strs;
	}

	public People(int id, String name, Set<String> sets, List<String> list) {
		this.id = id;
		this.name = name;
		this.sets = sets;
		this.list = list;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Set<String> getSets() {
		return sets;
	}

	public void setSets(Set<String> sets) {
		this.sets = sets;
	}

	public People(int id, String name, Set<String> sets) {
		this.id = id;
		this.name = name;
		this.sets = sets;
	}

	public People() {
		super();
	}
	

	public People(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		System.out.println("执行set id");
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
