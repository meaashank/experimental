package K2;

import K2.k;
import android.util.Log;
import androidx.core.util.C2428e;
import androidx.window.embedding.EmbeddingRule;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.util.Set;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.window.core.d
public final class j implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f58345c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f58346d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f58347e = "EmbeddingCompat";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ActivityEmbeddingComponent f58348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final h f58349b;

    public static final class a {
        public a() {
        }

        @NotNull
        public final ActivityEmbeddingComponent a() {
            if (!c()) {
                return new m();
            }
            ActivityEmbeddingComponent activityEmbeddingComponent = WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent();
            return activityEmbeddingComponent == null ? new m() : activityEmbeddingComponent;
        }

        @Nullable
        public final Integer b() {
            try {
                return Integer.valueOf(WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel());
            } catch (NoClassDefFoundError unused) {
                Log.d(j.f58347e, "Embedding extension version not found");
                return null;
            } catch (UnsupportedOperationException unused2) {
                Log.d(j.f58347e, "Stub Extension");
                return null;
            }
        }

        public final boolean c() {
            try {
                return WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent() != null;
            } catch (NoClassDefFoundError unused) {
                Log.d(j.f58347e, "Embedding extension version not found");
                return false;
            } catch (UnsupportedOperationException unused2) {
                Log.d(j.f58347e, "Stub Extension");
                return false;
            }
        }

        public a(C4969v c4969v) {
        }
    }

    public j(@NotNull ActivityEmbeddingComponent embeddingExtension, @NotNull h adapter) {
        G.p(embeddingExtension, "embeddingExtension");
        G.p(adapter, "adapter");
        this.f58348a = embeddingExtension;
        this.f58349b = adapter;
    }

    @Override // K2.k
    public void a(@NotNull Set<? extends EmbeddingRule> rules) {
        G.p(rules, "rules");
        this.f58348a.setEmbeddingRules(this.f58349b.j(rules));
    }

    @Override // K2.k
    public void b(@NotNull k.a embeddingCallback) {
        G.p(embeddingCallback, "embeddingCallback");
        this.f58348a.setSplitInfoCallback(C2428e.a(new l(embeddingCallback, this.f58349b)));
    }

    public j() {
        this(f58345c.a(), new h());
    }
}
