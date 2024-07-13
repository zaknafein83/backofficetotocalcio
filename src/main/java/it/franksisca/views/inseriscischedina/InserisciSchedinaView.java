package it.franksisca.views.inseriscischedina;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.listbox.MultiSelectListBox;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import it.franksisca.components.avataritem.AvatarItem;
import java.util.List;

@PageTitle("Inserisci Schedina")
@Menu(icon = "line-awesome/svg/pencil-ruler-solid.svg", order = 3)
@Route(value = "my-view")
public class InserisciSchedinaView extends Composite<VerticalLayout> {

    public InserisciSchedinaView() {
        FormLayout formLayout2Col = new FormLayout();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        H1 h1 = new H1();
        HorizontalLayout layoutRow = new HorizontalLayout();
        Paragraph textMedium = new Paragraph();
        Paragraph textMedium2 = new Paragraph();
        Paragraph textMedium3 = new Paragraph();
        Paragraph textMedium4 = new Paragraph();
        Paragraph textMedium5 = new Paragraph();
        Button buttonPrimary = new Button();
        MultiSelectListBox avatarItems = new MultiSelectListBox();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        formLayout2Col.setWidth("100%");
        layoutColumn2.setHeightFull();
        formLayout2Col.setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        h1.setText("Heading");
        h1.setWidth("max-content");
        layoutRow.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        textMedium.setText("N.");
        textMedium.setWidth("max-content");
        textMedium.getStyle().set("font-size", "var(--lumo-font-size-m)");
        textMedium2.setText("Incontro");
        textMedium2.getStyle().set("flex-grow", "1");
        textMedium2.getStyle().set("font-size", "var(--lumo-font-size-m)");
        textMedium3.setText("1");
        layoutRow.setAlignSelf(FlexComponent.Alignment.CENTER, textMedium3);
        textMedium3.setWidth("max-content");
        textMedium3.getStyle().set("font-size", "var(--lumo-font-size-m)");
        textMedium4.setText("2");
        textMedium4.setWidth("max-content");
        textMedium4.getStyle().set("font-size", "var(--lumo-font-size-m)");
        textMedium5.setText("3");
        textMedium5.setWidth("max-content");
        textMedium5.getStyle().set("font-size", "var(--lumo-font-size-m)");
        buttonPrimary.setText("Salva Schedina");
        layoutColumn2.setAlignSelf(FlexComponent.Alignment.END, buttonPrimary);
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        avatarItems.setWidth("min-content");
        setAvatarItemsSampleData(avatarItems);
        getContent().add(formLayout2Col);
        formLayout2Col.add(layoutColumn2);
        layoutColumn2.add(h1);
        layoutColumn2.add(layoutRow);
        layoutRow.add(textMedium);
        layoutRow.add(textMedium2);
        layoutRow.add(textMedium3);
        layoutRow.add(textMedium4);
        layoutRow.add(textMedium5);
        layoutColumn2.add(buttonPrimary);
        formLayout2Col.add(avatarItems);
    }

    private void setAvatarItemsSampleData(MultiSelectListBox multiSelectListBox) {
        record Person(String name, String profession) {
        }
        ;
        List<Person> data = List.of(new Person("Aria Bailey", "Endocrinologist"), new Person("Aaliyah Butler", "Nephrologist"), new Person("Eleanor Price", "Ophthalmologist"), new Person("Allison Torres", "Allergist"), new Person("Madeline Lewis", "Gastroenterologist"));
        multiSelectListBox.setItems(data);
        multiSelectListBox.setRenderer(new ComponentRenderer(item -> {
            AvatarItem avatarItem = new AvatarItem();
            avatarItem.setHeading(((Person) item).name);
            avatarItem.setDescription(((Person) item).profession);
            avatarItem.setAvatar(new Avatar(((Person) item).name));
            return avatarItem;
        }));
    }
}
