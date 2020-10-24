package pl.sda.calculator.numbers;

public class NumbersDTO { /*klasa opakowująca dane miedzy appka a klientem(przegladarka,postman)DTO data transfer object*/
    private String numbers;

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }
}
