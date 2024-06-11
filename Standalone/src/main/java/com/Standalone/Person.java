package com.Standalone;

import java.util.List;

public class Person {
private List<String>frinds;

public List<String> getFrinds() {
	return frinds;
}

public void setFrinds(List<String> frinds) {
	this.frinds = frinds;
}

@Override
public String toString() {
	return "Person [frinds=" + frinds + "]";
}


}
