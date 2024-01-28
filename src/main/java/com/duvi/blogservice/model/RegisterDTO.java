package com.duvi.blogservice.model;

public record RegisterDTO (String username, String email, String password, UserRole role) {
}
