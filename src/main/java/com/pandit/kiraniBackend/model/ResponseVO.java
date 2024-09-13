package com.pandit.kiraniBackend.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ResponseVO {

    private List<String> SuccessMessage;

    private List<String> ErrorMessage;
}
