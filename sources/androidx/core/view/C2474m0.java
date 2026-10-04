package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: androidx.core.view.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2474m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f111940a;

    /* JADX INFO: renamed from: androidx.core.view.m0$a */
    @e.T(20)
    public static class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final View f111941a;

        public a(@Nullable View view) {
            this.f111941a = view;
        }

        @Override // androidx.core.view.C2474m0.c
        public void a() {
            View view = this.f111941a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService(G7.a.f45348f)).hideSoftInputFromWindow(this.f111941a.getWindowToken(), 0);
            }
        }

        @Override // androidx.core.view.C2474m0.c
        public void b() {
            final View viewFindViewById = this.f111941a;
            if (viewFindViewById == null) {
                return;
            }
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = viewFindViewById.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.f111941a.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new Runnable() { // from class: androidx.core.view.l0
                @Override // java.lang.Runnable
                public final void run() {
                    View view = viewFindViewById;
                    ((InputMethodManager) view.getContext().getSystemService(G7.a.f45348f)).showSoftInput(view, 0);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.m0$c */
    public static class c {
        public void a() {
        }

        public void b() {
        }
    }

    public C2474m0(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f111940a = new b(view);
        } else {
            this.f111940a = new a(view);
        }
    }

    public void a() {
        this.f111940a.a();
    }

    public void b() {
        this.f111940a.b();
    }

    /* JADX INFO: renamed from: androidx.core.view.m0$b */
    @e.T(30)
    public static class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public View f111942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public WindowInsetsController f111943c;

        public b(@NonNull View view) {
            super(view);
            this.f111942b = view;
        }

        @Override // androidx.core.view.C2474m0.a, androidx.core.view.C2474m0.c
        public void a() {
            View view;
            WindowInsetsController windowInsetsController = this.f111943c;
            if (windowInsetsController == null) {
                View view2 = this.f111942b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.s0
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i10) {
                    atomicBoolean.set((i10 & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.f111942b) != null) {
                ((InputMethodManager) view.getContext().getSystemService(G7.a.f45348f)).hideSoftInputFromWindow(this.f111942b.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        @Override // androidx.core.view.C2474m0.a, androidx.core.view.C2474m0.c
        public void b() {
            View view = this.f111942b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService(G7.a.f45348f)).isActive();
            }
            WindowInsetsController windowInsetsController = this.f111943c;
            if (windowInsetsController == null) {
                View view2 = this.f111942b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.b();
        }

        public b(@Nullable WindowInsetsController windowInsetsController) {
            super(null);
            this.f111943c = windowInsetsController;
        }
    }

    @e.T(30)
    @Deprecated
    public C2474m0(@NonNull WindowInsetsController windowInsetsController) {
        this.f111940a = new b(windowInsetsController);
    }
}
