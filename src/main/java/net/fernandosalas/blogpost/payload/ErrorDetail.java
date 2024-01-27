package net.fernandosalas.blogpost.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class ErrorDetail {

    private Date timeStamp;

    private String message;

    private String detail;
}
