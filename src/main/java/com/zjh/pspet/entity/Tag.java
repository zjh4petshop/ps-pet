package com.zjh.pspet.entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Tag extends BaseEntity {

	private String name;
}
