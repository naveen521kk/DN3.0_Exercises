package com.example.EmployeeManagementSystem1;
//import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
//import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        // Return the currently authenticated user (you can customize this to integrate with your security context)
        return Optional.of("Admin"); // Example: returning a hard-coded username
    }
}
