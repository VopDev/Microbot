package net.runelite.client.plugins.microbot.hunterrumours.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.runelite.api.gameval.ItemID;
import net.runelite.api.NpcID;




@Getter
@RequiredArgsConstructor
@SuppressWarnings("deprecation") // NpcID is deprecated but still used in the Hunter Rumours plugin
public enum Creatures {

    TROPICAL_WAGTAIL(NpcID.TROPICAL_WAGTAIL, "Tropical Wagtail", ItemID.HG_TAILFEATHER, Trap.SNARE),
	WILD_KEBBIT(NpcID.WILD_KEBBIT, "Wild Kebbit", ItemID.HG_KEBBITTUFT, Trap.DEADFALL),
	SAPPHIRE_GLACIALIS(NpcID.SAPPHIRE_GLACIALIS, "Sapphire Glacialis", ItemID.HG_BUTTERFLYWING_BLUE, Trap.BUTTERFLY),

	SWAMP_LIZARD(NpcID.SWAMP_LIZARD, "Swamp Lizard", ItemID.HG_LIZARDCLAW, Trap.NET_TRAP),
	SPINED_LARUPIA(NpcID.SPINED_LARUPIA, "Spined Larupia", ItemID.HG_LARUPIA_EAR, Trap.NOOSE),
	BARB_TAILED_KEBBIT(NpcID.BARBTAILED_KEBBIT, "Barb-tailed Kebbit", ItemID.HG_KEBBITTUFT, Trap.DEADFALL),
	SNOWY_KNIGHT(NpcID.SNOWY_KNIGHT, "Snowy Knight", ItemID.HG_BUTTERFLYWING_WHITE, Trap.BUTTERFLY),
	PRICKLY_KEBBIT(NpcID.PRICKLY_KEBBIT, "Prickly Kebbit", ItemID.HG_KEBBITTUFT, Trap.DEADFALL),

	EMBERTAILED_JERBOA(NpcID.EMBERTAILED_JERBOA, "Embertailed Jerboa", ItemID.HG_JERBOATAIL_LARGE, Trap.BOX_TRAP), 
	HORNED_GRAAHK(NpcID.HORNED_GRAAHK, "Horned Graahk", ItemID.HG_GRAAHK_HORN, Trap.NOOSE),
	SPOTTED_KEBBIT(NpcID.SPOTTED_KEBBIT, "Spotted Kebbit", ItemID.HG_KEBBITTUFT, Trap.DEADFALL),
	BLACK_WARLOCK(NpcID.BLACK_WARLOCK, "Black Warlock", ItemID.HG_BUTTERFLYWING_BLACK, Trap.BUTTERFLY),

	ORANGE_SALAMANDER(NpcID.ORANGE_SALAMANDER, "Orange Salamander", ItemID.HG_LIZARDCLAW_ORANGE, Trap.NET_TRAP),
	RAZOR_BACKED_KEBBIT(NpcID.KEBBIT, "Razor-backed Kebbit", ItemID.HG_KEBBITTUFT, Trap.DEADFALL), 
	SABRE_TOOTHED_KEBBIT(NpcID.SABRETOOTHED_KEBBIT, "Sabre-toothed Kebbit", ItemID.HG_KEBBITTUFT, Trap.DEADFALL),
	GREY_CHINCHOMPA(NpcID.CHINCHOMPA, "Grey Chinchompa", ItemID.HG_CHINCHOMPATUFT, Trap.BOX_TRAP),
	SABRE_TOOTHED_KYATT(NpcID.SABRETOOTHED_KYATT, "Sabre-toothed Kyatt", ItemID.HG_KYATTTOOTH, Trap.DEADFALL),
	DARK_KEBBIT(NpcID.DARK_KEBBIT, "Dark Kebbit", ItemID.HG_KEBBITTUFT, Trap.FALCONRY),
	PYRE_FOX(NpcID.PYRE_FOX, "Pyre Fox", ItemID.HG_FOXFLUFF, Trap.DEADFALL),
	RED_SALAMANDER(NpcID.RED_SALAMANDER, "Red Salamander", ItemID.HG_LIZARDCLAW_RED, Trap.NET_TRAP),
	RED_CHINCHOMPA(NpcID.CARNIVOROUS_CHINCHOMPA, "Carnivorous Chinchompa", ItemID.HG_CHINCHOMPATUFT_RED, Trap.BOX_TRAP),
	RED_CHINCHOMPA_2(NpcID.CARNIVOROUS_CHINCHOMPA, "Red Chinchompa", ItemID.HG_CHINCHOMPATUFT_RED, Trap.BOX_TRAP), 
	SUNLIGHT_MOTH(NpcID.SUNLIGHT_MOTH, "Sunlight Moth", ItemID.HG_MOTHWING_SUN, Trap.BUTTERFLY),
	DASHING_KEBBIT(NpcID.DASHING_KEBBIT, "Dashing Kebbit", ItemID.HG_KEBBITTUFT, Trap.FALCONRY),
	SUNLIGHT_ANTELOPE(NpcID.SUNLIGHT_ANTELOPE, "Sunlight Antelope", ItemID.HG_ANTELOPEHOOF_SUN, Trap.DEADFALL),
	MOONLIGHT_MOTH(NpcID.MOONLIGHT_MOTH, "Moonlight Moth", ItemID.HG_MOTHWING_MOON, Trap.BUTTERFLY),
	TECU_SALAMANDER(NpcID.TECU_SALAMANDER, "Tecu Salamander", ItemID.HG_LIZARDCLAW_MOUNTAIN, Trap.NET_TRAP),
	HERBIBOAR(NpcID.HERBIBOAR, "Herbiboar", ItemID.HG_HERBYTUFT, Trap.NOOSE_HERBIBOAR),
	MOONLIGHT_ANTELOPE(NpcID.MOONLIGHT_ANTELOPE, "Moonlight Antelope", ItemID.HG_ANTELOPEHOOF_MOON, Trap.DEADFALL),;
	
	@Getter
	private final int rumourNpcId;
	@Getter
	private final String rumourNpcName;
	@Getter
	private final int rareItemId;
	@Getter
	private final Trap trapType;

}
