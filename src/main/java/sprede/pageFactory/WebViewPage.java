package sprede.pageFactory;

import com.jcabi.aspects.Loggable;
import sprede.automation.framework.TestSession;

@Loggable
public class WebViewPage extends Page {

    public WebViewPage(TestSession session, String pageYamlFile) throws Exception {
        super(session, pageYamlFile);
    }

    @Override
    public Boolean isDisplayed() throws Exception {
        try {
            element(pageUI.expectedElements().get(0).name);
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException(this.getClass().getName() + "does not have any expected elements defined in page spec");
        }
        return super.isDisplayed();
    }
}

