public class LazyHolder {
    private static class Holder {
        private static LazyHolder instance = new LazyHolder();
    }
    private LazyHolder() {}

    public static LazyHolder getInstance() {
        return Holder.instance;
    }
}
