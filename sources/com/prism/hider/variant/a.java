package com.prism.hider.variant;

import android.content.Context;
import android.os.Bundle;
import dagger.Component;
import javax.inject.Singleton;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static InterfaceC0685a f168415a;

    /* JADX INFO: renamed from: com.prism.hider.variant.a$a, reason: collision with other inner class name */
    @Component(modules = {X5.b.class})
    @Singleton
    public interface InterfaceC0685a {
        @Singleton
        V5.a get();
    }

    public static void a(Context context) {
        b().b().a(context, new Bundle());
    }

    public static V5.a b() {
        if (f168415a == null) {
            synchronized (a.class) {
                try {
                    if (f168415a == null) {
                        f168415a = DaggerAnalyticsVariant_AnalyticsComponent.b();
                    }
                } finally {
                }
            }
        }
        return f168415a.get();
    }
}
