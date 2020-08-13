package com.zjh.pspet.entity;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.zjh.pspet.enums.Status;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Pet extends BaseEntity {

  @NotNull private String name;
  private Category category;
  @NotNull private List<String> photoUrls;
  private List<Tag> tags;
  private Status status;
}
