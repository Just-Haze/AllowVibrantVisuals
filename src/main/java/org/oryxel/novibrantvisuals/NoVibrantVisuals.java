package org.oryxel.novibrantvisuals;

import org.geysermc.event.subscribe.Subscribe;
import org.geysermc.geyser.api.event.bedrock.SessionLoadResourcePacksEvent;
import org.geysermc.geyser.api.extension.Extension;

public class NoVibrantVisuals implements Extension {
    @Subscribe
    public void onSessionLoadResourcePacks(SessionLoadResourcePacksEvent event) {
        event.allowVibrantVisuals(true);
    }
}
