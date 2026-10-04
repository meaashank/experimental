package com.google.android.exoplayer2.util;

import C4.q;
import D3.a;
import D3.b;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
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
        a.a(-984833, map, "aliceblue", -332841, "antiquewhite");
        b.a(map, "aqua", -16711681, -8388652, "aquamarine");
        a.a(-983041, map, "azure", -657956, "beige");
        a.a(-6972, map, "bisque", -16777216, "black");
        a.a(-5171, map, "blanchedalmond", -16776961, "blue");
        a.a(-7722014, map, "blueviolet", -5952982, "brown");
        a.a(-2180985, map, "burlywood", -10510688, "cadetblue");
        a.a(-8388864, map, "chartreuse", -2987746, "chocolate");
        a.a(-32944, map, "coral", -10185235, "cornflowerblue");
        a.a(-1828, map, "cornsilk", -2354116, "crimson");
        b.a(map, "cyan", -16711681, -16777077, "darkblue");
        a.a(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        b.a(map, "darkgray", -5658199, -16751616, "darkgreen");
        b.a(map, "darkgrey", -5658199, -4343957, "darkkhaki");
        a.a(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        a.a(-29696, map, "darkorange", -6737204, "darkorchid");
        a.a(-7667712, map, "darkred", -1468806, "darksalmon");
        a.a(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        b.a(map, "darkturquoise", -16724271, -7077677, "darkviolet");
        a.a(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        b.a(map, "dodgerblue", -14774017, -5103070, "firebrick");
        a.a(-1296, map, "floralwhite", -14513374, "forestgreen");
        b.a(map, "fuchsia", -65281, -2302756, "gainsboro");
        a.a(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        a.a(-16744448, map, "green", -5374161, "greenyellow");
        b.a(map, "grey", -8355712, -983056, "honeydew");
        a.a(-38476, map, "hotpink", -3318692, "indianred");
        a.a(-11861886, map, "indigo", -16, "ivory");
        a.a(-989556, map, "khaki", -1644806, "lavender");
        a.a(-3851, map, "lavenderblush", -8586240, "lawngreen");
        a.a(-1331, map, "lemonchiffon", -5383962, "lightblue");
        a.a(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        a.a(-18751, map, "lightpink", -24454, "lightsalmon");
        a.a(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        b.a(map, "lightsteelblue", -5192482, -32, "lightyellow");
        a.a(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        a.a(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        a.a(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        a.a(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        a.a(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        a.a(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        a.a(-15132304, map, "midnightblue", -655366, "mintcream");
        a.a(-6943, map, "mistyrose", -6987, "moccasin");
        a.a(-8531, map, "navajowhite", -16777088, "navy");
        a.a(-133658, map, "oldlace", -8355840, "olive");
        a.a(-9728477, map, "olivedrab", -23296, "orange");
        a.a(-47872, map, "orangered", -2461482, "orchid");
        a.a(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        a.a(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        a.a(-4139, map, "papayawhip", -9543, "peachpuff");
        a.a(-3308225, map, "peru", -16181, "pink");
        a.a(-2252579, map, "plum", -5185306, "powderblue");
        a.a(-8388480, map, "purple", -10079335, "rebeccapurple");
        a.a(-65536, map, "red", -4419697, "rosybrown");
        a.a(-12490271, map, "royalblue", -7650029, "saddlebrown");
        a.a(-360334, map, "salmon", -744352, "sandybrown");
        a.a(-13726889, map, "seagreen", -2578, "seashell");
        a.a(-6270419, map, "sienna", -4144960, "silver");
        a.a(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        b.a(map, "snow", -1286, -16711809, "springgreen");
        a.a(-12156236, map, "steelblue", -2968436, "tan");
        a.a(-16744320, map, "teal", -2572328, "thistle");
        a.a(-40121, map, "tomato", 0, "transparent");
        a.a(-12525360, map, "turquoise", -1146130, "violet");
        a.a(-663885, map, "wheat", -1, "white");
        a.a(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
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
