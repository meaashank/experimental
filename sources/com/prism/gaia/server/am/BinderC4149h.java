package com.prism.gaia.server.am;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import java.util.List;

/* JADX INFO: renamed from: com.prism.gaia.server.am.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class BinderC4149h extends Binder {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final int f166861K = 0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final int f166862L = 1;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final int f166863M = 2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int f166864N = 3;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f166865O = 4;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final int f166866P = 0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final int f166867Q = 1;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final int f166868R = 2;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final int f166869S = 3;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public IBinder f166870A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f166871B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f166872C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f166873D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f166874E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C4148g f166875F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public BroadcastFilterG f166876G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ProcessRecordG f166877H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public ComponentName f166878I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public ActivityInfo f166879J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f166880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComponentName f166881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProcessRecordG f166882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f166883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f166884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f166885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f166886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f166887h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f166888i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f166889j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f166890k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f166891l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int[] f166892m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long[] f166893n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.prism.gaia.client.stub.r f166894o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f166895p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f166896q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f166897r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f166898s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f166899t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f166900u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f166901v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f166902w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Bundle f166903x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f166904y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f166905z;

    public BinderC4149h(C4148g c4148g, Intent intent, ProcessRecordG processRecordG, String str, int i10, int i11, String str2, List list, com.prism.gaia.client.stub.r rVar, int i12, String str3, Bundle bundle, boolean z10, boolean z11, boolean z12, int i13, boolean z13) {
        if (intent == null) {
            throw new NullPointerException("Can't construct with a null intent");
        }
        this.f166875F = c4148g;
        this.f166880a = intent;
        this.f166881b = intent.getComponent();
        this.f166882c = processRecordG;
        this.f166883d = str;
        this.f166884e = i10;
        this.f166885f = i11;
        this.f166890k = str2;
        this.f166891l = list;
        int[] iArr = new int[list != null ? list.size() : 0];
        this.f166892m = iArr;
        this.f166893n = new long[iArr.length];
        this.f166894o = rVar;
        this.f166901v = i12;
        this.f166902w = str3;
        this.f166903x = bundle;
        this.f166886g = z10;
        this.f166887h = z11;
        this.f166888i = z12;
        this.f166889j = i13;
        this.f166905z = 0;
        this.f166871B = 0;
        this.f166900u = z13;
    }

    public int a(Object obj) {
        return obj instanceof BroadcastFilterG ? ((BroadcastFilterG) obj).owningVuid : ((ResolveInfo) obj).activityInfo.applicationInfo.uid;
    }

    public String toString() {
        return "BroadcastRecord{" + Integer.toHexString(System.identityHashCode(this)) + " u" + this.f166889j + C4.q.f17581a + this.f166880a.getAction() + "}";
    }
}
