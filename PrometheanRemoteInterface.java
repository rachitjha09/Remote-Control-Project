public interface PrometheanRemoteInterface {
    void powerOn();
    int moveUp(int amount);
    int moveDown(int amount);
    boolean freeze();
    int handleErrors(int errorId);
    void reset();
}
