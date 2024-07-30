package design_patterns.DependencyInjectionExample;

public class CustomerService {
    private final CustomerRepository customerRepository;

    // Constructor injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void printCustomerDetails(int id) {
        String customerDetails = customerRepository.findCustomerById(id);
        System.out.println(customerDetails);
    }
}
