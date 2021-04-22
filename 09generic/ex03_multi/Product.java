package com.lec206.ex03_multi;

public class Product<T, V> {
	
	private T kind;
	private V model;
	
	public T getKind() {
		return kind;
	}
	
	public void setKind(T kind) {
		this.kind = kind;
	}
	
	public V getModel() {
		return model;
	}
	
	public void setModel(V model) {
		this.model = model;
	}
}

class Car {}
class TV {}