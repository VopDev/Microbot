package net.runelite.client.plugins.microbot.hunterrumours;

import net.runelite.api.Client;
import net.runelite.api.Skill;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

import javax.inject.Inject;
import java.awt.*;

public class HunterRumoursOverlay extends OverlayPanel {
    private final Client client;
    private final HunterRumoursConfig config;
    private final HunterRumoursPlugin plugin;
    private final HunterRumoursScript script;
    private int startingLevel = 0;

    @Inject
    public HunterRumoursOverlay(Client client, HunterRumoursConfig config, HunterRumoursPlugin plugin, HunterRumoursScript script) {
        super(plugin);
        this.client = client;
        this.config = config;
        this.plugin = plugin;
        this.script = script;
        setPosition(OverlayPosition.TOP_LEFT);
        setNaughty();
    }

    @Override
    public Dimension render(Graphics2D graphics) {
        if (startingLevel == 0) {
            startingLevel = client.getRealSkillLevel(Skill.HUNTER);
        }

        panelComponent.getChildren().clear();
        panelComponent.setPreferredSize(new Dimension(200, 300));

        // Title with version
        panelComponent.getChildren().add(TitleComponent.builder()
                .text("Hunter Rumours by Vopori")
                .color(Color.YELLOW)
                .build());

        panelComponent.getChildren().add(LineComponent.builder().build());

        // Basic information
        panelComponent.getChildren().add(LineComponent.builder()
                .left("Running: ")
                .right(plugin.getTimeRunning())
                .leftColor(Color.WHITE)
                .rightColor(Color.WHITE)
                .build());

        panelComponent.getChildren().add(LineComponent.builder()
                .left("Hunter Level:")
                .right(startingLevel + "/" + client.getRealSkillLevel(Skill.HUNTER))
                .leftColor(Color.WHITE)
                .rightColor(Color.ORANGE)
                .build());
        
        panelComponent.getChildren().add(LineComponent.builder()
                .left("Current Rumour:")
                .right(plugin.getCurrentRumourCreatureName() != null ? plugin.getCurrentRumourCreatureName() : "Unknown")
                .leftColor(Color.WHITE)
                .rightColor(plugin.getCurrentRumourCreatureName() != null ? Color.GREEN : Color.RED)
                .build());
                
        panelComponent.getChildren().add(LineComponent.builder()
                .left("Rumour Source:")
                .right(plugin.getRumourSource() != null ? plugin.getRumourSource() : "Unknown")
                .leftColor(Color.WHITE)
                .rightColor(plugin.getRumourSource() != null ? Color.GREEN : Color.RED)
                .build());
       

        return super.render(graphics);
    }
}