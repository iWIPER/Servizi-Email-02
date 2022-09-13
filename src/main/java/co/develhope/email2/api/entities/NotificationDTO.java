package co.develhope.email2.api.entities;

import lombok.Data;

@Data
public class NotificationDTO {
    private String contactId;
    private String title;
    private String text;

    // Empty Constructor
    public void NotificationDTO(){

    }

    // Constructor
    public NotificationDTO(String contactId, String title, String text) {
        this.contactId = contactId;
        this.title = title;
        this.text = text;
    }

    // Getter and Setter
    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

