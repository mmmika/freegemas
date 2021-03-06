package com.siondream.freegemas;

import android.os.Bundle;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class AndroidLauncher extends AndroidApplication {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Freegemas.setPlatformResolver(new AndroidResolver());

        AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();
        cfg.useGL30 = false;

        initialize(new Freegemas(), cfg);
    }
}
