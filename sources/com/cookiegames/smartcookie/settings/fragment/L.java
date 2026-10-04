package com.cookiegames.smartcookie.settings.fragment;

import bc.InterfaceC2856f;
import javax.inject.Provider;
import u4.C5645a;

/* JADX INFO: loaded from: classes3.dex */
public final class L implements InterfaceC2856f<K> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<C5645a> f147998a;

    public L(Provider<C5645a> provider) {
        this.f147998a = provider;
    }

    public static InterfaceC2856f<K> a(Provider<C5645a> provider) {
        return new L(provider);
    }

    public static void b(K k10, C5645a c5645a) {
        k10.f147993p = c5645a;
    }

    @Override // bc.InterfaceC2856f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(K k10) {
        k10.f147993p = this.f147998a.get();
    }
}
