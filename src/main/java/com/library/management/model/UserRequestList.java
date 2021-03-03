package com.library.management.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class UserRequestList {
 public List<Request> requestList;
}
