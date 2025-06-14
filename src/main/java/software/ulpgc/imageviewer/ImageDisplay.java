package software.ulpgc.imageviewer;

public interface ImageDisplay {
    void on(Released released);
    void on(Shift shift);
    int getWidth();
    void paint(String id, int offset);
    void clear();

    interface Released{
        Released Null = offset -> {};
        void offset(int offset);
    }

    interface Shift{
        Shift Null = offset -> {};
        void offset(int offset);
    }
}
