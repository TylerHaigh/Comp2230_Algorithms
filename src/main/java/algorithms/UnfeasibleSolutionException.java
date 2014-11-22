package algorithms;

public class UnfeasibleSolutionException extends RuntimeException {

	public UnfeasibleSolutionException() {
		super("Solution is not feasible");
	}
	
	public UnfeasibleSolutionException(String message) {
		super(message);
	}
}
