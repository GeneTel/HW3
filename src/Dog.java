
    class Dog extends Animal {
        private static final int MAX_RUN_DISTANCE = 500;
        private static final int MAX_SWIM_DISTANCE = 10;

        @Override
        public void run(int distance) {
            if (distance <= MAX_RUN_DISTANCE) {
                System.out.println("Собака пробігла " + distance + " м");
            } else {
                System.out.println("Собака не може пробігти більше " + MAX_RUN_DISTANCE + " м");
            }
        }

        @Override
        public void swim(int distance) {
            if (distance <= MAX_SWIM_DISTANCE) {
                System.out.println("Собака пропливла " + distance + " м");
            } else {
                System.out.println("Собака не може пропливти більше " + MAX_SWIM_DISTANCE + " м");
            }
        }
    }

