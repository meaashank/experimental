package com.prism.gaia.server.am;

import android.content.IntentFilter;
import android.os.Binder;
import android.os.IBinder;
import com.prism.gaia.server.pm.AbstractC4181p;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class ReceiverListG extends ArrayList<BroadcastFilterG> implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f166750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.prism.gaia.client.stub.r f166751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProcessRecordG f166752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f166753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f166754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f166755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public BinderC4149h f166756g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f166757h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f166758i;

    public ReceiverListG(q qVar, com.prism.gaia.client.stub.r rVar, ProcessRecordG processRecordG, int i10, int i11, int i12) {
        this.f166750a = qVar;
        this.f166751b = rVar;
        this.f166752c = processRecordG;
        this.f166753d = i10;
        this.f166754e = i11;
        this.f166755f = i12;
    }

    public boolean b(IntentFilter intentFilter) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (AbstractC4181p.i(get(i10), intentFilter)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        this.f166757h = false;
        this.f166750a.o1(this.f166751b);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String str = this.f166758i;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("ReceiverList{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(' ');
        sb2.append(this.f166753d);
        sb2.append(' ');
        ProcessRecordG processRecordG = this.f166752c;
        sb2.append(processRecordG != null ? processRecordG.f166732b : "(unknown name)");
        sb2.append('/');
        sb2.append(this.f166754e);
        sb2.append("/u");
        sb2.append(this.f166755f);
        sb2.append(this.f166751b.asBinder() instanceof Binder ? " local:" : " remote:");
        sb2.append(Integer.toHexString(System.identityHashCode(this.f166751b.asBinder())));
        sb2.append('}');
        String string = sb2.toString();
        this.f166758i = string;
        return string;
    }
}
