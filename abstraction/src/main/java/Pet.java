public interface Pet {


    default void beFriendly() {
        System.out.println("Pets are harmless");
    }
    void play();
}
