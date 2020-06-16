import java.math.BigDecimal;

public class TestBigDecimal {

public static void main(String args[]) {
	BigDecimal min = new BigDecimal(175);
	System.out.println(new BigDecimal(9.90).abs());
	System.out.println(min.subtract(new BigDecimal(9.90)));
}

}
