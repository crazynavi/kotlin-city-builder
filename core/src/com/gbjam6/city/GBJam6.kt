package com.gbjam6.city

import com.badlogic.gdx.Screen
import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.audio.Music
import com.gbjam6.city.states.*
import com.tanjent.tanjentxm.Player
import ktx.app.KtxGame

/**
 * Main class.
 */
class GBJam6() : KtxGame<Screen>() {

    val manager = AssetManager()
    val player = Player(48000, Player.INTERPOLATION_MODE_CUBIC)
    var titleMusic: Int = 0
    var cityMusic1: Int = 0

    override fun create() {

        // Add the different states
        addScreen(Load(this))
        addScreen(TitleScreen(this))
        addScreen(City(this))
        addScreen(Tutorial(this))
        addScreen(Achievements(this))

        // Start loading screen
        setScreen<Load>()

    }

}
