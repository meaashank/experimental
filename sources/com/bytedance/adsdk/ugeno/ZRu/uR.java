package com.bytedance.adsdk.ugeno.ZRu;

import androidx.constraintlayout.motion.widget.f;
import s0.x;

/* JADX INFO: loaded from: classes2.dex */
public enum uR {
    TRANSLATE("translate", "translation", "point"),
    TRANSLATE_X("translateX", "translationX", x.b.f238262c),
    TRANSLATE_Y("translateY", "translationY", x.b.f238262c),
    ROTATE_X("rotateX", "rotationX", x.b.f238262c),
    ROTATE_Y("rotateY", "rotationY", x.b.f238262c),
    ROTATE_Z("rotateZ", f.f106849i, x.b.f238262c),
    SCALE("scale", "scale", "point"),
    SCALE_X("scaleX", "scaleX", x.b.f238262c),
    SCALE_Y("scaleY", "scaleY", x.b.f238262c),
    ALPHA("opacity", "alpha", x.b.f238262c),
    BACKGROUND_COLOR("backgroundColor", "backgroundColor", "int"),
    BORDER_RADIUS("borderRadius", "borderRadius", x.b.f238262c),
    RIPPLE("ripple", "ripple", x.b.f238262c),
    SHINE("shine", "shine", x.b.f238262c);

    private final String WMI;
    private final String oK;
    private final String yBV;

    uR(String str, String str2, String str3) {
        this.oK = str;
        this.yBV = str2;
        this.WMI = str3;
    }

    public String NOt() {
        return this.yBV;
    }

    public String ZRu() {
        return this.oK;
    }

    public String mZ() {
        return this.WMI;
    }

    public static uR ZRu(String str) {
        str.getClass();
        switch (str) {
            case "translateX":
                return TRANSLATE_X;
            case "translateY":
                return TRANSLATE_Y;
            case "opacity":
                return ALPHA;
            case "ripple":
                return RIPPLE;
            case "scaleX":
                return SCALE_X;
            case "scaleY":
                return SCALE_Y;
            case "scale":
                return SCALE;
            case "translate":
                return TRANSLATE;
            case "backgroundColor":
                return BACKGROUND_COLOR;
            case "borderRadius":
                return BORDER_RADIUS;
            case "rotateX":
                return ROTATE_X;
            case "rotateY":
                return ROTATE_Y;
            case "rotateZ":
                return ROTATE_Z;
            default:
                return TRANSLATE_X;
        }
    }
}
