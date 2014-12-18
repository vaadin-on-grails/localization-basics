package app

import com.vaadin.server.VaadinRequest
import com.vaadin.ui.Label
import com.vaadin.ui.UI
import com.vaadin.ui.VerticalLayout

import static com.vaadin.grails.Grails.i18n
import static java.util.Locale.ENGLISH

class MyUI extends UI {

    @Override
    protected void init(VaadinRequest r) {

        VerticalLayout layout = new VerticalLayout()
        layout.setMargin(true)

        String label = i18n("default.home.label")
        layout.addComponent(new Label(label))

        String homeEng = i18n("default.home.label", ENGLISH)
        layout.addComponent(new Label(homeEng))

        Object[] newItemArgs = ["Proper label to be shown"]
        String newItem = i18n("default.home.label", newItemArgs)
        layout.addComponent(new Label(newItem))

        String newItemEng = i18n("default.home.label", newItemArgs, ENGLISH)
        layout.addComponent(new Label(newItemEng))

        String newItemEngDef = i18n("do.not.exist", newItemArgs, "Default label for {0}", ENGLISH)
        layout.addComponent(new Label(newItemEngDef))

        setContent(layout)
    }
}
