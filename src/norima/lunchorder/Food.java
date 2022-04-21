package norima.lunchorder;

import java.math.BigDecimal;

public class Food {
    private BigDecimal price;
    private BigDecimal fat;
    private BigDecimal carbs;
    private BigDecimal fiber;

    public Food(double price, double fat, double carbs, double fiber) {
        this.price = BigDecimal.valueOf(price);
        this.fat = BigDecimal.valueOf(fat);
        this.carbs = BigDecimal.valueOf(carbs);
        this.fiber = BigDecimal.valueOf(fiber);
    }

    public BigDecimal getCarbs() {
        return carbs;
    }

    public BigDecimal getFat() {
        return fat;
    }

    public BigDecimal getFiber() {
        return fiber;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
