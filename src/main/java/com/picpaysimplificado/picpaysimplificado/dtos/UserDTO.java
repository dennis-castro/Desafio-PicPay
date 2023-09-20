package com.picpaysimplificado.picpaysimplificado.dtos;

import com.picpaysimplificado.picpaysimplificado.domain.user.UsersType;

import java.math.BigDecimal;

public record UserDTO(String firsName, String lastName, String document, BigDecimal balance, String email, String password, UsersType userType) {
}
