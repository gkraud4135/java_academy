package com.lec206.ex07_impl;

public class Product<T, M> {
	
	private T kind;
	private M model;
	
	public T getKind() {
		return kind;
	}
	
	public void setKind(T kind) {
		this.kind = kind;
	}
	
	public M getModel() {
		return model;
	}
	
	public void setModel(M model) {
		this.model = model;
	}
}

class Car {}
class TV {}
