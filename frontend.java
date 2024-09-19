import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.textfield.TextField;

@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        TextField nameField = new TextField("Your name");
        Button greetButton = new Button("Greet");
        greetButton.addClickListener(e -> {
            greetButton.setText("Hello, " + nameField.getValue());
        });

        add(nameField, greetButton);
    }
}

