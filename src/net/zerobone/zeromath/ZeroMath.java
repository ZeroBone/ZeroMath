package net.zerobone.zeromath;

import java.util.Random;

public class ZeroMath {

    public static float max(final float a, final float b) {

        return a > b ? a : b;

    }

    public static float abs(float n) {

        return n < 0 ? -n : n;

    }

    public static float min(final float a, final float b) {

        return a > b ? b : a;

    }

    public static int randomNumber(int min, int max) {

        // return new Random().nextInt(max - min) + min;

        return (int)(min + Math.round((max - min) * Math.random()));

    }

    public static int randomNumberinIntRange() {

        Random random = new Random();

        int randomInt = random.nextInt();

        return random.nextBoolean() ? randomInt : -randomInt;

    }

    public static float pullValue(float value, float destination, float speed) {

        // speed must be always positive

        if (destination == value) {

            return value;

        }

        // example:
        // value = 5
        // destination = 4
        // speed = 3

        if (destination < value) {

            if (value > destination + speed) {

                return value - speed;

            }

            return destination;

        }


        // destination greater than value, need to increment

        if (value < destination - speed) {

            return value + speed;

        }

        return destination;

    }

    public static int longToInt(long value, int fallback) {

        if (value > Integer.MAX_VALUE || value < Integer.MIN_VALUE) {

            return fallback;

        }

        return (int)value;

    }

    public static float constrain(float value, float minimum, float maximum) {

        return ZeroMath.min(ZeroMath.max(value, minimum), maximum);

    }

}
