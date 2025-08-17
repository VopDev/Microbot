package net.runelite.client.plugins.microbot.hunterrumours;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigInformation;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.plugins.microbot.hunterrumours.enums.FurPouch;
import net.runelite.client.plugins.microbot.hunterrumours.enums.MeatPouch;

@ConfigGroup("main-config")
@ConfigInformation("<h3>vHunterRumours</h3>\n" +
        "<p>1. <strong>Start the bot near the hunters guild.</strong>.</p>\n" +
        "<p>2. <strong>Alpha Version: 0.0.1</p>\n")

public interface HunterRumoursConfig extends Config {
@ConfigSection(
            name = "General",
            description = "General settings",
            position = 1
    )
    String generalSection = "general";

    @ConfigSection(
            name = "Food Options",
            description = "Settings for managing food",
            position = 2
    )
    String foodSection = "food";

    @ConfigSection(
            name = "Dev Tools",
            description = "Dev tools for debugging",
            position = 3,
            closedByDefault = true
    )
    String devSection = "dev";


    @ConfigItem(
            keyName = "UseMeatPouch",
            name = "Use meat pouch?",
            description = "Do you have a meat pouch?",
            section = generalSection
    )
    default boolean UseMeatPouch()
    {
        return true;
    }

    @ConfigItem(
            keyName = "MeatPouch",
            name = "Meat pouch",
            description = "Which meat pouch should the script use?",
            section = generalSection
    )
    default MeatPouch MeatPouch()
    {
        return MeatPouch.SMALL_MEAT_POUCH;
    }

    @ConfigItem(
            keyName = "UseMeatPouch",
            name = "Use meat pouch?",
            description = "Do you have a meat pouch?",
            section = generalSection
    )
    default boolean UseFurPouch()
    {
        return true;
    }

    @ConfigItem(
            keyName = "FurPouch",
            name = "Fur pouch",
            description = "Which fur pouch should the script use?",
            section = generalSection
    )
    default FurPouch FurPouch()
    {
        return FurPouch.SMALL_FUR_POUCH;
    }





}

