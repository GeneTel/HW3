class Cat extends Animal {
    private static final int MAX_RUN_DISTANCE = 200;

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println("Кіт пробіг " + distance + " м");
        } else {
            System.out.println("Кіт не може пробігти більше " + MAX_RUN_DISTANCE + " м");
        }
    }
}

