package Models;
/**
 *
 * @author Miguel
 */
public class ContactModel {
    
    private String contactId, contactName, contactNumberPhone, contactAddress, contactEmail, contactState, contactCreatedAt, contactUpdatedAt;
    private int contactIsEnterprise;
    
    public ContactModel(String id, String name, int isEnterprise, String numberPhone, String email, String state, String createdAt, String updatedAt){
        this.contactId = id;
        this.contactName = name;
        this.contactIsEnterprise = isEnterprise;
        this.contactNumberPhone = numberPhone;
        this.contactEmail = email;
        this.contactState = state;
        this.contactCreatedAt = createdAt;
        this.contactUpdatedAt = updatedAt;
    }
    
    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactNumberPhone() {
        return contactNumberPhone;
    }

    public void setContactNumberPhone(String contactNumberPhone) {
        this.contactNumberPhone = contactNumberPhone;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactState() {
        return contactState;
    }

    public void setContactState(String contactState) {
        this.contactState = contactState;
    }

    public String getContactCreatedAt() {
        return contactCreatedAt;
    }

    public void setContactCreatedAt(String contactCreatedAt) {
        this.contactCreatedAt = contactCreatedAt;
    }

    public String getContactUpdatedAt() {
        return contactUpdatedAt;
    }

    public void setContactUpdatedAt(String contactUpdatedAt) {
        this.contactUpdatedAt = contactUpdatedAt;
    }

    public int getContactIsEnterprise() {
        return contactIsEnterprise;
    }

    public void setContactIsEnterprise(int contactIsEnterprise) {
        this.contactIsEnterprise = contactIsEnterprise;
    }
}