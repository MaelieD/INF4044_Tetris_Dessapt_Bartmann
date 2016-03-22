package fr.esiea.architecture.movement;

/**
 * Created by Maélie on 22/03/2016.
 */
public enum Movement {
    DOWN('s') {
        @Override
        public void move(MovementValidator movementValidator, Movable movable) {
            movable.goDown(movementValidator);
        }
    },
    RIGHT('d') {
        @Override
        public void move(MovementValidator movementValidator, Movable movable) {
            movable.goRight(movementValidator);
        }
    },
    TURN_LEFT('e') {
        @Override
        public void move(MovementValidator movementValidator, Movable movable) {
            movable.turnLeft(movementValidator);
        }
    }, // ne marche pas
    NONE('*') {
        @Override
        public void move(MovementValidator movementValidator, Movable ignore) {}
    };

    private final char shortCut;

    Movement(char s) { // private : const enum forcement private --> pas necessaire
        this.shortCut = s;
    }

    public static Movement parseInput(int readValue) { // methode de parsing a changer
        for (Movement movement : Movement.values()) {
            if(movement.shortCut == readValue) {
                return movement;
            }
        }
        return NONE;
    }

    public abstract void move(MovementValidator movementValidator, Movable movable);
}
