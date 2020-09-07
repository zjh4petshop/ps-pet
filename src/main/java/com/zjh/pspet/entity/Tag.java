package com.zjh.pspet.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Builder
@Data
@EqualsAndHashCode(callSuper = false)
public class Tag extends BaseEntity {

	private String name;
}
