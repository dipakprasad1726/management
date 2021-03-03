package com.library.management.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Request {
  private String slNo;
  private String note;
  private String requestedBy;
  private String date;
  private String formStatus;
  private String requestStatus;
  private String remarks;
  private String otherAttachments;

}
