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
public class Book extends Request{
  private String nameOfTheBook;
  private String author;
  private String genre;
  private String privateation;
}
