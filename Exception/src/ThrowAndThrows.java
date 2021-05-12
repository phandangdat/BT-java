public class ThrowAndThrows {
    public static void main(String[] args) {
        ThrowAndThrows tat = new ThrowAndThrows();
        try {
            tat.checkStatus();
            tat.connectDatabase();  
        } catch (EducationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void connectDatabase() throws Exception {
        throw new NullPointerException();
    }
    public void checkStatus() throws EducationException{
        throw new EducationException("Out of slot");
    }
}
