package com.cookiegames.smartcookie.settings.fragment;

import android.os.Bundle;
import com.cookiegames.smartcookie.p;
import d4.C4297a;
import javax.inject.Inject;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u4.C5645a;

/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class K extends AbstractC3170i {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final a f147990q = new a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f147991r = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final String f147992s = "leak_canary_enabled";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Inject
    public C5645a f147993p;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public static final kotlin.L0 Z(K k10, boolean z10) {
        androidx.fragment.app.r activity = k10.getActivity();
        if (activity != null) {
            C4297a.a(activity, p.s.f145491K0);
        }
        k10.Y().f(z10);
        return kotlin.L0.f217464a;
    }

    @NotNull
    public final C5645a Y() {
        C5645a c5645a = this.f147993p;
        if (c5645a != null) {
            return c5645a;
        }
        kotlin.jvm.internal.G.S("developerPreferences");
        throw null;
    }

    public final void a0(@NotNull C5645a c5645a) {
        kotlin.jvm.internal.G.p(c5645a, "<set-?>");
        this.f147993p = c5645a;
    }

    @Override // com.cookiegames.smartcookie.settings.fragment.AbstractC3170i, androidx.preference.n, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        com.cookiegames.smartcookie.di.K.c(this).d(this);
        AbstractC3170i.V(this, f147992s, Y().c(), false, new ed.l() { // from class: com.cookiegames.smartcookie.settings.fragment.J
            @Override // ed.l
            public final Object invoke(Object obj) {
                return K.Z(this.f147984a, ((Boolean) obj).booleanValue());
            }
        }, 4, null);
    }

    @Override // androidx.preference.n
    public void u(@Nullable Bundle bundle, @Nullable String str) {
        l(p.v.f147667g);
    }
}
