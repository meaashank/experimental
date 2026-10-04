package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.r;
import androidx.window.layout.s;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q f120152a = new q();

    @Nullable
    public final r a(@NotNull Activity activity, @NotNull FoldingFeature oemFeature) {
        s.b bVar;
        r.c cVar;
        kotlin.jvm.internal.G.p(activity, "activity");
        kotlin.jvm.internal.G.p(oemFeature, "oemFeature");
        int type = oemFeature.getType();
        if (type == 1) {
            s.b.f120169b.getClass();
            bVar = s.b.f120170c;
        } else {
            if (type != 2) {
                return null;
            }
            s.b.f120169b.getClass();
            bVar = s.b.f120171d;
        }
        int state = oemFeature.getState();
        if (state == 1) {
            cVar = r.c.f120162c;
        } else {
            if (state != 2) {
                return null;
            }
            cVar = r.c.f120163d;
        }
        Rect bounds = oemFeature.getBounds();
        kotlin.jvm.internal.G.o(bounds, "oemFeature.bounds");
        if (!c(activity, new androidx.window.core.b(bounds))) {
            return null;
        }
        Rect bounds2 = oemFeature.getBounds();
        kotlin.jvm.internal.G.o(bounds2, "oemFeature.bounds");
        return new s(new androidx.window.core.b(bounds2), bVar, cVar);
    }

    @NotNull
    public final B b(@NotNull Activity activity, @NotNull WindowLayoutInfo info) {
        r rVarA;
        kotlin.jvm.internal.G.p(activity, "activity");
        kotlin.jvm.internal.G.p(info, "info");
        List<FoldingFeature> displayFeatures = info.getDisplayFeatures();
        kotlin.jvm.internal.G.o(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature feature : displayFeatures) {
            if (feature instanceof FoldingFeature) {
                q qVar = f120152a;
                kotlin.jvm.internal.G.o(feature, "feature");
                rVarA = qVar.a(activity, feature);
            } else {
                rVarA = null;
            }
            if (rVarA != null) {
                arrayList.add(rVarA);
            }
        }
        return new B(arrayList);
    }

    public final boolean c(Activity activity, androidx.window.core.b bVar) {
        Rect rectI = G.f120088b.a(activity).f120087a.i();
        if (bVar.h()) {
            return false;
        }
        if (bVar.f() != rectI.width() && bVar.b() != rectI.height()) {
            return false;
        }
        if (bVar.f() >= rectI.width() || bVar.b() >= rectI.height()) {
            return (bVar.f() == rectI.width() && bVar.b() == rectI.height()) ? false : true;
        }
        return false;
    }
}
