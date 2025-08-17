package net.runelite.client.plugins.microbot.hunterrumours;

import com.google.inject.Provides;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.microbot.util.misc.TimeUtils;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;
import java.awt.*;
import java.time.Instant;
import net.runelite.client.plugins.microbot.hunterrumours.enums.Creatures;

@PluginDescriptor(
        name = "Hunter Rumours",
        description = "Hunter Rumours plugin for microbot",
        tags = {"hunter", "rumours", "microbot"},
        enabledByDefault = false
)
@Slf4j
public class HunterRumoursPlugin extends Plugin {
    @Inject
    private HunterRumoursConfig config;
    private Instant scriptStartTime;
    @Provides
    HunterRumoursConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(HunterRumoursConfig.class);
    }

    @Inject
    private OverlayManager overlayManager;
    @Inject
    private HunterRumoursOverlay rumoursOverlay;

    @Inject
    HunterRumoursScript rumoursScript;


    @Override
    protected void startUp() throws AWTException {
        rumoursScript.run(config);
        overlayManager.add(rumoursOverlay);
        scriptStartTime = Instant.now();
    }

    protected void shutDown() {
        rumoursScript.shutdown();
        overlayManager.remove(rumoursOverlay);
        scriptStartTime = null;
    }

    protected String getTimeRunning() {
        return scriptStartTime != null ? TimeUtils.getFormattedDurationBetween(scriptStartTime, Instant.now()) : "";
    }


    @Subscribe
	public void onChatMessage(ChatMessage event)
	{
		handleQuetzalWhistleChatMessage(event); // Handle the chat message to extract the creature name when checking whistle.
	}

    private String currentRumourCreatureName;

    public String getCurrentRumourCreatureName() {
        return currentRumourCreatureName;
    }

    private String rumourSource;

    public String getRumourSource() {
        return rumourSource;
    }

    private void handleQuetzalWhistleChatMessage(ChatMessage event) {
        String message = event.getMessage();
        if (event.getType() != ChatMessageType.GAMEMESSAGE) {
            return;
        }

        // Ensure that this is the right chat message
        if (!message.startsWith("Your current rumour target is a")) {
            return;
        }

        // Extract the creature name from the message
        String creatureName = message.substring(
            message.indexOf("is a") + 5, 
            message.indexOf(".")
        ).trim();

        // Match the creature name with the rumourNpcName in the Creatures enum
        for (Creatures creature : Creatures.values()) {
            if (creature.getRumourNpcName().equalsIgnoreCase(creatureName)) {
                currentRumourCreatureName = creature.getRumourNpcName();
                log.info("Rumour creature found: " + currentRumourCreatureName);
                break;
            }
        }

        // Extract the rumour source from the message
        // TODO: Rumour Extraction Logic
    }

 
    int ticks = 10;
    @Subscribe
    public void onGameTick(GameTick tick)
    {


        if (ticks > 0) {
            ticks--;
        } else {
            ticks = 10;
        }

    }

}
