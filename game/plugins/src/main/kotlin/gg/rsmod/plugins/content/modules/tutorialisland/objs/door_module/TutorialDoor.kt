package gg.rsmod.plugins.content.modules.tutorialisland.objs.door_module

import gg.rsmod.game.model.Tile

class TutorialDoor {
    private var obj: Int = -1
    private var replaceObj: Int = -1
    private var replaceRot: Int = 1
    private var doorTile: Tile = Tile(0,0,0)
    private var requiredVarpState: Int = -1
    private var targetTile: Tile = Tile(0,0,0)
    private var afterActionVarpState: Int = -1

    fun setObj(obj: Int) {
        this.obj = obj
    }

    fun setReplacementObj(obj: Int) {
        this.replaceObj = obj
    }

    fun setReplacementRot(rot: Int) {
        this.replaceRot = rot
    }

    fun setDoorTile(tile: Tile) {
        this.doorTile = tile
    }

    fun setRequiredVarpState(state: Int) {
        this.requiredVarpState = state
    }

    fun setTargetTile(tile: Tile) {
        this.targetTile = tile
    }

    fun setAfterActionVarpState(state: Int) {
        this.afterActionVarpState = state
    }

    fun getObj(): Int { return this.obj }
    fun getReplaceObj(): Int { return this.replaceObj }
    fun getReplaceRot(): Int { return this.replaceRot }
    fun getDoorTile(): Tile { return this.doorTile }
    fun getRequiredVarpState(): Int { return this.requiredVarpState }
    fun getTargetTile(): Tile { return this.targetTile }
    fun getAfterActionVarpState(): Int { return this.afterActionVarpState }
}