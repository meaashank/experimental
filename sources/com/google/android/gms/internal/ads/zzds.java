package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import e.InterfaceC4337k;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class zzds {
    private static final Pattern zza = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern zzb = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern zzc = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    private static final Map zzd;

    static {
        HashMap map = new HashMap();
        zzd = map;
        D3.a.a(-984833, map, "aliceblue", -332841, "antiquewhite");
        D3.b.a(map, "aqua", -16711681, -8388652, "aquamarine");
        D3.a.a(-983041, map, "azure", -657956, "beige");
        D3.a.a(-6972, map, "bisque", -16777216, "black");
        D3.a.a(-5171, map, "blanchedalmond", -16776961, "blue");
        D3.a.a(-7722014, map, "blueviolet", -5952982, "brown");
        D3.a.a(-2180985, map, "burlywood", -10510688, "cadetblue");
        D3.a.a(-8388864, map, "chartreuse", -2987746, "chocolate");
        D3.a.a(-32944, map, "coral", -10185235, "cornflowerblue");
        D3.a.a(-1828, map, "cornsilk", -2354116, "crimson");
        D3.b.a(map, "cyan", -16711681, -16777077, "darkblue");
        D3.a.a(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        D3.b.a(map, "darkgray", -5658199, -16751616, "darkgreen");
        D3.b.a(map, "darkgrey", -5658199, -4343957, "darkkhaki");
        D3.a.a(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        D3.a.a(-29696, map, "darkorange", -6737204, "darkorchid");
        D3.a.a(-7667712, map, "darkred", -1468806, "darksalmon");
        D3.a.a(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        D3.b.a(map, "darkturquoise", -16724271, -7077677, "darkviolet");
        D3.a.a(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        D3.b.a(map, "dodgerblue", -14774017, -5103070, "firebrick");
        D3.a.a(-1296, map, "floralwhite", -14513374, "forestgreen");
        D3.b.a(map, "fuchsia", -65281, -2302756, "gainsboro");
        D3.a.a(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        D3.a.a(-16744448, map, "green", -5374161, "greenyellow");
        D3.b.a(map, "grey", -8355712, -983056, "honeydew");
        D3.a.a(-38476, map, "hotpink", -3318692, "indianred");
        D3.a.a(-11861886, map, "indigo", -16, "ivory");
        D3.a.a(-989556, map, "khaki", -1644806, "lavender");
        D3.a.a(-3851, map, "lavenderblush", -8586240, "lawngreen");
        D3.a.a(-1331, map, "lemonchiffon", -5383962, "lightblue");
        D3.a.a(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        D3.a.a(-18751, map, "lightpink", -24454, "lightsalmon");
        D3.a.a(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        D3.b.a(map, "lightsteelblue", -5192482, -32, "lightyellow");
        D3.a.a(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        D3.a.a(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        D3.a.a(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        D3.a.a(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        D3.a.a(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        D3.a.a(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        D3.a.a(-15132304, map, "midnightblue", -655366, "mintcream");
        D3.a.a(-6943, map, "mistyrose", -6987, "moccasin");
        D3.a.a(-8531, map, "navajowhite", -16777088, "navy");
        D3.a.a(-133658, map, "oldlace", -8355840, "olive");
        D3.a.a(-9728477, map, "olivedrab", -23296, "orange");
        D3.a.a(-47872, map, "orangered", -2461482, "orchid");
        D3.a.a(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        D3.a.a(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        D3.a.a(-4139, map, "papayawhip", -9543, "peachpuff");
        D3.a.a(-3308225, map, "peru", -16181, "pink");
        D3.a.a(-2252579, map, "plum", -5185306, "powderblue");
        D3.a.a(-8388480, map, "purple", -10079335, "rebeccapurple");
        D3.a.a(-65536, map, "red", -4419697, "rosybrown");
        D3.a.a(-12490271, map, "royalblue", -7650029, "saddlebrown");
        D3.a.a(-360334, map, "salmon", -744352, "sandybrown");
        D3.a.a(-13726889, map, "seagreen", -2578, "seashell");
        D3.a.a(-6270419, map, "sienna", -4144960, "silver");
        D3.a.a(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        D3.b.a(map, "snow", -1286, -16711809, "springgreen");
        D3.a.a(-12156236, map, "steelblue", -2968436, "tan");
        D3.a.a(-16744320, map, "teal", -2572328, "thistle");
        D3.a.a(-40121, map, "tomato", 0, "transparent");
        D3.a.a(-12525360, map, "turquoise", -1146130, "violet");
        D3.a.a(-663885, map, "wheat", -1, "white");
        D3.a.a(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    @InterfaceC4337k
    public static int zza(String str) {
        return zzc(str, false);
    }

    @InterfaceC4337k
    public static int zzb(String str) {
        return zzc(str, true);
    }

    @InterfaceC4337k
    private static int zzc(String str, boolean z10) {
        int i10;
        zzguk.zza(!TextUtils.isEmpty(str));
        String strReplace = str.replace(C4.q.f17581a, "");
        if (strReplace.charAt(0) == '#') {
            int i11 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i11;
            }
            if (strReplace.length() == 9) {
                return ((i11 & 255) << 24) | (i11 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z10 ? zzc : zzb).matcher(strReplace);
            if (matcher.matches()) {
                if (z10) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i10 = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i10 = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i12 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i13 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i10, i12, i13, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = zza.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i14 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i15 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i14, i15, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) zzd.get(zzgts.zza(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
