package com.Graymatter;

public class Complex {
	
	int imag;
	int real;
	public int getImag() {
		return imag;
	}
	public void setImag(int imag) {
		this.imag = imag;
	}
	public int getReal() {
		return real;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public Complex(int imag, int real) {
		super();
		this.imag = imag;
		this.real = real;
	}
	public Complex() {
		super();
	}

}
