package r5;

import java.util.regex.Pattern;
import u4.g;
import v5.C5685a;

/* JADX INFO: renamed from: r5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5531c extends AbstractC5532d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f227205a = Pattern.compile("(\\b(\\d*[.]?\\d+)\\b)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f227206b = Pattern.compile("(!|\\+|-|\\*|<|>|=|\\?|\\||:|%|&)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f227207c = Pattern.compile("(\\(|\\)|\\{|\\}|\\[|\\])");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f227208d = Pattern.compile("(?<=\\b)((break)|(continue)|(else)|(for)|(function)|(if)|(in)|(new)|(this)|(var)|(while)|(return)|(case)|(catch)|(of)|(typeof)|(const)|(default)|(do)|(switch)|(try)|(null)|(true)|(false)|(eval)|(let))(?=\\b)");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f227209e = Pattern.compile("(?<=(function) )(\\w+)", 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f227210f = Pattern.compile("\"(.*?)\"|'(.*?)'");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f227211g = Pattern.compile("/\\*(?:.|[\\n\\r])*?\\*/|//.*");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final char[] f227212h = {'{', '[', '(', '}', ']', ')'};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f227213i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f227214j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f227215k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f227216l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f227217m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String[] f227218n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String[] f227219o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String[] f227220p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String[] f227221q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String[] f227222r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String[] f227223s;

    static {
        String[] strArr = {"defineBlock", "defineLiquidBlock", "getAllBlockIds", "getDestroyTime", "getFriction", "setShape", "getRenderType", "getTextureCoords", "setColor", "setDestroyTime", "setExplosionResistance", "setFriction", "setRedstoneConsumer", "setLightLevel", "setLightOpacity", "setRenderLayer", "setRenderType"};
        f227213i = strArr;
        String[] strArr2 = {"getAll", "getAnimalAge", "getArmor", "getArmorCustomName", "getArmorDamage", "getEntityTypeId", "getExtraData", "getHealth", "getItemEntityCount", "getItemEntityData", "getItemEntityId", "getMaxHealth", "getMobSkin", "getNameTag", "getPitch()", "getRenderType", "getRider", "getRiding", "getTarget", "getUniqueId", "getVelX()", "getVelY()", "getVelZ()", "getYaw()", "isSneaking()", "remove", "removeAllEffects", "removeEffect", "rideAnimal", "setArmor", "setArmorCustomName", "setCape", "setCollisionSize", "setExtraData", "setFireTicks", "setHealth", "setImmobile", "setMaxHealth", "setMobSkin", "setNameTag", "setPosition", "setPositionRelative", "setCarriedItem", "setRenderType", "setRot", "setSneaking", "setTarget", "setVelX", "setVelY", "setVelZ", "spawnMob", "addEffect"};
        f227214j = strArr2;
        String[] strArr3 = {"getMaxDamage", "getMaxStackSize", "defineArmor", "defineThrowable", "getCustomThrowableRenderType", "addCraftRecipe", "setMaxDamage", "addFurnaceRecipe", "getName", "getTextureCoords", "getUseAnimation", "internalNameToId", "isValidItem", "setCategory", "setEnchantType", "addShapedRecipe", "setHandEquipped", "setProperties", "setStackedByData", "setUseAnimation", "translatedNameToId"};
        f227215k = strArr3;
        String[] strArr4 = {"biomeIdToName", "canSeeSky", "setSpawnerTypeId", "destroyBlock", "explode", "getAddress", "getBiome", "getBiomeName", "getBrightness", "getGameMode", "getGrassColor", "getDifficulty", "setDifficulty", "getTile", "getData", "getTime", "getWorldDir()", "getWorldName", "setGameMode", "setGrassColor", "getLightningLevel()", "getRainLevel()", "setNightMode", "setSpawn", "setTile", "setTime", "spawnMob", "getSignText", "setSignText", "addParticle", "playSound", "playSoundEnt", "setBlockExtraData", "dropItem", "getChestSlot", "getChestSlotCount", "getChestSlotData", "setChestSlot", "setChestSlotCustomName", "setSpawnerEntityType", "setLightningLevel", "setRainLevel", "getFurnaceSlot", "getFurnaceSlotCount", "getFurnaceSlotData", "setFurnaceSlot"};
        f227216l = strArr4;
        String[] strArr5 = {"getOS()", "dumpVtable", "getI18n", "getBytesFromTexturePack", "getLanguage", "getMinecraftVersion", "langEdit", "openInputStreamFromTexturePack", "overrideTexture", "readData", "removeData", g.f239522O, "resetFov", "resetImages", "setFoodItem", "setFov", "setGameSpeed", "setItem", "showTipMessage", "setUiRenderDebug", "takeScreenshot", "setGuiBlocks", "setItems", "setTerrain", "selectLevel"};
        f227217m = strArr5;
        String[] strArr6 = {"addExp", "addItemInventory", "addItemCreativeInv", "canFly()", "clearInventorySlot", "enchant", "getEnchantments", "getArmorSlot", "getArmorSlotDamage", "getCarriedItemCount", "getCarriedItemData", "getDimension", "getEntity", "getExhaustion", "getExp", "getHunger", "getInventorySlot", "getInventorySlotCount", "getInventorySlotData", "getItemCustomName", "setInventorySlot", "getLevel", "setLevel", "setSaturation", "setSelectedSlotId", "setItemCustomName", "getName", "getPointedBlockId()", "getPointedBlockData()", "getPointedBlockSide()", "getPointedBlockX()", "getPointedBlockY()", "getPointedBlockZ()", "getPointedEntity()", "getPointedVecX()", "getPointedVecY()", "getPointedVecZ()", "getSaturation", "getScore", "getSelectedSlotId()", "isFlying()", "setCanFly", "setFlying", "setArmorSlot", "setExhaustion", "setExp", "setHunger", "isPlayer()"};
        f227218n = strArr6;
        String[] strArr7 = {"getAllPlayerNames()", "getAllPlayers()", "getPort()", "joinServer", "sendChat"};
        f227219o = strArr7;
        String[] strArr8 = {"useItem", "newLevel", "procCmd", "selectLevelHook", "attackHook", "modTick", "eatHook", "explodeHook", "deathHook", "entityAddedHook", "entityRemovedHook", "entityHurtHook", "projectileHitEntityHook", "playerAddExpHook", "playerExpLevelChangeHook", "redstoneUpdateHook", "startDestroyBlock", "continueDestroyBlock", "blockEventHook", "levelEventHook", "serverMessageReceiveHook", "screenChangeHook", "chatReceiveHook", "chatHook"};
        f227220p = strArr8;
        String[] strArr9 = {"function"};
        f227221q = strArr9;
        String[] strArr10 = {"clientMessage", "getPlayerX()", "getPlayerY()", "getPlayerZ()", "getPlayerEnt()"};
        f227222r = strArr10;
        f227223s = (String[]) C5685a.a(String.class, strArr, strArr2, strArr3, strArr4, strArr10, strArr5, strArr6, strArr7, strArr8, strArr9);
    }

    @Override // r5.AbstractC5532d
    public final String[] a() {
        return f227223s;
    }

    @Override // r5.AbstractC5532d
    public final char[] b() {
        return f227212h;
    }

    @Override // r5.AbstractC5532d
    public final Pattern c() {
        return f227207c;
    }

    @Override // r5.AbstractC5532d
    public final Pattern d() {
        return f227211g;
    }

    @Override // r5.AbstractC5532d
    public final Pattern e() {
        return f227208d;
    }

    @Override // r5.AbstractC5532d
    public final Pattern f() {
        return f227209e;
    }

    @Override // r5.AbstractC5532d
    public final Pattern g() {
        return f227205a;
    }

    @Override // r5.AbstractC5532d
    public final Pattern h() {
        return f227210f;
    }

    @Override // r5.AbstractC5532d
    public final Pattern i() {
        return f227206b;
    }
}
