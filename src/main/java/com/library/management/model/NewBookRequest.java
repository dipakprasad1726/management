package com.library.management.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NewBookRequest {
  private int userId;
  private String requestType;
  private String formStatus;
  private List<Object> requests;
}
