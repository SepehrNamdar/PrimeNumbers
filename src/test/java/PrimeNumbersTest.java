import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimeNumbersTest {

    /*
     * Implement PrimeNumbers Class
     */
    @Test
    public void should_find_prime_numbers_up_to_a_limit() {
        PrimeNumbers primeNumbers = new PrimeNumbers();

        List<Integer> actualPrimeNumbers = primeNumbers.calculate(30);

        assertThat(actualPrimeNumbers).containsExactly(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
    }

    /*
      Add a UT which throws an IllegalArgumentException when argument is less than 2
     */


    /*
     Add a UT which throws an NullPointerException when argument is NULL
     */

}
