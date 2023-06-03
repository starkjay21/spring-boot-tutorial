package com.jayesh;

public record NewCustomerRequest(
        String name,
        String email,
        Integer age
) {
}
