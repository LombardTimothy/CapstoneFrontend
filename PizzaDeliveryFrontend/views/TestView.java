package za.ac.cput.PizzaDeliveryFrontend.views;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("/test") // map view to the root
public class TestView extends VerticalLayout {
    private Text t;
    TestView(){
        t = new Text("Biscuits");
        add(t);
    }

}
