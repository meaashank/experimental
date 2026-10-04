package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import g3.C4447e;
import g3.InterfaceC4444b;
import g3.InterfaceC4450h;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class l implements InterfaceC4444b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f139735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f139736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f139737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class<?> f139738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class<?> f139739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC4444b f139740h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map<Class<?>, InterfaceC4450h<?>> f139741i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C4447e f139742j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f139743k;

    public l(Object obj, InterfaceC4444b interfaceC4444b, int i10, int i11, Map<Class<?>, InterfaceC4450h<?>> map, Class<?> cls, Class<?> cls2, C4447e c4447e) {
        y3.m.f(obj, "Argument must not be null");
        this.f139735c = obj;
        y3.m.f(interfaceC4444b, "Signature must not be null");
        this.f139740h = interfaceC4444b;
        this.f139736d = i10;
        this.f139737e = i11;
        y3.m.f(map, "Argument must not be null");
        this.f139741i = map;
        y3.m.f(cls, "Resource class must not be null");
        this.f139738f = cls;
        y3.m.f(cls2, "Transcode class must not be null");
        this.f139739g = cls2;
        y3.m.f(c4447e, "Argument must not be null");
        this.f139742j = c4447e;
    }

    @Override // g3.InterfaceC4444b
    public void b(@NonNull MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // g3.InterfaceC4444b
    public boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f139735c.equals(lVar.f139735c) && this.f139740h.equals(lVar.f139740h) && this.f139737e == lVar.f139737e && this.f139736d == lVar.f139736d && this.f139741i.equals(lVar.f139741i) && this.f139738f.equals(lVar.f139738f) && this.f139739g.equals(lVar.f139739g) && this.f139742j.equals(lVar.f139742j)) {
                return true;
            }
        }
        return false;
    }

    @Override // g3.InterfaceC4444b
    public int hashCode() {
        if (this.f139743k == 0) {
            int iHashCode = this.f139735c.hashCode();
            this.f139743k = iHashCode;
            int iHashCode2 = ((((this.f139740h.hashCode() + (iHashCode * 31)) * 31) + this.f139736d) * 31) + this.f139737e;
            this.f139743k = iHashCode2;
            int iHashCode3 = this.f139741i.hashCode() + (iHashCode2 * 31);
            this.f139743k = iHashCode3;
            int iHashCode4 = this.f139738f.hashCode() + (iHashCode3 * 31);
            this.f139743k = iHashCode4;
            int iHashCode5 = this.f139739g.hashCode() + (iHashCode4 * 31);
            this.f139743k = iHashCode5;
            this.f139743k = this.f139742j.f202239c.hashCode() + (iHashCode5 * 31);
        }
        return this.f139743k;
    }

    public String toString() {
        return "EngineKey{model=" + this.f139735c + ", width=" + this.f139736d + ", height=" + this.f139737e + ", resourceClass=" + this.f139738f + ", transcodeClass=" + this.f139739g + ", signature=" + this.f139740h + ", hashCode=" + this.f139743k + ", transformations=" + this.f139741i + ", options=" + this.f139742j + '}';
    }
}
