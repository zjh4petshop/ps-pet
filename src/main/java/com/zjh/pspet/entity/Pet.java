package com.zjh.pspet.entity;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;

import com.zjh.pspet.enums.Status;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Document
public class Pet extends BaseEntity {

	@NotNull
	private String name;
	private Category category;
	@NotNull
	private List<String> photoUrls;
	private List<Tag> tags;
	private Status status;
}
