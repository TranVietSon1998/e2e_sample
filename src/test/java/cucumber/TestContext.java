package cucumber;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class TestContext {
    private ScenarioContext scenarioContext;

    public TestContext(){
        scenarioContext = new ScenarioContext();
    }

}
