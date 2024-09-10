package taller8;

public class EmailGmail extends Email {
    private String img;

    public EmailGmail(String subject, String to, String body, String img) {
        super(subject, to, body);
        this.img = img;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }   
}