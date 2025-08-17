package net.runelite.client.plugins.microbot.hunterrumours;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigInformation;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.plugins.microbot.hunterrumours.enums.FurPouch;
import net.runelite.client.plugins.microbot.hunterrumours.enums.MeatPouch;
import net.runelite.client.plugins.microbot.hunterrumours.enums.RumourMaster;
import net.runelite.client.plugins.microbot.inventorysetups.InventorySetup;

@ConfigGroup("main-config")
@ConfigInformation("<h3>vHunterRumours</h3>\n" +
        "<p>1. <strong>Start the bot near the hunters guild.</strong>.</p>\n" +
        "<p>2. <strong>Alpha Version: 0.0.1</p>\n")

public interface HunterRumoursConfig extends Config {
                                                                                          // CONFIG SECTIONS
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
            name = "Equipment Options",
            description = "Equipment settings",
            position = 4,
            closedByDefault = true
    )
    String equipmentSection = "equipment";

                                                                                        // General Settings

   @ConfigItem(
            keyName = "RumourMaster",
            name = "Rumour Master",
            description = "Select which master you want to use.",
            section = generalSection
    )
    default RumourMaster RumourMaster() {
        return RumourMaster.NONE;
    }
                                                                                 
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


                                                                                        // Equipment Settings
    @ConfigItem(
            keyName = "BoxTrapping",
            name = "Box Trapping",
            description = "The InventorySetup to use when box trapping.",
            section = equipmentSection,
            position = 0
        )
        default InventorySetup BoxTrapping() {
           return null;
        }

        @ConfigItem(
                keyName = "Falconry",
                name = "Falconry",
                description = "The InventorySetup to use when doing falconry.",
                section = equipmentSection,
                position = 1
        )
        default InventorySetup Falconry() {
           return null;
        }

        @ConfigItem(
                keyName = "Butterfly",
                name = "Butterflies/Moths",
                description = "The InventorySetup to use when catching butterflies & moths.",
                section = equipmentSection,
                position = 2
        )
        default InventorySetup Butterfly() {
            return null;    
        }

        @ConfigItem(
                keyName = "NetTrapping",
                name = "Net Trapping",
                description = "The InventorySetup to use when net trapping.",
                section = equipmentSection,
                position = 3
        )
        default InventorySetup NetTrapping() {
            return null;
        }
        @ConfigItem(
                keyName = "DeadfallTrapping",
                name = "Deadfall Trapping",
                description = "The InventorySetup to use when deadfall trapping.",
                section = equipmentSection,
                position = 4
        )
        default InventorySetup DeadfallTrapping() {
            return null;
        }
        @ConfigItem(
                keyName = "Tracking",
                name = "Tracking",
                description = "The InventorySetup to use when tracking.",
                section = equipmentSection,
                position = 5
        )
        default InventorySetup Tracking() {
            return null;
        }
        @ConfigItem(
                keyName = "PitfallTrapping",
                name = "Pitfall Trapping",
                description = "The InventorySetup to use when hunting pitfall trapping.",
                section = equipmentSection,
                position = 6
        )
        default InventorySetup PitfallTrapping() {
            return null;
        }
         @ConfigItem(
                keyName = "Herbiboar",
                name = "Herbiboar",
                description = "The InventorySetup to use when hunting Herbiboar.",
                section = equipmentSection,
                position = 6
        )
        default InventorySetup Herbiboar() {
            return null;
        }


}

