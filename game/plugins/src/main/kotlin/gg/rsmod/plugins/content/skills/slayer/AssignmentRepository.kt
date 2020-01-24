package gg.rsmod.plugins.content.skills.slayer

import gg.rsmod.game.model.Tile
import gg.rsmod.plugins.content.skills.slayer.SlayerAssignment.Companion.assignment

object AssignmentRepository {

    val assignments = listOf(

            assignment(name = "Banshees", location = Tile(1, 1), levelReq = 15,combatReq = 20, master = AssignmentMaster.TURAEL, amount = 15..20) {
                mob { "Banshee" }
                mob { "Twisted banshee" }
            },

            assignment(name = "Bats", location = Tile(1, 1), levelReq = 1,combatReq = 1, master = AssignmentMaster.TURAEL, amount = 15..20) {
                mob { "Bat" }
                mob { "Giant bat" }
                mob { "Deathwing" }
            },
            assignment(name = "Bears", location = Tile(1, 1), levelReq = 1,combatReq = 13, master = AssignmentMaster.TURAEL, amount = 15..20) {
                mob { "Callisto" }
                mob { "Bear" }
                mob { "Bear cub" }
                mob { "Grizzly Bear" }
                mob { "Grizzly bear cub" }

            },
            assignment(name = "Cave bugss", location = Tile(1, 1), levelReq = 7,combatReq = 1, master = AssignmentMaster.TURAEL, amount = 10..20) {
                mob { "Cave bug" }

            },
            assignment(name = "Bats", location = Tile(1, 1), levelReq = 1,combatReq = 5, master = AssignmentMaster.MAZCHNA, amount = 40..70) {
                mob { "Bat" }
                mob { "Giant bat" }
                mob { "Deathwing" }
            },
            assignment(name = "Bears", location = Tile(1, 1), levelReq = 1,combatReq = 13, master = AssignmentMaster.MAZCHNA, amount = 40..70) {
                mob { "Callisto" }
                mob { "Bear" }
                mob { "Bear cub" }
                mob { "Grizzly Bear" }
                mob { "Grizzly bear cub" }

            },
            assignment(name = "Catablepons", location = Tile(1, 1), levelReq = 1,combatReq = 35, master = AssignmentMaster.MAZCHNA, amount = 20..30) {
                mob { "Catablepon" }
            },
            assignment(name = "Cave bugss", location = Tile(1, 1), levelReq = 7,combatReq = 1, master = AssignmentMaster.MAZCHNA, amount = 10..20) {
                mob { "Cave bug" }

            },
            assignment(name = "Cave crawlers", location = Tile(1, 1), levelReq = 10,combatReq = 10, master = AssignmentMaster.MAZCHNA, amount = 40..70) {
                mob { "Cave crawle" }

            },
            assignment(name = "Cave slimes", location = Tile(1, 1), levelReq = 17,combatReq = 15, master = AssignmentMaster.MAZCHNA, amount = 40..70) {
                mob { "Cave slime" }

            },
            assignment(name = "Cockatrices", location = Tile(1, 1), levelReq = 25,combatReq = 25, master = AssignmentMaster.MAZCHNA, amount = 40..70) {
                mob { "Cockatrice" }

            },
            assignment(name = "Crawling hands", location = Tile(1, 1), levelReq = 5,combatReq = 1, master = AssignmentMaster.MAZCHNA, amount = 40..70) {
                mob { "Crawling hand" }
                mob { "Crushing hand" }

            },
            assignment(name = "Lizards", location = Tile(1, 1), levelReq = 22,combatReq = 1, master = AssignmentMaster.MAZCHNA, amount = 40..70) {
                mob { "Lizard" }
                mob { "Small Lizard" }
                mob { "Desert Lizard" }
                mob { "Sulphur Lizard" }
            },
            assignment(name = "Dogs", location = Tile(1, 1), levelReq = 1,combatReq = 15, master = AssignmentMaster.MAZCHNA, amount = 40..70) {
                mob { "Guard dog" }
                mob { "Wild dog" }
                mob { "Jackal" }

            },
            assignment(name = "Earth warriors", location = Tile(1, 1), levelReq = 1,combatReq = 35, master = AssignmentMaster.MAZCHNA, amount = 40..70) {
                mob { "Earth warrior" }

            },
            assignment(name = "Flesh crawlers", location = Tile(1, 1), levelReq = 1,combatReq = 15, master = AssignmentMaster.MAZCHNA, amount = 15..25) {
                mob { "Flesh crawler" }

            },
            assignment(name = "Ghosts", location = Tile(1, 1), levelReq = 1,combatReq = 13, master = AssignmentMaster.MAZCHNA, amount = 40..70) {
                mob { "Ghost" }

            },
            assignment(name = "Ghouls", location = Tile(1, 1), levelReq = 1,combatReq = 1, master = AssignmentMaster.MAZCHNA, amount = 10..20) {
                mob { "Ghoul" }

            },
            assignment(name = "Hill giants", location = Tile(1, 1), levelReq = 1,combatReq = 25, master = AssignmentMaster.MAZCHNA, amount = 40..70) {
                mob { "Hill giant" }

            },
            assignment(name = "Hobgoblins", location = Tile(1, 1), levelReq = 1,combatReq = 20, master = AssignmentMaster.MAZCHNA, amount = 40..70) {
                mob { "Hobgoblin" }

            },
            assignment(name = "Ice warriors", location = Tile(1, 1), levelReq = 1,combatReq = 45, master = AssignmentMaster.MAZCHNA, amount = 40..70) {
                mob { "Ice warrior" }

            },
            assignment(name = "Kalphites", location = Tile(1, 1), levelReq = 1,combatReq = 15, master = AssignmentMaster.MAZCHNA, amount = 40..70) {
                mob { "Kalphite queen" }
                mob { "Kalphite worker" }
                mob { "Kalphite sueen" }
                mob { "Kalphite gueen" }

            },
            assignment(name = "Killerwatts", location = Tile(1, 1), levelReq = 37,combatReq = 50, master = AssignmentMaster.MAZCHNA, amount = 30..80) {
                mob { "Killerwatt" }

            },
            assignment(name = "Mogres", location = Tile(1, 1), levelReq = 32,combatReq = 30, master = AssignmentMaster.MAZCHNA, amount = 40..70) {
                mob { "Mogre" }

            },
            assignment(name = "Pyrefiends", location = Tile(1, 1), levelReq = 30,combatReq = 25, master = AssignmentMaster.MAZCHNA, amount = 40..70) {
                mob { "Pyrefiend" }

            },
            assignment(name = "Rockslugs", location = Tile(1, 1), levelReq = 20,combatReq = 20, master = AssignmentMaster.MAZCHNA, amount = 40..70) {
                mob { "Rockslug" }

            },
            assignment(name = "Scorpions", location = Tile(1, 1), levelReq = 1,combatReq = 1, master = AssignmentMaster.MAZCHNA, amount = 40..70) {
                mob { "King scorpion" }
                mob { "Poison scorpion" }
                mob { "Pit scorpion" }
                mob { "Grave scorpion" }

            },
            assignment(name = "Shades", location = Tile(1, 1), levelReq = 1,combatReq = 1, master = AssignmentMaster.MAZCHNA, amount = 40..70) {
                mob { "Shade" }

            },
            assignment(name = "Skeletons", location = Tile(1, 1), levelReq = 1,combatReq = 1, master = AssignmentMaster.MAZCHNA, amount = 40..70) {
                mob { "Skeleton" }

            },
            assignment(name = "Vampyres", location = Tile(1, 1), levelReq = 1,combatReq = 1, master = AssignmentMaster.MAZCHNA, amount = 10..20) {
                mob { "Vampyre juvenile" }
                mob { "Vampyre juvinate" }
                mob { "Feral vampyre" }
                mob { "Vyrewatch" }


            },
            assignment(name = "Wall beasts", location = Tile(1, 1), levelReq = 35,combatReq = 30, master = AssignmentMaster.MAZCHNA, amount = 10..20) {
                mob { "Wall beast" }

            },
            assignment(name = "Wolfs", location = Tile(1, 1), levelReq = 1,combatReq = 1, master = AssignmentMaster.MAZCHNA, amount = 40..70) {
                mob { "Wolf" }
                mob { "Big wolf" }
                mob { "Ice wolf" }
                mob { "Dire wolf" }
                mob { "Desert wolf" }

            },
            assignment(name = "Zombies", location = Tile(1, 1), levelReq = 1,combatReq = 1, master = AssignmentMaster.MAZCHNA, amount = 40..70) {
                mob { "Zombie" }

            },
            assignment(name = "Aberrant spectres", location = Tile(1, 1), levelReq = 60,combatReq = 65, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Aberrant spectre" }
                mob { "Deviant spectre" }
                mob { "Abhorrent spectre" }

            },
            assignment(name = "Abyssal demons", location = Tile(1, 1), levelReq = 85,combatReq = 85, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Abyssal demon" }
                mob { "Abyssal sire" }
                mob { "Greater abyssal demon" }

            },
            assignment(name = "Ankous", location = Tile(1, 1), levelReq = 1,combatReq = 1, master = AssignmentMaster.VANNAKA, amount = 25..35) {
                mob { "Ankou" }

            },
            assignment(name = "Banshees", location = Tile(1, 1), levelReq = 15,combatReq = 20, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Banshee" }
                mob { "Twisted banshee" }
                mob { "Screaming banshee" }

            },
            assignment(name = "Basilisks", location = Tile(1, 1), levelReq = 40,combatReq = 40, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Basilisk" }

            },
            assignment(name = "Bloodvelds", location = Tile(1, 1), levelReq = 50,combatReq = 50, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Bloodveld" }
                mob { "Mutated loodveld" }
                mob { "Insatible bloodveld" }

            },
            assignment(name = "Blue dragons", location = Tile(1, 1), levelReq = 1,combatReq = 65, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Blue dragon" }
                mob { "Baby blue dragon" }
                mob { "Vorkath" }
            },
            assignment(name = "Brine rats", location = Tile(1, 1), levelReq = 47,combatReq = 45, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Brine rat" }

            },
            assignment(name = "Brone dragons", location = Tile(1, 1), levelReq = 1,combatReq = 75, master = AssignmentMaster.VANNAKA, amount = 10..20) {
                mob { "Brone dragon" }

            },
            assignment(name = "Cave bugs", location = Tile(1, 1), levelReq = 7,combatReq = 1, master = AssignmentMaster.VANNAKA, amount = 10..20) {
                mob { "Cave bug" }

            },
            assignment(name = "Cave crawlerss", location = Tile(1, 1), levelReq = 10,combatReq = 10, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Cave crawlers" }

            },
            assignment(name = "Cave slimes", location = Tile(1, 1), levelReq = 17,combatReq = 15, master = AssignmentMaster.VANNAKA, amount = 10..20) {
                mob { "Cave slime" }

            },
            assignment(name = "Cocaktrices", location = Tile(1, 1), levelReq = 25,combatReq = 25, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Cocaktrice" }

            },
            assignment(name = "Crawling hands", location = Tile(1, 1), levelReq = 5,combatReq = 1, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Crawling hand" }
                mob { "Crushing hand" }

            },
            assignment(name = "Crocodiles", location = Tile(1, 1), levelReq = 1,combatReq = 50, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Crocodile" }

            },
            assignment(name = "Dagannoths", location = Tile(1, 1), levelReq = 1,combatReq = 75, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Dagannoth" }
                mob { "Dagannoth rex" }
                mob { "Dagannoth prime" }
                mob { "Dagannoth supreme" }

            },
            assignment(name = "Dust devils", location = Tile(1, 1), levelReq = 65,combatReq = 70, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Dust devil" }
                mob { "Choke devil" }

            },
            assignment(name = "Earth warriors", location = Tile(1, 1), levelReq = 1,combatReq = 35, master = AssignmentMaster.VANNAKA, amount = 40..80) {
                mob { "Earth warrior" }

            },
            assignment(name = "Elves", location = Tile(1, 1), levelReq = 1,combatReq = 70, master = AssignmentMaster.VANNAKA, amount = 40..100) {
                mob { "Elf warrior" }

            },
            assignment(name = "Fever spiders", location = Tile(1, 1), levelReq = 42,combatReq = 40, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Fever spider" }

            },
            assignment(name = "Fire giants", location = Tile(1, 1), levelReq = 1,combatReq = 65, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Fire giant" }

            },
            assignment(name = "Gargoyles", location = Tile(1, 1), levelReq = 75,combatReq = 80 ,master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Gargoyles" }
                mob { "Marble gargoyles" }
                mob { "Dusk" }
                mob { "Dawn" }
            },
            assignment(name = "Ghouls", location = Tile(1, 1), levelReq = 1,combatReq = 25, master = AssignmentMaster.VANNAKA, amount = 10..40) {
                mob { "Ghoul" }

            },
            assignment(name = "Green dragons", location = Tile(1, 1), levelReq = 1,combatReq = 52, master = AssignmentMaster.VANNAKA, amount = 40..80) {
                mob { "Green dragon" }

            },
            assignment(name = "Harpie bug swarms", location = Tile(1, 1), levelReq = 33,combatReq = 45, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Harpie bug swarm" }

            },
            assignment(name = "Hellhounds", location = Tile(1, 1), levelReq = 1,combatReq = 75, master = AssignmentMaster.VANNAKA, amount = 40..80) {
                mob { "Hellhound" }
                mob { "Cerberus" }

            },
            assignment(name = "Hill giants", location = Tile(1, 1), levelReq = 1,combatReq = 25, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Hill giant" }
                mob { "Obor" }
            },
            assignment(name = "Hobgoblins", location = Tile(1, 1), levelReq = 1,combatReq = 20, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Hobgoblin" }

            },
            assignment(name = "Ice giants", location = Tile(1, 1), levelReq = 1,combatReq = 50, master = AssignmentMaster.VANNAKA, amount = 40..80) {
                mob { "Ice giant" }

            },
            assignment(name = "Ice warriors", location = Tile(1, 1), levelReq = 1,combatReq = 45, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Ice warrior" }

            },
            assignment(name = "Infernal mages", location = Tile(1, 1), levelReq = 45,combatReq = 40, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Infernal mage" }
                mob { "Malevolent mage" }
            },
            assignment(name = "Jellys", location = Tile(1, 1), levelReq = 52,combatReq = 57, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Jelly" }

            },
            assignment(name = "Jungle horrors", location = Tile(1, 1), levelReq = 1,combatReq = 65, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Jungle horror" }

            },
            assignment(name = "Kalphites", location = Tile(1, 1), levelReq = 1,combatReq = 15, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Kalphite queen" }
                mob { "Kalphite worker" }
                mob { "Kalphite guardian" }
                mob { "Kalphite soldier" }
            },
            assignment(name = "Killerwatts", location = Tile(1, 1), levelReq = 37,combatReq = 50, master = AssignmentMaster.VANNAKA, amount = 30..80) {
                mob { "Killerwatts" }

            },
            assignment(name = "Kurasks", location = Tile(1, 1), levelReq = 70,combatReq = 65, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Kurask" }
                mob { "King kurask" }

            },
            assignment(name = "Lizards", location = Tile(1, 1), levelReq = 22,combatReq = 1, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Lizard" }

            },
            assignment(name = "Lesser demons", location = Tile(1, 1), levelReq = 1,combatReq = 1, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Lesser demons" }

            },
            assignment(name = "Mogres", location = Tile(1, 1), levelReq = 32,combatReq = 30, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Mogre" }

            },
            assignment(name = "Molanisks", location = Tile(1, 1), levelReq = 39,combatReq = 50, master = AssignmentMaster.VANNAKA, amount = 39..50) {
                mob { "Molanisk" }

            },
            assignment(name = "Moss giants", location = Tile(1, 1), levelReq = 1,combatReq = 40, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Moss giant" }
                mob { "Bryophyta" }

            },
            assignment(name = "Nechryaels", location = Tile(1, 1), levelReq = 80,combatReq = 85, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Nechryael" }
                mob { "Great nechryael" }

            },
            assignment(name = "Ogres", location = Tile(1, 1), levelReq = 1,combatReq = 40, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Ogre" }

            },
            assignment(name = "Otherwordly beings", location = Tile(1, 1), levelReq = 1,combatReq = 40, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Otherwordly being" }

            },
            assignment(name = "Pyrefiends", location = Tile(1, 1), levelReq = 30,combatReq = 25, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Pyrefiends" }

            },
            assignment(name = "Rockslugs", location = Tile(1, 1), levelReq = 20,combatReq = 20, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Rockslug" }

            },
            assignment(name = "Shades", location = Tile(1, 1), levelReq = 1,combatReq = 30, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Shade" }

            },
            assignment(name = "Sea snakes", location = Tile(1, 1), levelReq = 40,combatReq = 50, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Sea snake" }

            },
            assignment(name = "Shadow warriors", location = Tile(1, 1), levelReq = 60,combatReq = 60, master = AssignmentMaster.VANNAKA, amount = 40..80) {
                mob { "Shadow warrior" }

            },
            assignment(name = "Spiritual creatures", location = Tile(1, 1), levelReq = 60,combatReq = 60, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Spiritual mage" }
                mob { "Spiritual ranger" }
                mob { "Spiritual warrior" }
            },
            assignment(name = "Terror dogs", location = Tile(1, 1), levelReq = 40,combatReq = 60, master = AssignmentMaster.VANNAKA, amount = 20..45) {
                mob { "Terror dog" }

            },
            assignment(name = "Trolls", location = Tile(1, 1), levelReq = 1,combatReq = 60, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Troll" }
                mob { "Ice troll" }
                mob { "Mountain troll" }
            },
            assignment(name = "Turoths", location = Tile(1, 1), levelReq = 55,combatReq = 60, master = AssignmentMaster.VANNAKA, amount = 60..120) {
                mob { "Turoth" }

            },
            assignment(name = "Vampyres", location = Tile(1, 1), levelReq = 1,combatReq = 35, master = AssignmentMaster.VANNAKA, amount = 10..20) {
                mob { "Vampyre juvenile" }
                mob { "Vampyre juvinate" }
                mob { "Feral vampyre" }
                mob { "Vyrewatch" }

            },
            assignment(name = "Wall beasts", location = Tile(1, 1), levelReq = 35,combatReq = 30, master = AssignmentMaster.VANNAKA, amount = 10..20) {
                mob { "Wall beast" }

            },
            assignment(name = "Werewolfs", location = Tile(1, 1), levelReq = 1,combatReq = 60, master = AssignmentMaster.VANNAKA, amount = 40..80) {
                mob { "Werewolf" }

            },
            assignment(name = "Aberrant spectres", location = Tile(1, 1), levelReq = 60,combatReq = 65, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Aberrant spectre" }
                mob { "Deviant spectre" }
                mob { "Abhorrent spectre" }
            },
            assignment(name = "Abyssal demons", location = Tile(1, 1), levelReq = 85,combatReq = 85, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Abyssal demons" }
                mob { "Greater abyssal demons" }

            },
            assignment(name = "Aviansies", location = Tile(1, 1), levelReq = 1,combatReq = 1, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Aviansie" }

            },
            assignment(name = "Banshees", location = Tile(1, 1), levelReq = 15,combatReq = 20, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Banshee" }
                mob { "Twisted banshee" }
                mob { "Screaming banshee" }

            },
            assignment(name = "Basilisks", location = Tile(1, 1), levelReq = 40,combatReq = 40, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Basilisk" }

            },
            assignment(name = "Black demons", location = Tile(1, 1), levelReq = 1,combatReq = 80, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Black demon" }
                mob { "Skotizo" }
                mob { "Demonic gorilla" }
                mob { "Balfrug Kreeyath" }

            },assignment(name = "Bloodvelds", location = Tile(1, 1), levelReq = 50,combatReq = 50, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
        mob { "Bloodveld" }
        mob { "Mutated bloodveld" }
        mob { "Insatiable Bloodveld" }
    },
            assignment(name = "Blue dragons", location = Tile(1, 1), levelReq = 1,combatReq = 65, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Blue dragon" }
                mob { "Baby blue dragons" }
            },
            assignment(name = "Brine rats", location = Tile(1, 1), levelReq = 47,combatReq = 45, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Brine rat" }

            },
            assignment(name = "Bronze dragons", location = Tile(1, 1), levelReq = 1,combatReq = 75, master = AssignmentMaster.CHAELDAR, amount = 10..20) {
                mob { "Bronze dragon" }

            },
            assignment(name = "Cave crawlers", location = Tile(1, 1), levelReq = 10,combatReq = 10, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Cave crawler" }

            },
            assignment(name = "Cave horrors", location = Tile(1, 1), levelReq = 58,combatReq = 85, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Cave horror" }

            },
            assignment(name = "Cave krakens", location = Tile(1, 1), levelReq = 87,combatReq = 80, master = AssignmentMaster.CHAELDAR, amount = 30..50) {
                mob { "Cave kraken" }
                mob { "Kraken" }
            },
            assignment(name = "Cave slimes", location = Tile(1, 1), levelReq = 17,combatReq = 15, master = AssignmentMaster.CHAELDAR, amount = 10..20) {
                mob { "Cave slime" }

            },
            assignment(name = "Cockatrices", location = Tile(1, 1), levelReq = 25,combatReq = 25, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Cockatrice" }

            },
            assignment(name = "Dagannoths", location = Tile(1, 1), levelReq = 1,combatReq = 75, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Dagannoth" }
                mob { "Dagannoth rex" }
                mob { "Dagannoth prime" }
                mob { "Dagannoth sueen" }

            },
            assignment(name = "Dust devils", location = Tile(1, 1), levelReq = 65,combatReq = 70, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Dust devil" }
                mob { "Choke devil" }
            },
            assignment(name = "Elves", location = Tile(1, 1), levelReq = 60,combatReq = 70, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Elf warrior" }

            },
            assignment(name = "Fever spiders", location = Tile(1, 1), levelReq = 32,combatReq = 40, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Fever spider" }

            },
            assignment(name = "Fire giants", location = Tile(1, 1), levelReq = 1,combatReq = 65, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Fire giant" }

            },
            assignment(name = "Fossil island wyverns", location = Tile(1, 1), levelReq = 66,combatReq = 60, master = AssignmentMaster.CHAELDAR, amount = 10..20) {
                mob { "Ancient wyvern" }
                mob { "Long-tailed wyvern" }
                mob { "Spitting wyvern" }
                mob { "Taloned wyvern" }

            },
            assignment(name = "Gargoyless", location = Tile(1, 1), levelReq = 75,combatReq = 80, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Gargoyles" }
                mob { "Marble gargoyles" }
                mob { "Dusk" }
                mob { "Dawn" }
            },
            assignment(name = "Greater demons", location = Tile(1, 1), levelReq = 1,combatReq = 75, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Greater demon" }
                mob { "K'ril tsutsaroth" }
                mob { "Skotizo" }
                mob { "Tstanon karlak" }
            },
            assignment(name = "Harpie bug swarms", location = Tile(1, 1), levelReq = 33,combatReq = 45, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Harpie bug swarms" }

            },
            assignment(name = "Hellhounds", location = Tile(1, 1), levelReq = 1,combatReq = 75, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Hellhound" }
                mob { "Cerberus" }
            },
            assignment(name = "Infernal mages", location = Tile(1, 1), levelReq = 45,combatReq = 50, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Infernal mage" }
                mob { "Malevolent mage" }
            },
            assignment(name = "Iron dragons", location = Tile(1, 1), levelReq = 1,combatReq = 80, master = AssignmentMaster.CHAELDAR, amount = 25..45) {
                mob { "Iron dragons" }

            },
            assignment(name = "Jellies", location = Tile(1, 1), levelReq = 52,combatReq = 57, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Jelly" }

            },
            assignment(name = "Jungle horrors", location = Tile(1, 1), levelReq = 1,combatReq = 65, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Jungle horrors" }

            },
            assignment(name = "Kalphites", location = Tile(1, 1), levelReq = 1,combatReq = 15, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Kalphites queen" }
                mob { "Kalphites worker" }
                mob { "Kalphites guardian" }
                mob { "Kalphites soldier" }
            },
            assignment(name = "Kurasks", location = Tile(1, 1), levelReq = 70,combatReq = 65, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Kurask" }
                mob { "King kurasks" }
            },
            assignment(name = "Lesser demons", location = Tile(1, 1), levelReq = 1,combatReq = 60, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Lesser demon" }

            },
            assignment(name = "Lizardmans", location = Tile(1, 1), levelReq = 1,combatReq = 1, master = AssignmentMaster.CHAELDAR, amount = 70..90) {
                mob { "Lizardman" }
                mob { "Lizardman shaman" }
            },
            assignment(name = "Lizards", location = Tile(1, 1), levelReq = 22,combatReq = 1, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Lizard" }

            },
            assignment(name = "Mogres", location = Tile(1, 1), levelReq = 32,combatReq = 30, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Mogre" }

            },
            assignment(name = "Molanisks", location = Tile(1, 1), levelReq = 39,combatReq = 50, master = AssignmentMaster.CHAELDAR, amount = 39..50) {
                mob { "Molanisk" }

            },
            assignment(name = "Mutated zygomites", location = Tile(1, 1), levelReq = 57,combatReq = 60, master = AssignmentMaster.CHAELDAR, amount = 8..15) {
                mob { "Mutated zygomite" }

            },
            assignment(name = "Nechryaels", location = Tile(1, 1), levelReq = 80,combatReq = 85, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Nechryael" }
                mob { "Greater nechryael" }
            },
            assignment(name = "Pyrefiends", location = Tile(1, 1), levelReq = 30,combatReq = 25, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Pyrefiend" }

            },
            assignment(name = "Rockslugs", location = Tile(1, 1), levelReq = 20,combatReq = 20, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Rockslug" }

            },
            assignment(name = "Shadow warriors", location = Tile(1, 1), levelReq = 1,combatReq = 60, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Shadow warrior" }

            },
            assignment(name = "Skeletal wyverns", location = Tile(1, 1), levelReq = 72,combatReq = 70, master = AssignmentMaster.CHAELDAR, amount = 10..20) {
                mob { "Skeletal wyvern" }

            },
            assignment(name = "Spiritual creaturess", location = Tile(1, 1), levelReq = 63,combatReq = 60, master = AssignmentMaster.CHAELDAR, amount = 10..20) {
                mob { "Spiritual mage" }
                mob { "Spiritual ranger" }
                mob { "Spiritual warrior" }

            },
            assignment(name = "Steel dragons", location = Tile(1, 1), levelReq = 1,combatReq = 85, master = AssignmentMaster.CHAELDAR, amount = 10..20) {
                mob { "Steel dragon" }

            },
            assignment(name = "Trolls", location = Tile(1, 1), levelReq = 1,combatReq = 60, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Troll" }
                mob { "Ice troll" }
                mob { "Mountain troll" }
            },
            assignment(name = "Turoths", location = Tile(1, 1), levelReq = 55,combatReq = 60, master = AssignmentMaster.CHAELDAR, amount = 110..170) {
                mob { "Turoth" }

            },
            assignment(name = "TzHaars", location = Tile(1, 1), levelReq = 1,combatReq = 1, master = AssignmentMaster.CHAELDAR, amount = 90..150) {
                mob { "TzHaar-ket" }
                mob { "TzHaar-xil" }
                mob { "TzHaar-mej" }
                mob { "TzHaar-hur" }
            },
            assignment(name = "Wall beasts", location = Tile(1, 1), levelReq = 35,combatReq = 30, master = AssignmentMaster.CHAELDAR, amount = 10..20) {
                mob { "Wall beasts" }

            },
            assignment(name = "Wyrms", location = Tile(1, 1), levelReq = 62,combatReq = 1, master = AssignmentMaster.CHAELDAR, amount = 60..120) {
                mob { "Wyrm" }

            },
            assignment(name = "Aberrant spectres", location = Tile(1, 1), levelReq = 60,combatReq = 65, master = AssignmentMaster.NIEVE, amount = 120..185) {
                mob { "Aberrant spectre" }
                mob { "Deviant spectre" }
                mob { "Abhorrent spectre" }

            },
            assignment(name = "Abyssal demons", location = Tile(1, 1), levelReq = 85,combatReq = 85, master = AssignmentMaster.NIEVE, amount = 120..185) {
                mob { "Abyssal demon" }
                mob { "Greater abyssal demon" }
            },
            assignment(name = "Adamant dragons", location = Tile(1, 1), levelReq = 1,combatReq = 1, master = AssignmentMaster.NIEVE, amount = 3..7) {
                mob { "Adamant dragon" }

            },
            assignment(name = "Ankous", location = Tile(1, 1), levelReq = 1,combatReq = 40, master = AssignmentMaster.NIEVE, amount = 50..90) {
                mob { "Ankou" }

            },
            assignment(name = "Aviansies", location = Tile(1, 1), levelReq = 1,combatReq = 1, master = AssignmentMaster.NIEVE, amount = 120..185) {
                mob { "Aviansie" }

            },
            assignment(name = "Black demon", location = Tile(1, 1), levelReq = 1,combatReq = 80, master = AssignmentMaster.NIEVE, amount = 120..185) {
                mob { "Black demon" }
                mob { "Skotizo" }
                mob { "Demonic gorilla" }
                mob { "Balfrug Kreeyath" }

            },
            assignment(name = "Black dragons", location = Tile(1, 1), levelReq = 1,combatReq = 80, master = AssignmentMaster.NIEVE, amount = 10..20) {
                mob { "Black dragon" }
                mob { "Baby black dragon" }
            },
            assignment(name = "Bloodvelds", location = Tile(1, 1), levelReq = 50,combatReq = 50, master = AssignmentMaster.NIEVE, amount = 120..185) {
                mob { "Bloodveld" }
                mob { "Insatible bloodveld" }
                mob { "Mutated bloodveld" }
            },
            assignment(name = "Blue dragons", location = Tile(1, 1), levelReq = 1,combatReq = 65, master = AssignmentMaster.NIEVE, amount = 120..185) {
                mob { "Blue dragon" }
                mob { "Baby blue dragon" }
            },
            assignment(name = "Brine rats", location = Tile(1, 1), levelReq = 47,combatReq = 45, master = AssignmentMaster.NIEVE, amount = 120..185) {
                mob { "Brine rat" }

            },
            assignment(name = "Cave horrors", location = Tile(1, 1), levelReq = 58,combatReq = 85, master = AssignmentMaster.NIEVE, amount = 120..185) {
                mob { "Cave horror" }

            },
            assignment(name = "Cave krakens", location = Tile(1, 1), levelReq = 87,combatReq = 80, master = AssignmentMaster.NIEVE, amount = 100..120) {
                mob { "Cave kraken" }
                mob { "Kraken" }
            },
            assignment(name = "Dagannoths", location = Tile(1, 1), levelReq = 1,combatReq = 75, master = AssignmentMaster.NIEVE, amount = 120..185) {
                mob { "Dagannoth" }
                mob { "Dagannoth rex" }
                mob { "Dagannoth prime" }
                mob { "Dagannoth supreme" }

            },
            assignment(name = "Dark beasts", location = Tile(1, 1), levelReq = 90,combatReq = 90, master = AssignmentMaster.NIEVE, amount = 10..20) {
                mob { "Dark beast" }
                mob { "Night beast" }
            },
            assignment(name = "Drakes", location = Tile(1, 1), levelReq = 84,combatReq = 1, master = AssignmentMaster.NIEVE, amount = 30..95) {
                mob { "Drake" }

            },
            assignment(name = "Dust devils", location = Tile(1, 1), levelReq = 65,combatReq = 70, master = AssignmentMaster.NIEVE, amount = 120..185) {
                mob { "Dust devil" }
                mob { "Choke devil" }
            },
            assignment(name = "Elfs", location = Tile(1, 1), levelReq = 1,combatReq = 70, master = AssignmentMaster.NIEVE, amount = 60..90) {
                mob { "Elf warrior" }

            },
            assignment(name = "Fire giants", location = Tile(1, 1), levelReq = 1,combatReq = 65, master = AssignmentMaster.NIEVE, amount = 120..185) {
                mob { "Fire giants" }

            },
            assignment(name = "Fossil island wyverns", location = Tile(1, 1), levelReq = 66,combatReq = 60, master = AssignmentMaster.NIEVE, amount = 20..60) {
                mob { "Ancient wyvern" }
                mob { "Long-tailed wyvern" }
                mob { "Spitting wyvern" }
                mob { "Taloned wyvern" }

            },
            assignment(name = "Gargoyles", location = Tile(1, 1), levelReq = 75,combatReq = 80, master = AssignmentMaster.NIEVE, amount = 120..185) {
                mob { "Gargoyles" }
                mob { "Marble gargoyles" }
            },
            assignment(name = "Greater demons", location = Tile(1, 1), levelReq = 1,combatReq = 75, master = AssignmentMaster.NIEVE, amount = 120..185) {
                mob { "Greater demon" }
                mob { "K'ril tsutsaroth" }
                mob { "Skotizo" }
                mob { "Tstanon karlak" }

            },
            assignment(name = "Hellhounds", location = Tile(1, 1), levelReq = 1,combatReq = 75, master = AssignmentMaster.NIEVE, amount = 120..185) {
                mob { "Hellhound" }
                mob { "Cerberus" }
            },
            assignment(name = "Iron dragons", location = Tile(1, 1), levelReq = 1,combatReq = 80, master = AssignmentMaster.NIEVE, amount = 30..60) {
                mob { "Iron dragon" }

            },
            assignment(name = "Kalphites", location = Tile(1, 1), levelReq = 1,combatReq = 15, master = AssignmentMaster.NIEVE, amount = 120..185) {
                mob { "Kalphite queen" }
                mob { "Kalphite worker" }
                mob { "Kalphite soldier" }
                mob { "Kalphite guardian" }
            },
            assignment(name = "Kurasks", location = Tile(1, 1), levelReq = 70,combatReq = 65, master = AssignmentMaster.NIEVE, amount = 120..185) {
                mob { "Kurask" }
                mob { "King kurask" }
            },
            assignment(name = "Lizardmans", location = Tile(1, 1), levelReq = 1,combatReq = 1, master = AssignmentMaster.NIEVE, amount = 120..185) {
                mob { "Lizardman" }
                mob { "Lizardman shaman" }
            },
            assignment(name = "Minions of Scabaras", location = Tile(1, 1), levelReq = 1,combatReq = 85, master = AssignmentMaster.NIEVE, amount = 30..60) {
                mob { "Scarab" }
                mob { "Scarab swarm" }
                mob { "Locust rider" }
                mob { "Scarab mage" }
                mob { "Giant scarab" }
            },
            assignment(name = "Mithril dragons", location = Tile(1, 1), levelReq = 1,combatReq = 1, master = AssignmentMaster.NIEVE, amount = 4..9) {
                mob { "Mithril dragon" }

            },
            assignment(name = "Mutated zygomites", location = Tile(1, 1), levelReq = 57,combatReq = 60, master = AssignmentMaster.NIEVE, amount = 10..25) {
                mob { "Mutated zygomite" }

            },
            assignment(name = "Nechryaels", location = Tile(1, 1), levelReq = 80,combatReq = 85, master = AssignmentMaster.NIEVE, amount = 110..170) {
                mob { "Nechryael" }
                mob { "Greater nechryael" }
            },
            assignment(name = "Red dragons", location = Tile(1, 1), levelReq = 1,combatReq = 68, master = AssignmentMaster.NIEVE, amount = 30..80) {
                mob { "Red dragon" }

            },
            assignment(name = "Rune dragons", location = Tile(1, 1), levelReq = 1,combatReq = 1, master = AssignmentMaster.NIEVE, amount = 3..6) {
                mob { "Rune dragon" }

            },
            assignment(name = "Skeletal wyverns", location = Tile(1, 1), levelReq = 72,combatReq = 70, master = AssignmentMaster.NIEVE, amount = 5..15) {
                mob { "Skeletal wyverns" }

            },
            assignment(name = "Smoke devils", location = Tile(1, 1), levelReq = 93,combatReq = 85, master = AssignmentMaster.NIEVE, amount = 120..185) {
                mob { "Smoke devils" }
                mob { "Thermonuclear smoke devils" }
            },
            assignment(name = "Spiritual creatures", location = Tile(1, 1), levelReq = 60,combatReq = 60, master = AssignmentMaster.NIEVE, amount = 120..185) {
                mob { "Spiritual mage" }
                mob { "Spiritual ranger" }
                mob { "Spiritual warrior" }

            },
            assignment(name = "Steel dragons", location = Tile(1, 1), levelReq = 1,combatReq = 85, master = AssignmentMaster.NIEVE, amount = 30..60) {
                mob { "Steel dragon" }

            },
            assignment(name = "Suqahs", location = Tile(1, 1), levelReq = 1,combatReq = 85, master = AssignmentMaster.NIEVE, amount = 120..185) {
                mob { "Suqah" }

            },
            assignment(name = "Trolls", location = Tile(1, 1), levelReq = 1,combatReq = 60, master = AssignmentMaster.NIEVE, amount = 120..185) {
                mob { "Troll" }
                mob { "Ice troll" }
                mob { "Mountain troll" }
            },
            assignment(name = "Turoths", location = Tile(1, 1), levelReq = 55,combatReq = 60, master = AssignmentMaster.NIEVE, amount = 120..185) {
                mob { "Turoth" }

            },
            assignment(name = "TzHaars", location = Tile(1, 1), levelReq = 1,combatReq = 1, master = AssignmentMaster.NIEVE, amount = 110..180) {
                mob { "TzHaar-ket" }
                mob { "TzHaar-xil" }
                mob { "TzHaar-mej" }
                mob { "TzHaar-hur" }

            },
            assignment(name = "Wyrms", location = Tile(1, 1), levelReq = 62,combatReq = 1, master = AssignmentMaster.NIEVE, amount = 80..145) {
                mob { "Wyrm" }

            },
            assignment(name = "Aberrant spectres", location = Tile(1, 1), levelReq = 60,combatReq = 65, master = AssignmentMaster.DURADEL, amount = 130..200) {
                mob { "Aberrant spectre" }
                mob { "Deviant spectre" }
                mob { "Abhorrent spectre" }

            },
            assignment(name = "Abyssal demons", location = Tile(1, 1), levelReq = 85,combatReq = 85, master = AssignmentMaster.DURADEL, amount = 130..200) {
                mob { "Greater abyssal demon" }

            },
            assignment(name = "Adamant dragons", location = Tile(1, 1), levelReq = 1,combatReq = 1, master = AssignmentMaster.DURADEL, amount = 4..9) {
                mob { "Adamant dragon" }

            },
            assignment(name = "Ankous", location = Tile(1, 1), levelReq = 1,combatReq = 40, master = AssignmentMaster.DURADEL, amount = 50..80) {
                mob { "Ankou" }

            },
            assignment(name = "Aviansies", location = Tile(1, 1), levelReq = 1,combatReq = 1, master = AssignmentMaster.DURADEL, amount = 120..200) {
                mob { "Aviansie" }

            },
            assignment(name = "Black demons", location = Tile(1, 1), levelReq = 1,combatReq = 80, master = AssignmentMaster.DURADEL, amount = 130..200) {
                mob { "Black demon" }
                mob { "Skotizo" }
                mob { "Demonic gorilla" }
                mob { "Balfrug Kreeyath" }

            },
            assignment(name = "Black dragons", location = Tile(1, 1), levelReq = 1,combatReq = 80, master = AssignmentMaster.DURADEL, amount = 10..20) {
                mob { "Black dragon" }
                mob { "Baby black dragon" }
            },
            assignment(name = "Bloodvelds", location = Tile(1, 1), levelReq = 50,combatReq = 50, master = AssignmentMaster.DURADEL, amount = 130..200) {
                mob { "Bloodveld" }
                mob { "Insatible bloodveld" }
                mob { "Mutated bloodveld" }
            },
            assignment(name = "Blue dragons", location = Tile(1, 1), levelReq = 1,combatReq = 65, master = AssignmentMaster.DURADEL, amount = 110..170) {
                mob { "Blue dragon" }
                mob { "Baby blue dragon" }
            },
            assignment(name = "Cave horrors", location = Tile(1, 1), levelReq = 58,combatReq = 85, master = AssignmentMaster.DURADEL, amount = 130..200) {
                mob { "Cave horror" }

            },
            assignment(name = "Cave krakens", location = Tile(1, 1), levelReq = 87,combatReq = 80, master = AssignmentMaster.DURADEL, amount = 130..200) {
                mob { "Cave kraken" }
                mob { "Kraken" }
            },
            assignment(name = "Dagannoths", location = Tile(1, 1), levelReq = 1,combatReq = 75, master = AssignmentMaster.DURADEL, amount = 130..200) {
                mob { "Dagannoth" }
                mob { "Dagannoth rex" }
                mob { "Dagannoth prime" }
                mob { "Dagannoth supreme" }
            },
            assignment(name = "Dark beasts", location = Tile(1, 1), levelReq = 90,combatReq = 90, master = AssignmentMaster.DURADEL, amount = 10..20) {
                mob { "Dark beast" }
                mob { "Night beast" }
            },
            assignment(name = "Drakes", location = Tile(1, 1), levelReq = 84,combatReq = 1, master = AssignmentMaster.DURADEL, amount = 50..155) {
                mob { "Drake" }

            },
            assignment(name = "Dust devils", location = Tile(1, 1), levelReq = 65,combatReq = 70, master = AssignmentMaster.DURADEL, amount = 130..200) {
                mob { "Dust devil" }
                mob { "Choke devil" }
            },
            assignment(name = "Elves", location = Tile(1, 1), levelReq = 1,combatReq = 70, master = AssignmentMaster.DURADEL, amount = 100..170) {
                mob { "Elf warrior" }

            },
            assignment(name = "Fire giants", location = Tile(1, 1), levelReq = 1,combatReq = 65, master = AssignmentMaster.DURADEL, amount = 130..200) {
                mob { "Fire giant" }

            },
            assignment(name = "Fossil island wyverns", location = Tile(1, 1), levelReq = 66,combatReq = 60, master = AssignmentMaster.DURADEL, amount = 20..60) {
                mob { "Ancient wyvern" }
                mob { "Long-tailed wyvern" }
                mob { "Spitting wyvern" }
                mob { "Taloned wyvern" }

            },
            assignment(name = "Gargoyles", location = Tile(1, 1), levelReq = 75,combatReq = 80, master = AssignmentMaster.DURADEL, amount = 130..200) {
                mob { "Gargoyle" }
                mob { "Marble argoyle" }
            },
            assignment(name = "Greater demons", location = Tile(1, 1), levelReq = 1,combatReq = 75, master = AssignmentMaster.DURADEL, amount = 130..200) {
                mob { "Greater demon" }
                mob { "K'ril tsutsaroth" }
                mob { "Skotizo" }
                mob { "Tstanon karlak" }

            },
            assignment(name = "Hellhounds", location = Tile(1, 1), levelReq = 1,combatReq = 75, master = AssignmentMaster.DURADEL, amount = 130..200) {
                mob { "Hellhound" }
                mob { "Cerberus" }
            },
            assignment(name = "Iron dragons", location = Tile(1, 1), levelReq = 1,combatReq = 80, master = AssignmentMaster.DURADEL, amount = 40..60) {
                mob { "Iron dragon" }

            },
            assignment(name = "Kalphites", location = Tile(1, 1), levelReq = 1,combatReq = 15, master = AssignmentMaster.DURADEL, amount = 130..200) {
                mob { "Kalphite queen" }
                mob { "Kalphite guardian" }
                mob { "Kalphite soldier" }
                mob { "Kalphite worker" }

            },
            assignment(name = "Kurasks", location = Tile(1, 1), levelReq = 70,combatReq = 65, master = AssignmentMaster.DURADEL, amount = 130..200) {
                mob { "Kurask" }

            },
            assignment(name = "Lizardmans", location = Tile(1, 1), levelReq = 1,combatReq = 1, master = AssignmentMaster.DURADEL, amount = 130..210) {
                mob { "Lizardman" }
                mob { "Lizardman shaman" }
            },
            assignment(name = "Mithril dragons", location = Tile(1, 1), levelReq = 1,combatReq = 1, master = AssignmentMaster.DURADEL, amount = 5..10) {
                mob { "Mithril dragon" }

            },
            assignment(name = "Mutated zygomites", location = Tile(1, 1), levelReq = 57,combatReq = 60, master = AssignmentMaster.DURADEL, amount = 20..30) {
                mob { "Mutated zygomite" }

            },
            assignment(name = "Nechryaels", location = Tile(1, 1), levelReq = 80,combatReq = 85, master = AssignmentMaster.DURADEL, amount = 130..250) {
                mob { "Nechryael" }
                mob { "Greater nechryael" }
            },
            assignment(name = "Red dragons", location = Tile(1, 1), levelReq = 1,combatReq = 68, master = AssignmentMaster.DURADEL, amount = 30..65) {
                mob { "Red dragon" }

            },
            assignment(name = "Rune dragons", location = Tile(1, 1), levelReq = 1,combatReq = 1, master = AssignmentMaster.DURADEL, amount = 3..8) {
                mob { "Rune dragon" }

            },
            assignment(name = "Skeletal wyverns", location = Tile(1, 1), levelReq = 72,combatReq = 70, master = AssignmentMaster.DURADEL, amount = 20..40) {
                mob { "Skeletal wyvern" }

            },
            assignment(name = "Smoke devils", location = Tile(1, 1), levelReq = 93,combatReq = 85, master = AssignmentMaster.DURADEL, amount = 130..200) {
                mob { "Smoke devil" }
                mob { "Thermonuclear smoke devil" }
            },
            assignment(name = "Spiritual creaturess", location = Tile(1, 1), levelReq = 60,combatReq = 60, master = AssignmentMaster.DURADEL, amount = 130..200) {
                mob { "Spiritual mage" }
                mob { "Spiritual ranger" }
                mob { "Spiritual warrior" }

            },
            assignment(name = "Steel dragons", location = Tile(1, 1), levelReq = 1,combatReq = 85, master = AssignmentMaster.DURADEL, amount = 10..20) {
                mob { "Steel dragon" }

            },
            assignment(name = "Suqahs", location = Tile(1, 1), levelReq = 1,combatReq = 85, master = AssignmentMaster.DURADEL, amount = 60..90) {
                mob { "Suqah" }

            },
            assignment(name = "Trolls", location = Tile(1, 1), levelReq = 1,combatReq = 60, master = AssignmentMaster.DURADEL, amount = 130..200) {
                mob { "Troll" }
                mob { "Ice troll" }
                mob { "Mountain troll" }
            },
            assignment(name = "TzHaars", location = Tile(1, 1), levelReq = 1,combatReq = 1, master = AssignmentMaster.DURADEL, amount = 130..199) {
                mob { "TzHaar-ket" }
                mob { "TzHaar-xil" }
                mob { "TzHaar-mej" }
                mob { "TzHaar-hur" }

            },
            assignment(name = "Waterfiends", location = Tile(1, 1), levelReq = 1,combatReq = 75, master = AssignmentMaster.DURADEL, amount = 130..200) {
                mob { "Waterfiend" }

            },
            assignment(name = "Wyrms", location = Tile(1, 1), levelReq = 62,combatReq = 1, master = AssignmentMaster.DURADEL, amount = 100..160) {
                mob { "Wyrm" }

            }
    )
}