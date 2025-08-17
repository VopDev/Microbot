package net.runelite.client.plugins.microbot.hunterrumours.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.ItemID;

@AllArgsConstructor
public enum Trap {
    SNARE("Bird Snare", ItemID.BIRD_SNARE),
    DEADFALL("Deadfall", ItemID.KNIFE),
    NET_TRAP("Net Trap", ItemID.SMALL_FISHING_NET),
    PIT("Pitfall", ItemID.TEASING_STICK),
    BOX_TRAP("Box Trap", ItemID.BOX_TRAP),
    FALCONRY("Falconry", ItemID.COINS),
    BUTTERFLY("Butterfly Net", ItemID.BUTTERFLY_NET),
    NOOSE("Tracking", ItemID.NOOSE_WAND),
    NOOSE_HERBIBOAR("Tracking (Herb)", ItemID.NOOSE_WAND);

    @Getter
    private final String Name;

    @Getter
    private final int ItemId;


}