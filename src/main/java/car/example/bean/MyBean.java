package car.example.bean;

public class MyBean {
    String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showMessage(){
        System.out.println("Message : "+message);
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
