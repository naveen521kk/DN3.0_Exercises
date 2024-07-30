package design_patterns.DependencyInjectionExample;

public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Create an instance of CustomerRepositoryImpl
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject the repository into CustomerService
        CustomerService customerService = new CustomerService(customerRepository);

        // Use CustomerService to find and print customer details
        customerService.printCustomerDetails(1);
    }
}
