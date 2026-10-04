package androidx.window.layout;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import androidx.window.core.SpecificationComputer;
import androidx.window.layout.r;
import androidx.window.layout.s;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import e.f0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class SidecarAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f120097b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f120098c = "SidecarAdapter";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SpecificationComputer.VerificationMode f120099a;

    public static final class a {
        public a() {
        }

        @f0
        @SuppressLint({"BanUncheckedReflection"})
        public final int a(@NotNull SidecarDeviceState sidecarDeviceState) {
            kotlin.jvm.internal.G.p(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    return sidecarDeviceState.posture;
                } catch (NoSuchFieldError unused) {
                    Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                    if (objInvoke != null) {
                        return ((Integer) objInvoke).intValue();
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return 0;
            }
        }

        public final int b(@NotNull SidecarDeviceState sidecarDeviceState) {
            kotlin.jvm.internal.G.p(sidecarDeviceState, "sidecarDeviceState");
            int iA = a(sidecarDeviceState);
            if (iA < 0 || iA > 4) {
                return 0;
            }
            return iA;
        }

        @f0
        @SuppressLint({"BanUncheckedReflection"})
        @NotNull
        public final List<SidecarDisplayFeature> c(@NotNull SidecarWindowLayoutInfo info) {
            kotlin.jvm.internal.G.p(info, "info");
            try {
                try {
                    List<SidecarDisplayFeature> list = info.displayFeatures;
                    return list == null ? EmptyList.f217510a : list;
                } catch (NoSuchFieldError unused) {
                    Object objInvoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(info, null);
                    if (objInvoke != null) {
                        return (List) objInvoke;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return EmptyList.f217510a;
            }
        }

        @f0
        @SuppressLint({"BanUncheckedReflection"})
        public final void d(@NotNull SidecarDeviceState sidecarDeviceState, int i10) {
            kotlin.jvm.internal.G.p(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    sidecarDeviceState.posture = i10;
                } catch (NoSuchFieldError unused) {
                    SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i10));
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @f0
        @SuppressLint({"BanUncheckedReflection"})
        public final void e(@NotNull SidecarWindowLayoutInfo info, @NotNull List<SidecarDisplayFeature> displayFeatures) {
            kotlin.jvm.internal.G.p(info, "info");
            kotlin.jvm.internal.G.p(displayFeatures, "displayFeatures");
            try {
                try {
                    info.displayFeatures = displayFeatures;
                } catch (NoSuchFieldError unused) {
                    SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(info, displayFeatures);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        public a(C4969v c4969v) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SidecarAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean a(@Nullable SidecarDeviceState sidecarDeviceState, @Nullable SidecarDeviceState sidecarDeviceState2) {
        if (kotlin.jvm.internal.G.g(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        a aVar = f120097b;
        return aVar.b(sidecarDeviceState) == aVar.b(sidecarDeviceState2);
    }

    public final boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (kotlin.jvm.internal.G.g(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return kotlin.jvm.internal.G.g(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public final boolean c(List<SidecarDisplayFeature> list, List<SidecarDisplayFeature> list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            if (!b(list.get(i10), list2.get(i10))) {
                return false;
            }
            i10 = i11;
        }
        return true;
    }

    public final boolean d(@Nullable SidecarWindowLayoutInfo sidecarWindowLayoutInfo, @Nullable SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (kotlin.jvm.internal.G.g(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        a aVar = f120097b;
        return c(aVar.c(sidecarWindowLayoutInfo), aVar.c(sidecarWindowLayoutInfo2));
    }

    @NotNull
    public final B e(@Nullable SidecarWindowLayoutInfo sidecarWindowLayoutInfo, @NotNull SidecarDeviceState state) {
        kotlin.jvm.internal.G.p(state, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new B(EmptyList.f217510a);
        }
        SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
        a aVar = f120097b;
        aVar.d(sidecarDeviceState, aVar.b(state));
        return new B(f(aVar.c(sidecarWindowLayoutInfo), sidecarDeviceState));
    }

    @NotNull
    public final List<m> f(@NotNull List<SidecarDisplayFeature> sidecarDisplayFeatures, @NotNull SidecarDeviceState deviceState) {
        kotlin.jvm.internal.G.p(sidecarDisplayFeatures, "sidecarDisplayFeatures");
        kotlin.jvm.internal.G.p(deviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sidecarDisplayFeatures.iterator();
        while (it.hasNext()) {
            m mVarG = g((SidecarDisplayFeature) it.next(), deviceState);
            if (mVarG != null) {
                arrayList.add(mVarG);
            }
        }
        return arrayList;
    }

    @Nullable
    public final m g(@NotNull SidecarDisplayFeature feature, @NotNull SidecarDeviceState deviceState) {
        s.b bVar;
        r.c cVar;
        kotlin.jvm.internal.G.p(feature, "feature");
        kotlin.jvm.internal.G.p(deviceState, "deviceState");
        SpecificationComputer.a aVar = SpecificationComputer.f120052a;
        String TAG = f120098c;
        kotlin.jvm.internal.G.o(TAG, "TAG");
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) SpecificationComputer.a.b(aVar, feature, TAG, this.f120099a, null, 4, null).c("Type must be either TYPE_FOLD or TYPE_HINGE", new ed.l<SidecarDisplayFeature, Boolean>() { // from class: androidx.window.layout.SidecarAdapter$translate$checkedFeature$1
            @Override // ed.l
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull SidecarDisplayFeature require) {
                kotlin.jvm.internal.G.p(require, "$this$require");
                boolean z10 = true;
                if (require.getType() != 1 && require.getType() != 2) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        }).c("Feature bounds must not be 0", new ed.l<SidecarDisplayFeature, Boolean>() { // from class: androidx.window.layout.SidecarAdapter$translate$checkedFeature$2
            @Override // ed.l
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull SidecarDisplayFeature require) {
                kotlin.jvm.internal.G.p(require, "$this$require");
                return Boolean.valueOf((require.getRect().width() == 0 && require.getRect().height() == 0) ? false : true);
            }
        }).c("TYPE_FOLD must have 0 area", new ed.l<SidecarDisplayFeature, Boolean>() { // from class: androidx.window.layout.SidecarAdapter$translate$checkedFeature$3
            @Override // ed.l
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull SidecarDisplayFeature require) {
                kotlin.jvm.internal.G.p(require, "$this$require");
                boolean z10 = true;
                if (require.getType() == 1 && require.getRect().width() != 0 && require.getRect().height() != 0) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        }).c("Feature be pinned to either left or top", new ed.l<SidecarDisplayFeature, Boolean>() { // from class: androidx.window.layout.SidecarAdapter$translate$checkedFeature$4
            @Override // ed.l
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull SidecarDisplayFeature require) {
                kotlin.jvm.internal.G.p(require, "$this$require");
                return Boolean.valueOf(require.getRect().left == 0 || require.getRect().top == 0);
            }
        }).a();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
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
        int iB = f120097b.b(deviceState);
        if (iB == 0 || iB == 1) {
            return null;
        }
        if (iB == 2) {
            cVar = r.c.f120163d;
        } else {
            if (iB != 3 && iB == 4) {
                return null;
            }
            cVar = r.c.f120162c;
        }
        Rect rect = feature.getRect();
        kotlin.jvm.internal.G.o(rect, "feature.rect");
        return new s(new androidx.window.core.b(rect), bVar, cVar);
    }

    public SidecarAdapter(@NotNull SpecificationComputer.VerificationMode verificationMode) {
        kotlin.jvm.internal.G.p(verificationMode, "verificationMode");
        this.f120099a = verificationMode;
    }

    public /* synthetic */ SidecarAdapter(SpecificationComputer.VerificationMode verificationMode, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? SpecificationComputer.VerificationMode.QUIET : verificationMode);
    }
}
