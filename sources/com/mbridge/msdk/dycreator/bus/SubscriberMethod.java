package com.mbridge.msdk.dycreator.bus;

import H3.b;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
final class SubscriberMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Method f155725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ThreadMode f155726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Class<?> f155727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f155728d;

    public SubscriberMethod(Method method, ThreadMode threadMode, Class<?> cls) {
        this.f155725a = method;
        this.f155726b = threadMode;
        this.f155727c = cls;
    }

    private synchronized void a() {
        if (this.f155728d == null) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(this.f155725a.getDeclaringClass().getName());
            sb2.append(b.f45548j);
            sb2.append(this.f155725a.getName());
            sb2.append('(');
            sb2.append(this.f155727c.getName());
            this.f155728d = sb2.toString();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SubscriberMethod)) {
            return false;
        }
        a();
        return this.f155728d.equals(((SubscriberMethod) obj).f155728d);
    }

    public int hashCode() {
        return this.f155725a.hashCode();
    }
}
