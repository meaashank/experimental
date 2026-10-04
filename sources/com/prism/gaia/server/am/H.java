package com.prism.gaia.server.am;

import android.content.Intent;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes6.dex */
public class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList<ActivityRecordG> f166721a = new LinkedList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f166722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f166723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f166724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Intent f166725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ActivityRecordG f166726f;

    public H(int i10, ActivityRecordG activityRecordG) {
        this.f166722b = i10;
        this.f166723c = activityRecordG.f166640k;
        this.f166724d = activityRecordG.f166644o;
        Intent intent = activityRecordG.f166633d;
        this.f166725e = intent;
        intent.setComponent(activityRecordG.f166643n);
        this.f166726f = activityRecordG;
    }

    public ActivityRecordG a() {
        if (this.f166721a.size() == 0) {
            return null;
        }
        return this.f166721a.getLast();
    }

    public boolean b(ActivityRecordG activityRecordG) {
        Intent intent = new Intent(activityRecordG.f166633d);
        intent.setComponent(activityRecordG.f166643n);
        return this.f166725e.filterEquals(intent);
    }

    public String toString() {
        return "(taskId:" + this.f166722b + ", vuserId:" + this.f166723c + ", affinity:" + this.f166724d + ", rootActivity:" + U6.j.I(this.f166726f) + ")";
    }
}
