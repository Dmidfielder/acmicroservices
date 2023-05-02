package kz.abcompany.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
