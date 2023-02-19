package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void shouldCreateCustomerWithBuilder() {
        Customer customer = new Customer.Builder("name", "email").withPhoneNumber(123456).withCardPresent(true).build();

        assertEquals("name", customer.getName());
    }
}