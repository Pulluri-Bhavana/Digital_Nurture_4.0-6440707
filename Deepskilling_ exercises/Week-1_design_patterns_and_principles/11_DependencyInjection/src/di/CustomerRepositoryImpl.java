package di;

public class CustomerRepositoryImpl implements CustomerRepository {
    public String findCustomerById(String id) {
        return "Customer: " + id + ", Name: Riya Sharma";
    }
}
