package edu.task.exception;

public class TaskException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6207030630116360301L;

	public TaskException(Throwable throwable) {
		super(throwable);
	}

	public TaskException(Throwable throwable, String errorMessage) {
		super(errorMessage, throwable);
	}
	
	public TaskException(String errorMessage) {
		super(errorMessage);
	}
}