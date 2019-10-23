package com.fpt.dto;

import com.fpt.entity.Book;
import com.fpt.util.DateTimeUtil;
import com.fpt.util.ObjectUtil;

public class BookDTO {
    private long id;
    private String name;
    private String description;
    private double price;
    private String img;
    private int quantity;
    private double sale;
    private String authorName;
    private String publisherName;

    private String createAt;
    private String updateAt;
    private String deleteAt;
    private String status;


    public BookDTO() {
    }

    public BookDTO(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public BookDTO(Book book) {
        this.description = "";
        this.img = "";
        ObjectUtil.cloneObject(this, book);
        this.authorName = book.getAuthor().getName();
        this.publisherName = book.getPublisher().getName();
        this.createAt = DateTimeUtil.formatDateFromLong(book.getCreateAt());
        this.updateAt = DateTimeUtil.formatDateFromLong(book.getUpdateAt());
        this.deleteAt = DateTimeUtil.formatDateFromLong(book.getDeleteAt());
        this.status = book.getStatus() == 1 ? "Active" : "Deactive";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public String getDeleteAt() {
        return deleteAt;
    }

    public void setDeleteAt(String deleteAt) {
        this.deleteAt = deleteAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}