package com.jayesh;

public record UpdateCustomerRequest(
        Integer id,
        String name,
        String email,
        Integer age) {
}
