package com.bytedance.adsdk.NOt.mZ;

import android.graphics.PointF;
import androidx.compose.foundation.text.modifiers.l;
import com.bytedance.component.sdk.annotation.ColorInt;
import com.bytedance.component.sdk.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class NOt {

    @ColorInt
    public int FA;
    public float Ht;
    public float Mm;
    public String NOt;
    public int TFq;

    @ColorInt
    public int Vor;
    public boolean ZH;
    public String ZRu;
    public float aT;
    public PointF lp;
    public float mZ;
    public PointF sAl;
    public ZRu uR;

    public enum ZRu {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public NOt(String str, String str2, float f10, ZRu zRu, int i10, float f11, float f12, @ColorInt int i11, @ColorInt int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        ZRu(str, str2, f10, zRu, i10, f11, f12, i11, i12, f13, z10, pointF, pointF2);
    }

    public void ZRu(String str, String str2, float f10, ZRu zRu, int i10, float f11, float f12, @ColorInt int i11, @ColorInt int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        this.ZRu = str;
        this.NOt = str2;
        this.mZ = f10;
        this.uR = zRu;
        this.TFq = i10;
        this.Ht = f11;
        this.Mm = f12;
        this.FA = i11;
        this.Vor = i12;
        this.aT = f13;
        this.ZH = z10;
        this.lp = pointF;
        this.sAl = pointF2;
    }

    public int hashCode() {
        int iOrdinal = ((this.uR.ordinal() + (((int) (l.a(this.NOt, this.ZRu.hashCode() * 31, 31) + this.mZ)) * 31)) * 31) + this.TFq;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.Ht);
        return (((iOrdinal * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.FA;
    }

    public NOt() {
    }
}
