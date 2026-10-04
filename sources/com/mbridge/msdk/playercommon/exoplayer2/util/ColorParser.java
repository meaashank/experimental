package com.mbridge.msdk.playercommon.exoplayer2.util;

import C4.q;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public final class ColorParser {
    private static final Map<String, Integer> COLOR_MAP;
    private static final String RGB = "rgb";
    private static final String RGBA = "rgba";
    private static final Pattern RGB_PATTERN = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern RGBA_PATTERN_INT_ALPHA = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern RGBA_PATTERN_FLOAT_ALPHA = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    static {
        HashMap map = new HashMap();
        COLOR_MAP = map;
        C.a(-984833, map, "aliceblue", -332841, "antiquewhite");
        map.put("aqua", -16711681);
        map.put("aquamarine", -8388652);
        C.a(-983041, map, "azure", -657956, "beige");
        C.a(-6972, map, "bisque", -16777216, "black");
        C.a(-5171, map, "blanchedalmond", -16776961, "blue");
        C.a(-7722014, map, "blueviolet", -5952982, "brown");
        C.a(-2180985, map, "burlywood", -10510688, "cadetblue");
        C.a(-8388864, map, "chartreuse", -2987746, "chocolate");
        C.a(-32944, map, "coral", -10185235, "cornflowerblue");
        C.a(-1828, map, "cornsilk", -2354116, "crimson");
        map.put("cyan", -16711681);
        map.put("darkblue", -16777077);
        C.a(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        map.put("darkgray", -5658199);
        map.put("darkgreen", -16751616);
        map.put("darkgrey", -5658199);
        map.put("darkkhaki", -4343957);
        C.a(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        C.a(-29696, map, "darkorange", -6737204, "darkorchid");
        C.a(-7667712, map, "darkred", -1468806, "darksalmon");
        C.a(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        map.put("darkturquoise", -16724271);
        map.put("darkviolet", -7077677);
        C.a(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        map.put("dodgerblue", -14774017);
        map.put("firebrick", -5103070);
        C.a(-1296, map, "floralwhite", -14513374, "forestgreen");
        map.put("fuchsia", -65281);
        map.put("gainsboro", -2302756);
        C.a(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        C.a(-16744448, map, "green", -5374161, "greenyellow");
        map.put("grey", -8355712);
        map.put("honeydew", -983056);
        C.a(-38476, map, "hotpink", -3318692, "indianred");
        C.a(-11861886, map, "indigo", -16, "ivory");
        C.a(-989556, map, "khaki", -1644806, "lavender");
        C.a(-3851, map, "lavenderblush", -8586240, "lawngreen");
        C.a(-1331, map, "lemonchiffon", -5383962, "lightblue");
        C.a(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        C.a(-18751, map, "lightpink", -24454, "lightsalmon");
        C.a(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        map.put("lightsteelblue", -5192482);
        map.put("lightyellow", -32);
        C.a(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        C.a(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        C.a(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        C.a(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        C.a(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        C.a(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        C.a(-15132304, map, "midnightblue", -655366, "mintcream");
        C.a(-6943, map, "mistyrose", -6987, "moccasin");
        C.a(-8531, map, "navajowhite", -16777088, "navy");
        C.a(-133658, map, "oldlace", -8355840, "olive");
        C.a(-9728477, map, "olivedrab", -23296, "orange");
        C.a(-47872, map, "orangered", -2461482, "orchid");
        C.a(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        C.a(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        C.a(-4139, map, "papayawhip", -9543, "peachpuff");
        C.a(-3308225, map, "peru", -16181, "pink");
        C.a(-2252579, map, "plum", -5185306, "powderblue");
        C.a(-8388480, map, "purple", -10079335, "rebeccapurple");
        C.a(-65536, map, "red", -4419697, "rosybrown");
        C.a(-12490271, map, "royalblue", -7650029, "saddlebrown");
        C.a(-360334, map, "salmon", -744352, "sandybrown");
        C.a(-13726889, map, "seagreen", -2578, "seashell");
        C.a(-6270419, map, "sienna", -4144960, "silver");
        C.a(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        map.put("snow", -1286);
        map.put("springgreen", -16711809);
        C.a(-12156236, map, "steelblue", -2968436, "tan");
        C.a(-16744320, map, "teal", -2572328, "thistle");
        C.a(-40121, map, "tomato", 0, "transparent");
        C.a(-12525360, map, "turquoise", -1146130, "violet");
        C.a(-663885, map, "wheat", -1, "white");
        C.a(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    private ColorParser() {
    }

    private static int argb(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    private static int parseColorInternal(String str, boolean z10) {
        Assertions.checkArgument(!TextUtils.isEmpty(str));
        String strReplace = str.replace(q.f17581a, "");
        if (strReplace.charAt(0) == '#') {
            int i10 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i10;
            }
            if (strReplace.length() == 9) {
                return ((i10 & 255) << 24) | (i10 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith(RGBA)) {
            Matcher matcher = (z10 ? RGBA_PATTERN_FLOAT_ALPHA : RGBA_PATTERN_INT_ALPHA).matcher(strReplace);
            if (matcher.matches()) {
                return argb(z10 ? (int) (Float.parseFloat(matcher.group(4)) * 255.0f) : Integer.parseInt(matcher.group(4), 10), Integer.parseInt(matcher.group(1), 10), Integer.parseInt(matcher.group(2), 10), Integer.parseInt(matcher.group(3), 10));
            }
        } else if (strReplace.startsWith(RGB)) {
            Matcher matcher2 = RGB_PATTERN.matcher(strReplace);
            if (matcher2.matches()) {
                return rgb(Integer.parseInt(matcher2.group(1), 10), Integer.parseInt(matcher2.group(2), 10), Integer.parseInt(matcher2.group(3), 10));
            }
        } else {
            Integer num = COLOR_MAP.get(Util.toLowerInvariant(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    public static int parseCssColor(String str) {
        return parseColorInternal(str, true);
    }

    public static int parseTtmlColor(String str) {
        return parseColorInternal(str, false);
    }

    private static int rgb(int i10, int i11, int i12) {
        return argb(255, i10, i11, i12);
    }
}
