package design_patterns.DependencyInjectionExample;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(int id) {
        // Simulate fetching customer from a data source
        return "Customer with ID " + id;
    }
}