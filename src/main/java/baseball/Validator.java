package baseball;

import java.util.HashSet;
import java.util.Set;

public class Validator {

    private static final int VALID_INPUT_LENGTH = 3;
    String input;

    Validator(String input) {
        this.input = input;
    }

    void isLengthThree() {
        if (input.length() != VALID_INPUT_LENGTH) {
            throw new IllegalArgumentException("3자리의 숫자를 입력해주세요(ex. 123)");
        }
    }

    void isAllNumber() {
        for (int i = 0; i < input.length(); i++) {
            char value = input.charAt(i);
            if (!Character.isDigit(value)) {
                throw new IllegalArgumentException("3자리의 숫자를 입력해주세요(ex. 123)");
            }
        }
    }

    void notContainsZero() {
        if (input.contains("0")) {
            throw new IllegalArgumentException("1부터 9까지의 숫자를 입력해주세요(ex. 159)");
        }
    }

    void isAllDifferent() {
        Set<Integer> inputSet = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            int value = (int) input.charAt(i);
            inputSet.add(value);
        }
        if (inputSet.size() != input.length()) {
            throw new IllegalArgumentException("서로 다른 3자리의 숫자를 입력해주세요(ex. 123)");
        }
    }

    void isOneOrTwo() {
        if (!(input.equals("1") || input.equals("2"))) {
            throw new IllegalArgumentException("시작하려면 1, 종료하려면 2 둘 중 하나를 입력해주세요");
        }
    }
}
