package com.fpt.dto;

import com.fpt.entity.Publisher;
import com.fpt.util.DateTimeUtil;

public class PublisherDTO {
    private long id;
    private String name;
    private String avatar;
    private String description;

    private String createAt;
    private String updateAt;
    private String deleteAt;
    private String status;

    public PublisherDTO() {
    }

    public PublisherDTO(Publisher publisher) {
        this.name = publisher.getName();
<<<<<<< HEAD
        this.img = publisher.getAvatar();
        this.description = publisher.getDescription();
        this.createAt = DateTimeUtil.formatDateFromLong(publisher.getCreatedAt());
        this.updateAt = DateTimeUtil.formatDateFromLong(publisher.getUpdatedAt());
        this.deleteAt = DateTimeUtil.formatDateFromLong(publisher.getUpdatedAt());
=======
        this.avatar = publisher.getAvatar();
        this.description = publisher.getDescription();
        this.createAt = DateTimeUtil.formatDateFromLong(publisher.getCreatedAt());
        this.updateAt = DateTimeUtil.formatDateFromLong(publisher.getUpdatedAt());
        this.deleteAt = DateTimeUtil.formatDateFromLong(publisher.getDeletedAt());
>>>>>>> 7099d85cc537bd94fb2b5f2347474f2cb7ab7055
        this.status = publisher.getStatus() == 1 ? "Active" : "Deactive";


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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
