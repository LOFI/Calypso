package com.theomn.calypso.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.theomn.calypso.BdxApp;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Calypso";
		config.width = 800;
		config.height = 450;
		new LwjglApplication(new BdxApp(), config);
	}
}
