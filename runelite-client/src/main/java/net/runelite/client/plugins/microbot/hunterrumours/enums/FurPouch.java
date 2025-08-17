package net.runelite.client.plugins.microbot.hunterrumours.enums;

import lombok.Getter;
import net.runelite.api.gameval.ItemID;

public enum FurPouch
{
	SMALL_FUR_POUCH(ItemID.HG_FURPOUCH_SMALL, ItemID.HG_FURPOUCH_SMALL_OPEN),
	MEDIUM_FUR_POUCH(ItemID.HG_FURPOUCH_MED, ItemID.HG_FURPOUCH_MED_OPEN),
	LARGE_FUR_POUCH(ItemID.HG_FURPOUCH_LARGE, ItemID.HG_FURPOUCH_LARGE_OPEN);

	@Getter
	private final int closedItemID;

	@Getter
	private final int openItemID;

	FurPouch(int closedItemID, int openItemID)
	{
		this.openItemID = openItemID;
		this.closedItemID = closedItemID;
	}
}
