
public class Calculator implements java.io.Serializable {
	private double num1;
	private double num2;
	private char Operation;
	private double results;
	
	
	public Calculator() {
		
	}


	public void setOperator1(double num1) {
		this.num1 = num1;
	}

	public void setOperator2(double num2) {
		this.num2 = num2;
	}

	
	public void setOperator(char Operation) {
		this.Operation = Operation;
	}
	public void performOperation() {
		if( this.Operation == '+') {
			this.results = (num1) + (num2);
		}
		if( this.Operation == '-') {
			this.results = (num1) - (num2);
		}	
	}
	public void getResults() {
		System.out.println(results);
	}
		
	
}
