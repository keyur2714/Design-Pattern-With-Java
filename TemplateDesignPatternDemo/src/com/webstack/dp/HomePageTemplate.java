package com.webstack.dp;

public abstract class HomePageTemplate {

	public final void buildHomePage() {
		createHeaderPage();
		createLeftPanel();
		createMainPanel();
		createRightPanel();
		createFooterPage();
	}
	
	public abstract void createHeaderPage();
	public abstract void createLeftPanel();
	public abstract void createRightPanel();
	public abstract void createMainPanel();
	public abstract void createFooterPage();
	
}
