package cucumber;
import com.qa.models.Order;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ScenarioContext {
    private Order order;
    public ScenarioContext() {
        this.order = new Order();
    }
}
