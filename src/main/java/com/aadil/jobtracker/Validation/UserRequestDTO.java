package com.aadil.jobtracker.Validation;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserRequestDTO {
    private Long id;

    @NotBlank (message = "Name is required")
    private String name;

    @NotBlank(message = "Email is required")
    @Email
    @Column (unique = true, nullable = false)
    private String email;

    @NotBlank (message = "Password is required")
    @Min(value = 8,message = "Password should be at least 8 characters")
    @Max(value = 20,message = "Password should NOT exceed 20 characters")
    private String password;

    @NotBlank (message = "Roles are required")
    private String roles;


}