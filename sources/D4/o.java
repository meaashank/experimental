package d4;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import ed.InterfaceC4376a;
import kotlin.L0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    @V({"SMAP\nViewExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewExtensions.kt\ncom/cookiegames/smartcookie/extensions/ViewExtensionsKt$doOnLayout$1$1\n*L\n1#1,28:1\n*E\n"})
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f194732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4376a<L0> f194733b;

        public a(View view, InterfaceC4376a<L0> interfaceC4376a) {
            this.f194732a = view;
            this.f194733b = interfaceC4376a;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f194732a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f194733b.invoke();
        }
    }

    @Nullable
    public static final L0 a(@Nullable View view, @NotNull InterfaceC4376a<L0> runnable) {
        G.p(runnable, "runnable");
        if (view == null) {
            return null;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new a(view, runnable));
        return L0.f217464a;
    }

    @Nullable
    public static final L0 b(@Nullable View view) {
        if (view != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
                return L0.f217464a;
            }
        }
        return null;
    }
}
