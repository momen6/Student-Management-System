package com.momen.studentSystem.dto;

import com.momen.studentSystem.util.enums.ResponseMessage;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GenericResponse<T> {

    private T data;
    private ResponseMessage responseMessage;
    private Long responseCode;
    private String errorMessage;
}
