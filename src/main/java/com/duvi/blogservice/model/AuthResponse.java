package com.duvi.blogservice.model;

public record AuthResponse (String token, UserDTO loggedUser) {
}
