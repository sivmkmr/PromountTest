package com.promounttest.result;

public class Result {
	
	String outputString;
	
	String messageString;

	public String getOutputString() {
		return outputString;
	}

	public void setOutputString(String outputString) {
		this.outputString = outputString;
	}

	public String getMessageString() {
		return messageString;
	}

	public void setMessageString(String messageString) {
		this.messageString = messageString;
	}

	@Override
	public String toString() {
		return "Result [outputString=" + outputString + ", messageString=" + messageString + "]";
	}
	
	

}
