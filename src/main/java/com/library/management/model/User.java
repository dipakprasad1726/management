package com.library.management.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
  private int userId;
  private String firstName;
  private String lastName;
  private String role;
  private String createdOn;
  private String updatedOn;
}
