package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.d;
import ed.InterfaceC4376a;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,226:1\n215#2,2:227\n1#3:229\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n*L\n147#1:227,2\n*E\n"})
public final class SavedStateHandlesProvider implements d.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final androidx.savedstate.d f114100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f114101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Bundle f114102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final kotlin.G f114103d;

    public SavedStateHandlesProvider(@NotNull androidx.savedstate.d savedStateRegistry, @NotNull final q0 viewModelStoreOwner) {
        kotlin.jvm.internal.G.p(savedStateRegistry, "savedStateRegistry");
        kotlin.jvm.internal.G.p(viewModelStoreOwner, "viewModelStoreOwner");
        this.f114100a = savedStateRegistry;
        this.f114103d = kotlin.I.a(new InterfaceC4376a<e0>() { // from class: androidx.lifecycle.SavedStateHandlesProvider$viewModel$2
            {
                super(0);
            }

            @NotNull
            public final e0 g() {
                return d0.e(viewModelStoreOwner);
            }

            @Override // ed.InterfaceC4376a
            public e0 invoke() {
                return d0.e(viewModelStoreOwner);
            }
        });
    }

    @Override // androidx.savedstate.d.c
    @NotNull
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f114102c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, a0> entry : c().f114323b.entrySet()) {
            String key = entry.getKey();
            Bundle bundleA = entry.getValue().f114174e.a();
            if (!kotlin.jvm.internal.G.g(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(key, bundleA);
            }
        }
        this.f114101b = false;
        return bundle;
    }

    @Nullable
    public final Bundle b(@NotNull String key) {
        kotlin.jvm.internal.G.p(key, "key");
        d();
        Bundle bundle = this.f114102c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f114102c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f114102c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f114102c = null;
        }
        return bundle2;
    }

    public final e0 c() {
        return (e0) this.f114103d.getValue();
    }

    public final void d() {
        if (this.f114101b) {
            return;
        }
        Bundle bundleB = this.f114100a.b(d0.f114318b);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f114102c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleB != null) {
            bundle.putAll(bundleB);
        }
        this.f114102c = bundle;
        this.f114101b = true;
        c();
    }
}
