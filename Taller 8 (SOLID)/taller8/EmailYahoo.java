package taller8;

public class EmailYahoo extends Email{
    private String file;

    public EmailYahoo(String subject, String to, String body, String file) {
        super(subject, to, body);
        this.file = file;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    } 
    
}