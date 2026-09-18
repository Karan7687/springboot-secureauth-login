package com.hdfc.secureauth.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RegisterRequestDto(

        @NotBlank
        @Size(max = 254)
        @Email
        String email,

        @NotBlank
        @Size(min = 3, max = 254)
        String username,

        @NotBlank
        @Size(min = 6, max = 6)
        String password

) {

//record--> A Java feature for creating data-carrier classes with less boilerplate code.
}
