package sms.view;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.data.util.ObjectProperty;
import com.vaadin.event.FieldEvents.TextChangeEvent;
import com.vaadin.event.FieldEvents.TextChangeListener;
import com.vaadin.terminal.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class Windowsms extends CustomComponent {

	@AutoGenerated
	private VerticalLayout mainLayout;
	@AutoGenerated
	private HorizontalLayout horizontalLayout_1;
	@AutoGenerated
	private TextField textField_1;
	@AutoGenerated
	private Label label_2;
	@AutoGenerated
	private Button button_1;
	@AutoGenerated
	private Label label_1;
	@AutoGenerated
	private TextArea textArea_1;
	MyProperty property;


	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */


	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public Windowsms() {
		buildMainLayout();
		setCompositionRoot(mainLayout);
		setSizeFull();
		// TODO add user code here
//		  property = new MyProperty();
//		textArea_1.setImmediate(true);
//		label_1.setPropertyDataSource(property);
//		textArea_1.setPropertyDataSource(property);
		textArea_1.addListener(new TextChangeListener() {
			
			public void textChange(TextChangeEvent event) {
				label_1.setValue("nb de caract�res "+event.getText().length());
//				property.setValue(event.getText().length());
//				label_1.setStyleName("redLabel");
				if(event.getText().length()>140){
					label_1.setStyleName("redLabel");
					label_1.setValue("140 caract�res max");
					textArea_1.setValue(event.getText().substring(0,140));
				}
				else{
					label_1.setStyleName("blackLabel");
				}
				
				
			}
		});
		
		button_1.addListener(new ClickListener() {
			
			public void buttonClick(ClickEvent event) {
				Embedded embedded_1 = new Embedded();
				embedded_1.setImmediate(false);
				embedded_1.setSource(new ExternalResource(
						"http://zelkova.free.fr/gif/clint2.gif"));
				embedded_1.setType(1);
				embedded_1.setMimeType("image/png");
				embedded_1.setVisible(true);
				mainLayout.addComponent(embedded_1);
				
			}
		});
	}
	

	@AutoGenerated
	private VerticalLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new VerticalLayout();
		mainLayout.setImmediate(true);
		mainLayout.setWidth("100%");
		mainLayout.setHeight("100%");
		mainLayout.setMargin(true);
		mainLayout.setSpacing(true);
		
		// top-level component properties
		setWidth("100.0%");
		setHeight("100.0%");
		
		// textArea_1
		textArea_1 = new TextArea();
		textArea_1.setImmediate(false);
		textArea_1.setWidth("450px");
		textArea_1.setHeight("180px");
		mainLayout.addComponent(textArea_1);
		
		// label_1
		label_1 = new Label();
		label_1.setImmediate(false);
		label_1.setWidth("100.0%");
		label_1.setHeight("46px");
		label_1.setValue("Label");
		mainLayout.addComponent(label_1);
		
		// horizontalLayout_1
		horizontalLayout_1 = buildHorizontalLayout_1();
		mainLayout.addComponent(horizontalLayout_1);
		
		return mainLayout;
	}


	@AutoGenerated
	private HorizontalLayout buildHorizontalLayout_1() {
		// common part: create layout
		horizontalLayout_1 = new HorizontalLayout();
		horizontalLayout_1.setImmediate(false);
		horizontalLayout_1.setWidth("-1px");
		horizontalLayout_1.setHeight("100px");
		horizontalLayout_1.setMargin(true);
		horizontalLayout_1.setSpacing(true);
		
		// button_1
		button_1 = new Button();
		button_1.setCaption("Button Toto");
		button_1.setImmediate(true);
		button_1.setWidth("100px");
		button_1.setHeight("-1px");
		horizontalLayout_1.addComponent(button_1);
		
		// label_2
		label_2 = new Label();
		label_2.setImmediate(false);
		label_2.setWidth("-1px");
		label_2.setHeight("-1px");
		label_2.setValue("Num�ro");
		horizontalLayout_1.addComponent(label_2);
		
		// textField_1
		textField_1 = new TextField();
		textField_1.setImmediate(false);
		textField_1.setWidth("-1px");
		textField_1.setHeight("-1px");
		textField_1.setSecret(false);
		horizontalLayout_1.addComponent(textField_1);
		
		return horizontalLayout_1;
	}

}
