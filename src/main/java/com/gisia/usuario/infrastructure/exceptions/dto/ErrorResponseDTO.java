package com.gisia.usuario.infrastructure.exceptions.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorResponseDTO {

    private String message;
    private int status;
    private String path;
    private String error;
    private LocalDateTime timestamp;
}
