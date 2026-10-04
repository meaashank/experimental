package f1;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewKt;
import dd.j;
import f1.d;
import java.util.Iterator;
import kotlin.jvm.internal.G;
import kotlin.sequences.C5001n;
import kotlin.sequences.C5004q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: f1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@j(name = "PoolingContainer")
public final class C4384a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f200381a = d.a.f200385b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f200382b = d.a.f200384a;

    @SuppressLint({"ExecutorRegistration"})
    public static final void a(@NotNull View view, @NotNull b listener) {
        G.p(view, "<this>");
        G.p(listener, "listener");
        d(view).a(listener);
    }

    public static final void b(@NotNull View view) {
        G.p(view, "<this>");
        Iterator itA = C5004q.a(((C5004q.a) ViewKt.i(view)).f218212a);
        while (true) {
            C5001n c5001n = (C5001n) itA;
            if (!c5001n.hasNext()) {
                return;
            } else {
                d((View) c5001n.next()).b();
            }
        }
    }

    public static final void c(@NotNull ViewGroup viewGroup) {
        G.p(viewGroup, "<this>");
        Iterator<View> it = new ViewGroupKt.a(viewGroup).iterator();
        while (it.hasNext()) {
            d(it.next()).b();
        }
    }

    public static final c d(View view) {
        int i10 = f200381a;
        c cVar = (c) view.getTag(i10);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        view.setTag(i10, cVar2);
        return cVar2;
    }

    public static final boolean e(@NotNull View view) {
        G.p(view, "<this>");
        Object tag = view.getTag(f200382b);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean f(@NotNull View view) {
        G.p(view, "<this>");
        for (Object obj : ViewKt.j(view)) {
            if ((obj instanceof View) && e((View) obj)) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"ExecutorRegistration"})
    public static final void g(@NotNull View view, @NotNull b listener) {
        G.p(view, "<this>");
        G.p(listener, "listener");
        d(view).c(listener);
    }

    public static final void h(@NotNull View view, boolean z10) {
        G.p(view, "<this>");
        view.setTag(f200382b, Boolean.valueOf(z10));
    }
}
