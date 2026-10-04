package com.prism.gaia.server.am;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import com.prism.gaia.helper.utils.ComponentUtils;
import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class ActivityRecordG {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ boolean f166629z = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public H f166631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IBinder f166632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Intent f166633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActivityInfo f166634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ActivityRecordG f166635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ActivityRecordG f166636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public IBinder f166637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f166638i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f166639j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f166640k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bundle f166641l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Bundle f166642m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ComponentName f166643n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f166644o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f166645p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f166646q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ProcessRecordG f166647r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f166649t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f166650u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Intent f166653x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f166654y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HashSet<C4150i> f166648s = new HashSet<>();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f166652w = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f166630a = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Status f166651v = Status.STARTING;

    public enum Status {
        STARTING,
        STOPPING,
        CREATING,
        CREATED,
        FINISHING,
        FINISHED,
        DESTROYING,
        DESTROYED
    }

    public ActivityRecordG(Intent intent, ActivityInfo activityInfo, ActivityRecordG activityRecordG, ActivityRecordG activityRecordG2, String str, int i10, Bundle bundle, int i11) {
        this.f166633d = intent;
        this.f166634e = activityInfo;
        this.f166635f = activityRecordG;
        this.f166636g = activityRecordG2;
        this.f166637h = activityRecordG2 == null ? null : activityRecordG2.f166632c;
        this.f166638i = str;
        this.f166639j = i10;
        this.f166641l = bundle;
        this.f166640k = i11;
        if (activityInfo.targetActivity == null || intent.getComponent().getClassName().equals(activityInfo.targetActivity)) {
            this.f166643n = ComponentUtils.u(activityInfo);
        } else {
            String str2 = activityInfo.packageName;
            this.f166643n = new ComponentName(str2, ComponentUtils.h(str2, activityInfo.targetActivity));
        }
        this.f166644o = ComponentUtils.l(activityInfo);
        this.f166645p = activityInfo.launchMode;
        this.f166646q = activityInfo.flags;
    }

    public void a() {
        this.f166651v = Status.CREATED;
    }

    public void b(IBinder iBinder, H h10) {
        this.f166631b = h10;
        this.f166632c = iBinder;
        this.f166651v = Status.CREATING;
    }

    public void c() {
        this.f166651v = Status.DESTROYED;
    }

    public void d() {
        this.f166651v = Status.DESTROYING;
    }

    public void e() {
        this.f166651v = Status.FINISHED;
    }

    public void f() {
        this.f166651v = Status.FINISHING;
    }

    public void g() {
        this.f166651v = Status.CREATING;
        this.f166654y++;
    }

    public void h() {
        this.f166651v = Status.CREATED;
    }

    public void i() {
        this.f166651v = Status.STOPPING;
    }

    public boolean j() {
        ProcessRecordG processRecordG = this.f166647r;
        return processRecordG != null && processRecordG.b();
    }

    public boolean k(int i10) {
        return (i10 & this.f166649t) != 0;
    }

    public void l(int i10) {
        this.f166649t = i10 | this.f166649t;
    }

    public String toString() {
        return "(token:" + this.f166632c + ", uuid:" + this.f166630a + ", resultTo:" + this.f166637h + ", resultWho:" + this.f166638i + ", requestCode:" + this.f166639j + ", vuserId:" + this.f166640k + ", intent:" + this.f166633d + ", cmp:" + this.f166643n + ", affinity:" + this.f166644o + ", launchMode:" + this.f166645p + ", flags:" + U6.j.M(this.f166646q) + ", gFlags:" + U6.j.M(this.f166649t) + ", marked:" + this.f166650u + ", status:" + this.f166651v + ", connNum:" + this.f166648s.size() + ", processRecord:" + this.f166647r + ", resultRecord:" + this.f166635f + ", task:" + this.f166631b + ")";
    }
}
