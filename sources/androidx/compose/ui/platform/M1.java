package androidx.compose.ui.platform;

import android.view.View;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@e.f0
public interface M1 extends androidx.compose.ui.node.v0 {

    /* JADX INFO: renamed from: U2, reason: collision with root package name */
    @NotNull
    public static final a f103607U2 = a.f103608a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f103608a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public static ed.l<? super M1, kotlin.L0> f103609b;

        @e.f0
        public static /* synthetic */ void b() {
        }

        @Nullable
        public final ed.l<M1, kotlin.L0> a() {
            return f103609b;
        }

        public final void c(@Nullable ed.l<? super M1, kotlin.L0> lVar) {
            f103609b = lVar;
        }
    }

    boolean e();

    void e0();

    boolean f0();

    @NotNull
    View getView();
}
