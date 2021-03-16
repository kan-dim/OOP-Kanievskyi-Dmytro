public class Mail extends Web{

    public Mail(String path, String data) {
        super(path, data);
    }

    @Override
    public final void getType() {
        super.getType();
        System.out.println(": please download the desktop version");
    }
}