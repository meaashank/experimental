package com.prism.gaia.server.am;

import android.os.IBinder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: renamed from: com.prism.gaia.server.am.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4145d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f166821d = "AlarmSlots";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f166822e = 32;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f166823f = 450;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, LinkedHashSet<IBinder>> f166824a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<String> f166825b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f166826c = 0;

    public static String c(String str, int i10) {
        return str + "|" + i10;
    }

    public synchronized String a() {
        StringBuilder sb2;
        try {
            sb2 = new StringBuilder("alarm slots total=");
            sb2.append(this.f166826c);
            for (Map.Entry<String, LinkedHashSet<IBinder>> entry : this.f166824a.entrySet()) {
                sb2.append(' ');
                sb2.append(entry.getKey());
                sb2.append(SignatureVisitor.INSTANCEOF);
                sb2.append(entry.getValue().size());
            }
        } catch (Throwable th) {
            throw th;
        }
        return sb2.toString();
    }

    public synchronized boolean b(String str, int i10) {
        return this.f166825b.add(c(str, i10));
    }

    public final void d(LinkedHashSet<IBinder> linkedHashSet, E e10) {
        Iterator<IBinder> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (e10.h(it.next()) == null) {
                it.remove();
                this.f166826c--;
            }
        }
    }

    public synchronized void e(String str, int i10, IBinder iBinder) {
        LinkedHashSet<IBinder> linkedHashSet = this.f166824a.get(c(str, i10));
        if (linkedHashSet != null && linkedHashSet.remove(iBinder)) {
            this.f166826c--;
        }
    }

    public synchronized void f(String str, int i10) {
        try {
            Iterator<Map.Entry<String, LinkedHashSet<IBinder>>> it = this.f166824a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, LinkedHashSet<IBinder>> next = it.next();
                if (!next.getKey().equals(c(str, i10))) {
                    if (i10 == Integer.MIN_VALUE) {
                        if (next.getKey().startsWith(str + "|")) {
                        }
                    }
                }
                this.f166826c -= next.getValue().size();
                it.remove();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized String g(String str, int i10, IBinder iBinder, E e10) {
        try {
            String strC = c(str, i10);
            LinkedHashSet<IBinder> linkedHashSet = this.f166824a.get(strC);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>();
                this.f166824a.put(strC, linkedHashSet);
            }
            if (linkedHashSet.contains(iBinder)) {
                return null;
            }
            d(linkedHashSet, e10);
            if (linkedHashSet.size() >= 32) {
                return "clone " + strC + " already holds " + linkedHashSet.size() + " alarms (quota 32)";
            }
            if (this.f166826c < 450) {
                linkedHashSet.add(iBinder);
                this.f166826c++;
                return null;
            }
            return "all clones together hold " + this.f166826c + " alarms (guard 450 of the uid's 500)";
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int h() {
        return this.f166826c;
    }
}
