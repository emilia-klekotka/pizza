package pl.maciek.pizza_app.remote.rest.dto.request;

import pl.maciek.pizza_app.domain.model.SizeType;

import java.math.BigDecimal;

public class AddSizeDto {

    private SizeType size;
    private BigDecimal price;

    public AddSizeDto(SizeType size, BigDecimal price) {
        this.size = size;
        this.price = price;
    }

    public AddSizeDto() {
    }

    public SizeType getSize() {
        return size;
    }

    public void setSize(SizeType size) {
        this.size = size;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
