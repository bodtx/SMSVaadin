package com.example.smsvaadin;

import com.vaadin.Application;
import com.vaadin.ui.*;

public class SmsvaadinApplication extends Application {
	@Override
	public void init() {
		Window mainWindow = new Window("Smsvaadin Application");
		Label label = new Label("Hello Vaadin user");
		mainWindow.addComponent(label);
		setMainWindow(mainWindow);
	}

}
