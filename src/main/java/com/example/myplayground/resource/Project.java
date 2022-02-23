package com.example.myplayground.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Data;

@JsonApiResource(type = "projects")
@Data
public class Project {

    @JsonApiId
    private Long id;

    @JsonProperty
    private String name;

    private int age;

}
