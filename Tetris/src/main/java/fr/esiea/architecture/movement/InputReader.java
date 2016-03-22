package fr.esiea.architecture.movement;

import fr.esiea.architecture.thirdparty.RawConsoleInput;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maélie on 22/03/2016.
 */
public class InputReader { // package fini

    private static final int NO_MORE_DISPONIBLE_INPUT = -2;

    public List<Movement> getMovements() {
        List<Movement> result = new ArrayList<>();
        int readValue = 0;
        readValue = getReadValue();
        while(readValue != NO_MORE_DISPONIBLE_INPUT) {
            Movement movement = Movement.parseInput(readValue);
            result.add(movement);
            readValue = getReadValue();
        }
        return result;
    }

    int getReadValue() throws IOException {
        int readValue;
        try {
            readValue = RawConsoleInput.read(false);
        } catch (IOException e) {
            throw new RuntimeException("Impossible to read the input canal", e);
        }
        return readValue;
    }
}
