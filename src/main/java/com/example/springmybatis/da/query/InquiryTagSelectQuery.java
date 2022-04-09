package com.example.springmybatis.da.query;

import lombok.*;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

@Data
public class InquiryTagSelectQuery {
    /**
     * 並び替え対象フィールド
     */
    public enum OrderByField {
        /**
         * ID
         */
        ID("id"),
        /**
         * 問合せID
         */
        INQUIRY_ID("inquiry_id"),
        /**
         * 内容
         */
        DESCRIPTION("description"),
        /**
         * 作成日時
         */
        CREATED("created");

        private final String value;

        OrderByField(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }

    /**
     * 並び替え順序(asc / desc)
     */
    public enum SortOrder {
        ASC("asc"), DESC("desc");

        private final String value;
        SortOrder(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }

    private static class OrderCondition {
        private final OrderByField field;
        private final SortOrder sortOrder;
        
        public OrderCondition (final OrderByField field, final SortOrder sortOrder) {
        	this.field = field;
			this.sortOrder = sortOrder;
        }
    }

    private List<Integer> inquiryIds;
    private String description;

    private LocalDateTime fromCreated;
    private LocalDateTime toCreated;

    @Getter(AccessLevel.PRIVATE)
    @Setter(AccessLevel.PRIVATE)
    private List<OrderCondition> orderConditions = new ArrayList<>();

    /**
     * orderBy文字列を返します
     * getter形式のため、xmlからは${orderBy}でアクセス可能
     * @return orderBy文字列
     */
    public String getOrderBy() {
        StringJoiner sj = new StringJoiner(",");
        for (OrderCondition oc: orderConditions) {
            sj.add(oc.field.getValue() + " " + oc.sortOrder.getValue());
        }

        return sj.toString();
    }

    public void addOrderCondition(OrderByField field, SortOrder sortOrder) {
        orderConditions.add(new OrderCondition(field, sortOrder));
    }

	public List<Integer> getInquiryIds() {
		return inquiryIds;
	}

	public void setInquiryIds(List<Integer> inquiryIds) {
		this.inquiryIds = inquiryIds;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getFromCreated() {
		return fromCreated;
	}

	public void setFromCreated(LocalDateTime fromCreated) {
		this.fromCreated = fromCreated;
	}

	public LocalDateTime getToCreated() {
		return toCreated;
	}

	public void setToCreated(LocalDateTime toCreated) {
		this.toCreated = toCreated;
	}

	public List<OrderCondition> getOrderConditions() {
		return orderConditions;
	}

	public void setOrderConditions(List<OrderCondition> orderConditions) {
		this.orderConditions = orderConditions;
	}
    
    
}
