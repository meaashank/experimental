package com.prism.gaia.server.am;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f166626b = "asdf-".concat(A.class.getSimpleName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final A f166627c = new A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Integer, Set<String>> f166628a = new HashMap();

    public static A b() {
        return f166627c;
    }

    public void a(int i10) {
        synchronized (this.f166628a) {
            this.f166628a.remove(Integer.valueOf(i10));
        }
    }

    public void c(int i10, String str) {
        if (str == null || i10 <= 0) {
            return;
        }
        synchronized (this.f166628a) {
            try {
                Set<String> hashSet = this.f166628a.get(Integer.valueOf(i10));
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                    this.f166628a.put(Integer.valueOf(i10), hashSet);
                }
                hashSet.add(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean d(int i10, String str) {
        boolean z10 = false;
        if (str == null) {
            return false;
        }
        synchronized (this.f166628a) {
            try {
                Set<String> set = this.f166628a.get(Integer.valueOf(i10));
                if (set != null && set.contains(str)) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }
}
