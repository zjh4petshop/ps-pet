package com.zjh.pspet.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Category extends BaseEntity {

	private String name;
}
