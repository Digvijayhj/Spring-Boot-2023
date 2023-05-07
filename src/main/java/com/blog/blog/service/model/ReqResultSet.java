package com.blog.blog.service.model;

import com.blog.blog.model.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@JsonIgnoreProperties
@AllArgsConstructor
public class ReqResultSet {
    TableA a;
    TableB b;
    TableC c;
}
