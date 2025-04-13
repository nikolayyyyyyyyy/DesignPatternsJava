package decorator_bridge.interfaces;
import decorator_bridge.models.Page;

import java.math.BigDecimal;
import java.util.Set;

public interface Book {

    public BigDecimal getPrice();
    public String getResume();
    public Set<Page> getPages();
}
