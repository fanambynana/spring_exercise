package com.spring_exercise.model;

import com.spring_exercise.model.Enum.CategoryGroup;

import java.io.Serializable;

public class TransactionCategory implements Serializable {
    private int id;
    private String categoryName;
    private CategoryGroup categoryGroup;

    public TransactionCategory() {
    }

    public TransactionCategory(int id, String categoryName, CategoryGroup categoryGroup) {
        this.id = id;
        this.categoryName = categoryName;
        this.categoryGroup = categoryGroup;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public CategoryGroup getCategoryGroup() {
        return categoryGroup;
    }

    public void setCategoryGroup(CategoryGroup categoryGroup) {
        this.categoryGroup = categoryGroup;
    }

    @Override
    public String toString() {
        return "TransactionCategory{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                ", categoryGroup=" + categoryGroup +
                '}';
    }
}
