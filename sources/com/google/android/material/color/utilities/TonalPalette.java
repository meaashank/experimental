package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class TonalPalette {
    Map<Integer, Integer> cache = new HashMap();
    double chroma;
    double hue;
    Hct keyColor;

    private TonalPalette(double d10, double d11, Hct hct) {
        this.hue = d10;
        this.chroma = d11;
        this.keyColor = hct;
    }

    private static Hct createKeyColor(double d10, double d11) {
        Hct hctFrom = Hct.from(d10, d11, 50.0d);
        double dAbs = Math.abs(hctFrom.getChroma() - d11);
        for (double d12 = 1.0d; d12 < 50.0d && Math.round(d11) != Math.round(hctFrom.getChroma()); d12 += 1.0d) {
            Hct hctFrom2 = Hct.from(d10, d11, 50.0d + d12);
            double dAbs2 = Math.abs(hctFrom2.getChroma() - d11);
            if (dAbs2 < dAbs) {
                dAbs = dAbs2;
                hctFrom = hctFrom2;
            }
            Hct hctFrom3 = Hct.from(d10, d11, 50.0d - d12);
            double dAbs3 = Math.abs(hctFrom3.getChroma() - d11);
            if (dAbs3 < dAbs) {
                dAbs = dAbs3;
                hctFrom = hctFrom3;
            }
        }
        return hctFrom;
    }

    public static TonalPalette fromHct(Hct hct) {
        return new TonalPalette(hct.getHue(), hct.getChroma(), hct);
    }

    public static TonalPalette fromHueAndChroma(double d10, double d11) {
        return new TonalPalette(d10, d11, createKeyColor(d10, d11));
    }

    public static TonalPalette fromInt(int i10) {
        return fromHct(Hct.fromInt(i10));
    }

    public double getChroma() {
        return this.chroma;
    }

    public Hct getHct(double d10) {
        return Hct.from(this.hue, this.chroma, d10);
    }

    public double getHue() {
        return this.hue;
    }

    public Hct getKeyColor() {
        return this.keyColor;
    }

    public int tone(int i10) {
        Integer numValueOf = this.cache.get(Integer.valueOf(i10));
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(Hct.from(this.hue, this.chroma, i10).toInt());
            this.cache.put(Integer.valueOf(i10), numValueOf);
        }
        return numValueOf.intValue();
    }
}
