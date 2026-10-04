package r5;

import W0.j;
import W3.o;
import Z3.f;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.core.app.NotificationCompat;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.prism.fusionadsdk.internal.activity.WebViewInterstitialActivity;
import com.prism.gaia.download.j;
import com.prism.gaia.server.pm.C4182q;
import com.prism.lib.pfs.PfsFileProvider;
import java.util.regex.Pattern;
import kotlinx.coroutines.N;
import org.jacoco.core.runtime.AgentOptions;
import s0.x;
import u4.g;
import v5.C5685a;
import w7.i;

/* JADX INFO: renamed from: r5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5530b extends AbstractC5532d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f227185a = Pattern.compile("(\\b(\\d*[.]?\\d+)\\b)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f227186b = Pattern.compile("(!|\\+|-|\\*|=|\\?|\\||:|%|&)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f227187c = Pattern.compile("(\\(|\\)|\\{|\\}|\\[|\\])");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f227188d = Pattern.compile("(?<=\\b)((break)|(continue)|(else)|(for)|(function)|(if)|(in)|(new)|(this)|(var)|(while)|(return)|(case)|(catch)|(of)|(typeof)|(const)|(default)|(do)|(switch)|(try)|(null)|(true)|(false)|(eval)|(let)|)(?=\\b)|(:?<|<\\/)([a-zA-Z0-9:.]+)*(:?>|\\/>)|(:?<|<\\/)([a-zA-Z0-9:.]+)|([^\\r\\n,{}]+)(,(?=[^}]*\\{)|\\s*(?=\\{))");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f227189e = Pattern.compile("(?<=(function) )(\\w+)", 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f227190f = Pattern.compile("\"(.*?)\"|'(.*?)'");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f227191g = Pattern.compile("/\\*(?:.|[\\n\\r])*?\\*/|//.*");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final char[] f227192h = {'{', '[', '(', '}', ']', ')'};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f227193i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f227194j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f227195k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f227196l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f227197m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String[] f227198n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String[] f227199o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String[] f227200p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String[] f227201q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String[] f227202r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String[] f227203s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String[] f227204t;

    static {
        String[] strArr = {"defineBlock", "defineLiquidBlock", "getAllBlockIds", "getDestroyTime", "getFriction", "setShape", "getRenderType", "getTextureCoords", "setColor", "setDestroyTime", "setExplosionResistance", "setFriction", "setRedstoneConsumer", "setLightLevel", "setLightOpacity", "setRenderLayer", "setRenderType"};
        f227193i = strArr;
        String[] strArr2 = {"getAll", "getAnimalAge", "getArmor", "getArmorCustomName", "getArmorDamage", "getEntityTypeId", "getExtraData", "getHealth", "getItemEntityCount", "getItemEntityData", "getItemEntityId", "getMaxHealth", "getMobSkin", "getNameTag", "getPitch()", "getRenderType", "getRider", "getRiding", "getTarget", "getUniqueId", "getVelX()", "getVelY()", "getVelZ()", "getYaw()", "isSneaking()", "remove", "removeAllEffects", "removeEffect", "rideAnimal", "setArmor", "setArmorCustomName", "setCape", "setCollisionSize", "setExtraData", "setFireTicks", "setHealth", "setImmobile", "setMaxHealth", "setMobSkin", "setNameTag", "setPosition", "setPositionRelative", "setCarriedItem", "setRenderType", "setRot", "setSneaking", "setTarget", "setVelX", "setVelY", "setVelZ", "spawnMob", "addEffect"};
        f227194j = strArr2;
        String[] strArr3 = {"getMaxDamage", "getMaxStackSize", "defineArmor", "defineThrowable", "getCustomThrowableRenderType", "addCraftRecipe", "setMaxDamage", "addFurnaceRecipe", "getName", "getTextureCoords", "getUseAnimation", "internalNameToId", "isValidItem", "setCategory", "setEnchantType", "addShapedRecipe", "setHandEquipped", "setProperties", "setStackedByData", "setUseAnimation", "translatedNameToId"};
        f227195k = strArr3;
        String[] strArr4 = {"biomeIdToName", "canSeeSky", "setSpawnerTypeId", "destroyBlock", "explode", "getAddress", "getBiome", "getBiomeName", "getBrightness", "getGameMode", "getGrassColor", "getDifficulty", "setDifficulty", "getTile", "getData", "getTime", "getWorldDir()", "getWorldName", "setGameMode", "setGrassColor", "getLightningLevel()", "getRainLevel()", "setNightMode", "setSpawn", "setTile", "setTime", "spawnMob", "getSignText", "setSignText", "addParticle", "playSound", "playSoundEnt", "setBlockExtraData", "dropItem", "getChestSlot", "getChestSlotCount", "getChestSlotData", "setChestSlot", "setChestSlotCustomName", "setSpawnerEntityType", "setLightningLevel", "setRainLevel", "getFurnaceSlot", "getFurnaceSlotCount", "getFurnaceSlotData", "setFurnaceSlot"};
        f227196l = strArr4;
        String[] strArr5 = {"getOS()", "dumpVtable", "getI18n", "getBytesFromTexturePack", "getLanguage", "getMinecraftVersion", "langEdit", "openInputStreamFromTexturePack", "overrideTexture", "readData", "removeData", g.f239522O, "resetFov", "resetImages", "setFoodItem", "setFov", "setGameSpeed", "setItem", "showTipMessage", "setUiRenderDebug", "takeScreenshot", "setGuiBlocks", "setItems", "setTerrain", "selectLevel"};
        f227197m = strArr5;
        String[] strArr6 = {"addExp", "addItemInventory", "addItemCreativeInv", "canFly()", "clearInventorySlot", "enchant", "getEnchantments", "getArmorSlot", "getArmorSlotDamage", "getCarriedItemCount", "getCarriedItemData", "getDimension", "getEntity", "getExhaustion", "getExp", "getHunger", "getInventorySlot", "getInventorySlotCount", "getInventorySlotData", "getItemCustomName", "setInventorySlot", "getLevel", "setLevel", "setSaturation", "setSelectedSlotId", "setItemCustomName", "getName", "getPointedBlockId()", "getPointedBlockData()", "getPointedBlockSide()", "getPointedBlockX()", "getPointedBlockY()", "getPointedBlockZ()", "getPointedEntity()", "getPointedVecX()", "getPointedVecY()", "getPointedVecZ()", "getSaturation", "getScore", "getSelectedSlotId()", "isFlying()", "setCanFly", "setFlying", "setArmorSlot", "setExhaustion", "setExp", "setHunger", "isPlayer()"};
        f227198n = strArr6;
        String[] strArr7 = {"getAllPlayerNames()", "getAllPlayers()", "getPort()", "joinServer", "sendChat"};
        f227199o = strArr7;
        String[] strArr8 = {"useItem", "newLevel", "procCmd", "selectLevelHook", "attackHook", "modTick", "eatHook", "explodeHook", "deathHook", "entityAddedHook", "entityRemovedHook", "entityHurtHook", "projectileHitEntityHook", "playerAddExpHook", "playerExpLevelChangeHook", "redstoneUpdateHook", "startDestroyBlock", "continueDestroyBlock", "blockEventHook", "levelEventHook", "serverMessageReceiveHook", "screenChangeHook", "chatReceiveHook", "chatHook"};
        f227200p = strArr8;
        String[] strArr9 = {"function"};
        f227201q = strArr9;
        String[] strArr10 = {"clientMessage", "getPlayerX()", "getPlayerY()", "getPlayerZ()", "getPlayerEnt()"};
        f227202r = strArr10;
        String[] strArr11 = {":active", ":after", ":before", ":first", ":first-child", ":first-letter", ":first-line", ":focus", ":hover", ":lang", ":left", ":link", ":right", ":visited", "@charset", "@font-face", "@import", "@media", "@page", "a", "abbr", "above", "absolute", "accept", "accept-charset", "accesskey", "action", AgentOptions.ADDRESS, "alt", "always", "aqua", "area", "armenian", "article", "aside", "async", "attr", "audio", N.f218775c, "autocomplete", "autofocus", "autoplay", "avoid", "azimuth", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, NotificationCompat.w.f110895C, "background-attachment", "background-color", "background-image", "background-position", "background-repeat", "base", "baseline", "bdi", "bdo", "behind", "below", "bgsound", "bidi-override", "black", "blink", "block", "blockquote", "blue", "body", "bold", "bolder", OutlinedTextFieldKt.f96719c, "border-bottom", "border-bottom-color", "border-bottom-style", "border-bottom-width", "border-collapse", "border-color", "border-left", "border-left-color", "border-left-style", "border-left-width", "border-right", "border-right-color", "border-right-style", "border-right-width", "border-spacing", "border-style", "border-top", "border-top-color", "border-top-style", "border-top-width", "border-width", "both", "bottom", "br", "button", "canvas", "capitalize", "caption", "caption-side", "cellpadding", "cellspacing", "center", "center-left", "center-right", "challenge", "charset", "checked", "circle", "cite", "cjk-ideographic", "class", "clear", "clip", "close-quote", f.f79422s, "col", "colgroup", "collapse", "color", "cols", "colspan", "command", "compact", "condensed", "content", "contenteditable", "contextmenu", "continuous", "controls", "coords", "counter-increment", "counter-reset", "crop", "cros", "crosshair", "cue", "cue-after", "cue-before", "cursor", "data", "datalist", "datetime", "dd", "decimal", "decimal-leading-zero", "default", "defer", "deg", "del", WebViewInterstitialActivity.f162280w, "dfn", "dialog", "digits", "dir", "direction", "disabled", "disc", "display", "div", "dl", "draggable", "dropzone", "dt", "e-resize", "element", "elevation", "em", "embed", "empty-cells", "enctype", "ex", "expanded", "extra-condensed", "extra-expanded", "far-left", "far-right", "fast", "faster", "fieldset", "figcaption", "figure", "fixed", x.b.f238262c, "font", "font-family", "font-size", "font-size-adjust", "font-stretch", "font-style", "font-variant", "font-weight", "footer", "for", "form", "formaction", "formenctype", "formmethod", "formnovalidate", "formtarget", x.a.f238230L, "frameset", "fuchsia", "georgian", "grad", "gray", "green", "h1", "h2", "h3", "h4", "h5", "h6", "head", j.b.a.f164784c, j.b.a.f164786e, j.d.f76481e, InMobiNetworkValues.HEIGHT, "help", "hgroup", "hidden", "hide", "high", "higher", "hiragana", "hiragana-iroha", "hr", "href", "hreflang", "html", "http-equiv", "hz", "i", "icon", "id", "iframe", "img", "inherit", "inline", "inline-table", "input", "ins", "inside", "ismap", "italic", "justify", "katakana", "katakana-iroha", "kbd", "keygen", "keytype", "khz", i.f240157v, "label", "landscape", "lang", "left", "left-side", "leftwards", "legend", "letter-spacing", FirebaseAnalytics.Param.LEVEL, "li", "lighter", "lime", "line-height", "line-through", "link", "list", "list-item", "list-style", "list-style-image", "list-style-position", "list-style-type", "loop", "loud", "low", "lower", "lower-alpha", "lower-greek", "lower-latin", "lower-roman", "lowercase", "ltr", C4182q.f167623c, "map", "margin", "margin-bottom", "margin-left", "margin-right", "margin-top", "mark", "marker", "marker-offset", "marks", "maroon", "marquee", "max", "max-height", "max-width", "maxlength", "media", FirebaseAnalytics.Param.MEDIUM, l.g.f220834f, "menuitem", "message-box", com.prism.gaia.server.accounts.b.f166415I, "meter", "method", "middle", "min", "min-height", "min-width", "mix", "move", "ms", "multicol", "multiple", "muted", "n-resize", "name", "narrower", "nav", "navy", "ne-resize", "no-close-quote", "no-open-quote", "no-repeat", "nobr", "noframes", "none", "normal", "noscript", "novalidate", "nowrap", "nw-resize", "object", "oblique", "ol", "olive", "onabort", "onautocomplete", "onautocompleteerror", "onbeforeprint", "onbeforeunload", "onblur", "oncancel", "oncanplay", "oncanplaythrough", "once", "onchange", "onclick", "onclose", "oncontextmenu", "oncuechange", "ondblclick", "ondrag", "ondragend", "ondragenter", "ondragexit", "ondragleave", "ondragover", "ondragstart", "ondrop", "ondurationchange", "onemptied", "onended", "onerror", "onfocus", "onhashchange", "oninput", "oninvalid", "onkeydown", "onkeypress", "onkeyup", "onload", "onloadeddata", "onloadedmetadata", "onloadstart", "onmessage", "onmousedown", "onmouseenter", "onmouseleave", "onmousemove", "onmouseout", "onmouseover", "onmouseup", "onmousewheel", "onoffline", "ononline", "onpagehide", "onpageshow", "onpause", "onplay", "onplaying", "onpointercancel", "onpointerdown", "onpointerenter", "onpointerleave", "onpointerlockchange", "onpointerlockerror", "onpointermove", "onpointerout", "onpointerover", "onpointerup", "onpopstate", "onprogress", "onratechange", "onreadystatechange", "onredo", "onreset", "onresize", "onscroll", "onseeked", "onseeking", "onselect", "onshow", "onsort", "onstalled", "onstorage", "onsubmit", "onsuspend", "ontimeupdate", "ontoggle", "onundo", "onunload", "onvolumechange", "onwaiting", "open", "open-quote", "optgroup", "optimum", "option", "orphans", "outline", "outline-color", "outline-style", "outline-width", AgentOptions.OUTPUT, "outside", "overflow", "overline", "p", "padding", "padding-bottom", "padding-left", "padding-right", "padding-top", "page", "page-break-after", "page-break-before", "page-break-inside", "param", "pattern", CampaignEx.JSON_NATIVE_VIDEO_PAUSE, "pause-after", "pause-before", "picture", "pitch", "pitch-range", "placeholder", "play-during", "pointer", "portrait", o.f76584m, "poster", "pre", "preload", "progress", "pt", "pubdate", "purple", "px", CampaignEx.JSON_KEY_AD_Q, "quotes", "rad", "radiogroup", "readonly", "red", "rel", "relative", "repeat", "repeat-x", "repeat-y", "required", "reversed", "richness", "right", "right-side", "rightwards", "rows", "rowspan", PfsFileProvider.f183637b, "rt", "rtc", "rtl", "ruby", "run-in", "s", "s-resize", "samp", "sandbox", "scope", "scoped", "script", "scroll", "se-resize", "seamless", "section", "select", "selected", "semi-condensed", "semi-expanded", "separate", "shadow", "shape", "show", NotificationCompat.GROUP_KEY_SILENT, "silver", X3.i.f76775k, "sizes", "slow", "slower", "small", "small-caps", "small-caption", "soft", "source", "span", "speak", "speak-header", "speak-numeral", "speak-ponctuation", "speech-rate", "spell-out", "spellcheck", "square", "src", "srcdoc", "srclang", "start", "static", "status-bar", "step", "stress", "strike", "strong", "style", "sub", "summary", "sup", "super", "svg", "svg:svg", "sw-resize", "tabindex", "table", "table-caption", "table-cell", "table-column", "table-column-group", "table-footer-group", "table-header-group", "table-layout", "table-row", "table-row-group", "target", "tbody", "td", "teal", "template", "text", "text-align", "text-bottom", "text-decoration", "text-indent", "text-shadow", "text-top", "text-transform", "textarea", "tfoot", "th", "thead", "time", "title", "titleonafterprint", "top", "tr", "track", "transparent", "type", "u", "ul", "ultra-condensed", "ultra-expanded", "underline", "unicode-bidi", "upper-alpha", "upper-latin", "upper-roman", "uppercase", "usemap", "value", "var", "vertical-align", "video", "visibility", "visible", "voice-family", "volume", "w-resize", "wait", "wbr", "white", "white-space", "wider", "widows", InMobiNetworkValues.WIDTH, "word-spacing", "wrap", "x-fast", "x-high", "x-loud", "x-low", "x-slow", "x-soft", "xml:base", "xml:lang", "xmlns", "yellow", "z-index"};
        f227203s = strArr11;
        f227204t = (String[]) C5685a.a(String.class, strArr, strArr2, strArr3, strArr4, strArr10, strArr5, strArr6, strArr7, strArr8, strArr9, strArr11);
    }

    @Override // r5.AbstractC5532d
    public final String[] a() {
        return f227204t;
    }

    @Override // r5.AbstractC5532d
    public final char[] b() {
        return f227192h;
    }

    @Override // r5.AbstractC5532d
    public final Pattern c() {
        return f227187c;
    }

    @Override // r5.AbstractC5532d
    public final Pattern d() {
        return f227191g;
    }

    @Override // r5.AbstractC5532d
    public final Pattern e() {
        return f227188d;
    }

    @Override // r5.AbstractC5532d
    public final Pattern f() {
        return f227189e;
    }

    @Override // r5.AbstractC5532d
    public final Pattern g() {
        return f227185a;
    }

    @Override // r5.AbstractC5532d
    public final Pattern h() {
        return f227190f;
    }

    @Override // r5.AbstractC5532d
    public final Pattern i() {
        return f227186b;
    }
}
