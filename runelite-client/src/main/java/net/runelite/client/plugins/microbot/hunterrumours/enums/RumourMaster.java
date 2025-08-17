package net.runelite.client.plugins.microbot.hunterrumours.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum RumourMaster {
    NONE(0, "Unknown"),

    MASTER_WOLF(13126, "Wolf"),
    EXPERT_TECO(13125, "Teco"),
    EXPERT_ACO(13124, "Aco"),
    ADEPT_CERVUS(13123, "Cervus"),
    ADEPT_ORNUS(13122, "Ornus"),
    NOVICE_GILMAN(13121, "Gilman");

    @Getter
    public final int NpcId;

    @Getter
    public final String CommonName;



}