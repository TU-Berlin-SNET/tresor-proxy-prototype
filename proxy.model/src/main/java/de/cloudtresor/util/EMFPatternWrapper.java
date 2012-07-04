package de.cloudtresor.util;

import java.util.regex.Pattern;

public class EMFPatternWrapper {
	private Pattern pattern;
	private String regex;
	
	public EMFPatternWrapper(String regex) {
		this.regex = regex;
		this.pattern = Pattern.compile(regex);
	}
	
	public Pattern getPattern() {
		return pattern;
	}
	
	public String toString() {
		return regex;
	}
}
