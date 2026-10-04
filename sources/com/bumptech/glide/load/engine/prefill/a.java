package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.cache.j;
import com.bumptech.glide.load.engine.prefill.PreFillType;
import e.f0;
import j3.C4778b;
import j3.RunnableC4777a;
import java.util.HashMap;
import y3.o;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f139758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f139759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DecodeFormat f139760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RunnableC4777a f139761d;

    public a(j jVar, e eVar, DecodeFormat decodeFormat) {
        this.f139758a = jVar;
        this.f139759b = eVar;
        this.f139760c = decodeFormat;
    }

    public static int b(PreFillType preFillType) {
        return o.h(preFillType.f139754a, preFillType.f139755b, preFillType.f139756c);
    }

    @f0
    public C4778b a(PreFillType... preFillTypeArr) {
        long jE = this.f139759b.e() + (this.f139758a.e() - this.f139758a.d());
        int i10 = 0;
        for (PreFillType preFillType : preFillTypeArr) {
            i10 += preFillType.f139757d;
        }
        float f10 = jE / i10;
        HashMap map = new HashMap();
        for (PreFillType preFillType2 : preFillTypeArr) {
            map.put(preFillType2, Integer.valueOf(Math.round(preFillType2.f139757d * f10) / o.h(preFillType2.f139754a, preFillType2.f139755b, preFillType2.f139756c)));
        }
        return new C4778b(map);
    }

    public void c(PreFillType.Builder... builderArr) {
        RunnableC4777a runnableC4777a = this.f139761d;
        if (runnableC4777a != null) {
            runnableC4777a.f212527h = true;
        }
        PreFillType[] preFillTypeArr = new PreFillType[builderArr.length];
        for (int i10 = 0; i10 < builderArr.length; i10++) {
            PreFillType.Builder builder = builderArr[i10];
            if (builder.getConfig() == null) {
                builder.setConfig(this.f139760c == DecodeFormat.PREFER_ARGB_8888 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            }
            preFillTypeArr[i10] = builder.build();
        }
        RunnableC4777a runnableC4777a2 = new RunnableC4777a(this.f139759b, this.f139758a, a(preFillTypeArr));
        this.f139761d = runnableC4777a2;
        o.y(runnableC4777a2);
    }
}
