class CalculatorConundrum {
	/**
	 * {@code @method calculate} I Created a method when with used if I can choose only sum, multiplication and
	 * division to do a correct calculation
	 * for this first I created  Exceptions for null and empty after put in a try and catch for make sum,
	 * multiplication and division and this try catch is for division when the second number is 0
	 * but have a exception for the unknown operation.
	 *
	 * @param operand1  its the first number
	 * @param operand2  its the second number
	 * @param operation its the operation to do or multiplication, division or sum
	 *
	 * @return the result of the operation with division or multiplication or sum otherwise is onlu exceptions.
	 *
	 * @throws IllegalOperationException when the operation  is unknown
	 * @throws ArithmeticException       is produced when the second number is 0.
	 * @throws IllegalArgumentException  when the operation is null or empty.
	 **/

	public String calculate ( int operand1 , int operand2 , String operation ) {
		if ( operation == null ) {
			throw new IllegalArgumentException("Operation cannot be null");
		}
		else if ( operation.equals ( "" ) ) {
			throw new IllegalArgumentException ( "Operation cannot be empty" );
		}
		try {
				if ( operation.equals ( "+" ) ) {
					return operand1 + " + " + operand2 + " = " + ( operand1 + operand2 );
				}
				else if ( operation.equals ( "*" ) ) {
					return operand1 + " * " + operand2 + " = " + ( operand1 * operand2 );
				}
				else if ( operation.equals ( "/" ) ) {
					return operand1 + " / " + operand2 + " = " + ( operand1 / operand2 );
				}
				else { throw new IllegalOperationException ( "Operation '" + operation + "' does not exist" ); }
			} catch ( ArithmeticException e ) {
			throw new IllegalOperationException("Division by zero is not allowed", e);

		}

	}
}
