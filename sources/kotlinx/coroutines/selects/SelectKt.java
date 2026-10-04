package kotlinx.coroutines.selects;

import ed.q;
import kotlin.L0;
import kotlinx.coroutines.InterfaceC5100n;
import kotlinx.coroutines.InterfaceC5120x0;
import kotlinx.coroutines.internal.Q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class SelectKt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f220707b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f220708c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f220709d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f220710e = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q<Object, Object, Object, Object> f220706a = new q() { // from class: kotlinx.coroutines.selects.SelectKt$DUMMY_PROCESS_RESULT_FUNCTION$1
        @Nullable
        public final Void e(@NotNull Object obj, @Nullable Object obj2, @Nullable Object obj3) {
            return null;
        }

        @Override // ed.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Q f220711f = new Q("STATE_REG");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Q f220712g = new Q("STATE_COMPLETED");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Q f220713h = new Q("STATE_CANCELLED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Q f220714i = new Q("NO_RESULT");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Q f220715j = new Q("PARAM_CLAUSE_0");

    @InterfaceC5120x0
    public static /* synthetic */ void a() {
    }

    @InterfaceC5120x0
    public static /* synthetic */ void b() {
    }

    @InterfaceC5120x0
    public static /* synthetic */ void c() {
    }

    public static final TrySelectDetailedResult d(int i10) {
        if (i10 == 0) {
            return TrySelectDetailedResult.SUCCESSFUL;
        }
        if (i10 == 1) {
            return TrySelectDetailedResult.REREGISTER;
        }
        if (i10 == 2) {
            return TrySelectDetailedResult.CANCELLED;
        }
        if (i10 == 3) {
            return TrySelectDetailedResult.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i10).toString());
    }

    @NotNull
    public static final Q l() {
        return f220715j;
    }

    @Nullable
    public static final <R> Object m(@NotNull ed.l<? super b<? super R>, L0> lVar, @NotNull kotlin.coroutines.e<? super R> eVar) {
        SelectImplementation selectImplementation = new SelectImplementation(eVar.getContext());
        lVar.invoke(selectImplementation);
        return SelectImplementation.x(selectImplementation, eVar);
    }

    public static final <R> Object n(ed.l<? super b<? super R>, L0> lVar, kotlin.coroutines.e<? super R> eVar) {
        throw null;
    }

    public static final boolean o(InterfaceC5100n<? super L0> interfaceC5100n, ed.l<? super Throwable, L0> lVar) {
        Object objH0 = interfaceC5100n.h0(L0.f217464a, null, lVar);
        if (objH0 == null) {
            return false;
        }
        interfaceC5100n.c0(objH0);
        return true;
    }
}
