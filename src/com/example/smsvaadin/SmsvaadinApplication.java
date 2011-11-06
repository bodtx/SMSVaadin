package com.example.smsvaadin;

import sms.view.Windowsms;

import com.vaadin.Application;
import com.vaadin.ui.*;

public class SmsvaadinApplication extends Application {
	@Override
	public void init() {
		Window mainWindow = new Window("Smsvaadin Application");
//		VerticalLayout vert = new VerticalLayout();
//        vert.setEnabled(true);
		Windowsms win = new Windowsms();
		win.setHeight("100%");
		win.setSizeFull();
		//vert.addComponent(win);
		mainWindow.addComponent(win);
		mainWindow.setSizeFull();
		setMainWindow(mainWindow);
		
	}

}
