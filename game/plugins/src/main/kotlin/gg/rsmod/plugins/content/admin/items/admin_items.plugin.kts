package gg.rsmod.plugins.content.admin.items

val items = intArrayOf(
        Items.ROTTEN_POTATO,
        Items.FIREWORK,
        Items.HOLIDAY_TOOL,
        Items.ROTTEN_EGG,
        Items.ROTTEN_CABBAGE,
        Items.ROTTEN_CARROT,
        Items.ROTTEN_STRAWBERRY,
        Items.WARHAMMER,
        Items.HALBERD,
        Items.POISONED_DAGGERP
)

items.forEach { item ->
    can_drop_item(item) {
        return@can_drop_item false
    }
}