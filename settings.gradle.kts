rootProject.name = "worldedit"

include("worldedit-libs")

listOf("fabric", "cli").forEach {
    include("worldedit-libs:$it")
    include("worldedit-$it")
}
include("worldedit-libs:core:ap")

include("worldedit-core:doctools")
