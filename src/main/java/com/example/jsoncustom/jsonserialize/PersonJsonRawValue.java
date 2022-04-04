package com.example.jsoncustom.jsonserialize;

import com.fasterxml.jackson.annotation.JsonRawValue;

public class PersonJsonRawValue {

    @JsonRawValue
    public String rawValue;

    public PersonJsonRawValue(String rawValue) {
        this.rawValue = rawValue;
    }

}
