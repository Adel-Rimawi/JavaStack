
public class CalculatorTest {

	public static void main(String[] args) {
		Calculator test = new Calculator();
		test.setOperator1(10.5);
		test.setOperator('+');
		test.setOperator2(5.2);
		test.performOperation();
		test.getResults();
		
	}

}