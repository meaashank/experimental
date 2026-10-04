package com.tonyodev.fetch2;

import Ab.f;
import Eb.C1021v1;
import Eb.C1024w1;
import Jb.g;
import Jb.j;
import Jb.k;
import android.annotation.SuppressLint;
import com.tonyodev.fetch2.database.DownloadInfo;
import com.tonyodev.fetch2.exception.FetchException;
import com.tonyodev.fetch2core.DownloadBlock;
import com.tonyodev.fetch2core.Downloader;
import com.tonyodev.fetch2core.Extras;
import com.tonyodev.fetch2core.FileResource;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C0703b f194391a = C0703b.f194392a;

    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b A(b bVar, int i10, List list, k kVar, k kVar2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeAllInGroupWithStatus");
            }
            if ((i11 & 8) != 0) {
                kVar2 = null;
            }
            return bVar.m0(i10, list, kVar, kVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b B(b bVar, Status status, k kVar, k kVar2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeAllWithStatus");
            }
            if ((i10 & 2) != 0) {
                kVar = null;
            }
            if ((i10 & 4) != 0) {
                kVar2 = null;
            }
            return bVar.U(status, kVar, kVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b C(b bVar, int i10, k kVar, k kVar2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeGroup");
            }
            if ((i11 & 2) != 0) {
                kVar = null;
            }
            if ((i11 & 4) != 0) {
                kVar2 = null;
            }
            return bVar.w0(i10, kVar, kVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b D(b bVar, int i10, String str, k kVar, k kVar2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renameCompletedDownloadFile");
            }
            if ((i11 & 4) != 0) {
                kVar = null;
            }
            if ((i11 & 8) != 0) {
                kVar2 = null;
            }
            return bVar.b0(i10, str, kVar, kVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b E(b bVar, int i10, Extras extras, k kVar, k kVar2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceExtras");
            }
            if ((i11 & 4) != 0) {
                kVar = null;
            }
            if ((i11 & 8) != 0) {
                kVar2 = null;
            }
            return bVar.c(i10, extras, kVar, kVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b F(b bVar, int i10, boolean z10, j jVar, k kVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resetAutoRetryAttempts");
            }
            if ((i11 & 2) != 0) {
                z10 = true;
            }
            if ((i11 & 4) != 0) {
                jVar = null;
            }
            if ((i11 & 8) != 0) {
                kVar = null;
            }
            return bVar.P(i10, z10, jVar, kVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b G(b bVar, int i10, k kVar, k kVar2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resume");
            }
            if ((i11 & 2) != 0) {
                kVar = null;
            }
            if ((i11 & 4) != 0) {
                kVar2 = null;
            }
            return bVar.n(i10, kVar, kVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b H(b bVar, List list, k kVar, k kVar2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resume");
            }
            if ((i10 & 2) != 0) {
                kVar = null;
            }
            if ((i10 & 4) != 0) {
                kVar2 = null;
            }
            return bVar.z0(list, kVar, kVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b I(b bVar, int i10, k kVar, k kVar2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeGroup");
            }
            if ((i11 & 2) != 0) {
                kVar = null;
            }
            if ((i11 & 4) != 0) {
                kVar2 = null;
            }
            return bVar.D0(i10, kVar, kVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b J(b bVar, int i10, k kVar, k kVar2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retry");
            }
            if ((i11 & 2) != 0) {
                kVar = null;
            }
            if ((i11 & 4) != 0) {
                kVar2 = null;
            }
            return bVar.f0(i10, kVar, kVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b K(b bVar, List list, k kVar, k kVar2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retry");
            }
            if ((i10 & 2) != 0) {
                kVar = null;
            }
            if ((i10 & 4) != 0) {
                kVar2 = null;
            }
            return bVar.u0(list, kVar, kVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b L(b bVar, k kVar, k kVar2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unfreeze");
            }
            if ((i10 & 1) != 0) {
                kVar = null;
            }
            if ((i10 & 2) != 0) {
                kVar2 = null;
            }
            return bVar.L(kVar, kVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b M(b bVar, int i10, Request request, boolean z10, k kVar, k kVar2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateRequest");
            }
            if ((i11 & 4) != 0) {
                z10 = true;
            }
            return bVar.F0(i10, request, z10, (i11 & 8) != 0 ? null : kVar, (i11 & 16) != 0 ? null : kVar2);
        }

        public static /* synthetic */ b a(b bVar, boolean z10, g gVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addActiveDownloadsObserver");
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return bVar.s0(z10, gVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b b(b bVar, CompletedDownload completedDownload, boolean z10, k kVar, k kVar2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addCompletedDownload");
            }
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            if ((i10 & 4) != 0) {
                kVar = null;
            }
            if ((i10 & 8) != 0) {
                kVar2 = null;
            }
            return bVar.g(completedDownload, z10, kVar, kVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b c(b bVar, List list, boolean z10, k kVar, k kVar2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addCompletedDownloads");
            }
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            if ((i10 & 4) != 0) {
                kVar = null;
            }
            if ((i10 & 8) != 0) {
                kVar2 = null;
            }
            return bVar.E(list, z10, kVar, kVar2);
        }

        public static /* synthetic */ b d(b bVar, Ab.j jVar, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addListener");
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return bVar.D(jVar, z10);
        }

        public static /* synthetic */ b e(b bVar, Ab.j jVar, boolean z10, boolean z11, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addListener");
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return bVar.O(jVar, z10, z11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b f(b bVar, int i10, k kVar, k kVar2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i11 & 2) != 0) {
                kVar = null;
            }
            if ((i11 & 4) != 0) {
                kVar2 = null;
            }
            return bVar.o(i10, kVar, kVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b g(b bVar, List list, k kVar, k kVar2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 2) != 0) {
                kVar = null;
            }
            if ((i10 & 4) != 0) {
                kVar2 = null;
            }
            return bVar.s(list, kVar, kVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b h(b bVar, k kVar, k kVar2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancelAll");
            }
            if ((i10 & 1) != 0) {
                kVar = null;
            }
            if ((i10 & 2) != 0) {
                kVar2 = null;
            }
            return bVar.l0(kVar, kVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b i(b bVar, int i10, k kVar, k kVar2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancelGroup");
            }
            if ((i11 & 2) != 0) {
                kVar = null;
            }
            if ((i11 & 4) != 0) {
                kVar2 = null;
            }
            return bVar.v0(i10, kVar, kVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b j(b bVar, int i10, k kVar, k kVar2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i11 & 2) != 0) {
                kVar = null;
            }
            if ((i11 & 4) != 0) {
                kVar2 = null;
            }
            return bVar.y0(i10, kVar, kVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b k(b bVar, List list, k kVar, k kVar2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i10 & 2) != 0) {
                kVar = null;
            }
            if ((i10 & 4) != 0) {
                kVar2 = null;
            }
            return bVar.h0(list, kVar, kVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b l(b bVar, k kVar, k kVar2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteAll");
            }
            if ((i10 & 1) != 0) {
                kVar = null;
            }
            if ((i10 & 2) != 0) {
                kVar2 = null;
            }
            return bVar.G0(kVar, kVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b m(b bVar, int i10, List list, k kVar, k kVar2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteAllInGroupWithStatus");
            }
            if ((i11 & 8) != 0) {
                kVar2 = null;
            }
            return bVar.u(i10, list, kVar, kVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b n(b bVar, Status status, k kVar, k kVar2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteAllWithStatus");
            }
            if ((i10 & 2) != 0) {
                kVar = null;
            }
            if ((i10 & 4) != 0) {
                kVar2 = null;
            }
            return bVar.H0(status, kVar, kVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b o(b bVar, int i10, k kVar, k kVar2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteGroup");
            }
            if ((i11 & 2) != 0) {
                kVar = null;
            }
            if ((i11 & 4) != 0) {
                kVar2 = null;
            }
            return bVar.x0(i10, kVar, kVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b p(b bVar, Request request, k kVar, k kVar2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueue");
            }
            if ((i10 & 2) != 0) {
                kVar = null;
            }
            if ((i10 & 4) != 0) {
                kVar2 = null;
            }
            return bVar.G(request, kVar, kVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b q(b bVar, List list, k kVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueue");
            }
            if ((i10 & 2) != 0) {
                kVar = null;
            }
            return bVar.C0(list, kVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b r(b bVar, k kVar, k kVar2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: freeze");
            }
            if ((i10 & 1) != 0) {
                kVar = null;
            }
            if ((i10 & 2) != 0) {
                kVar2 = null;
            }
            return bVar.I(kVar, kVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b s(b bVar, Request request, k kVar, k kVar2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFetchFileServerCatalog");
            }
            if ((i10 & 4) != 0) {
                kVar2 = null;
            }
            return bVar.E0(request, kVar, kVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b t(b bVar, String str, Map map, k kVar, k kVar2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getServerResponse");
            }
            if ((i10 & 8) != 0) {
                kVar2 = null;
            }
            return bVar.f(str, map, kVar, kVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b u(b bVar, int i10, k kVar, k kVar2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pause");
            }
            if ((i11 & 2) != 0) {
                kVar = null;
            }
            if ((i11 & 4) != 0) {
                kVar2 = null;
            }
            return bVar.q0(i10, kVar, kVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b v(b bVar, List list, k kVar, k kVar2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pause");
            }
            if ((i10 & 2) != 0) {
                kVar = null;
            }
            if ((i10 & 4) != 0) {
                kVar2 = null;
            }
            return bVar.W(list, kVar, kVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b w(b bVar, int i10, k kVar, k kVar2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pauseGroup");
            }
            if ((i11 & 2) != 0) {
                kVar = null;
            }
            if ((i11 & 4) != 0) {
                kVar2 = null;
            }
            return bVar.C(i10, kVar, kVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b x(b bVar, int i10, k kVar, k kVar2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: remove");
            }
            if ((i11 & 2) != 0) {
                kVar = null;
            }
            if ((i11 & 4) != 0) {
                kVar2 = null;
            }
            return bVar.M(i10, kVar, kVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b y(b bVar, List list, k kVar, k kVar2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: remove");
            }
            if ((i10 & 2) != 0) {
                kVar = null;
            }
            if ((i10 & 4) != 0) {
                kVar2 = null;
            }
            return bVar.J0(list, kVar, kVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b z(b bVar, k kVar, k kVar2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeAll");
            }
            if ((i10 & 1) != 0) {
                kVar = null;
            }
            if ((i10 & 2) != 0) {
                kVar2 = null;
            }
            return bVar.r(kVar, kVar2);
        }
    }

    /* JADX INFO: renamed from: com.tonyodev.fetch2.b$b, reason: collision with other inner class name */
    public static final class C0703b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ C0703b f194392a = new C0703b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final Object f194393b = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SuppressLint({"StaticFieldLeak"})
        @Nullable
        public static volatile FetchConfiguration f194394c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public static volatile b f194395d;

        @Nullable
        public final FetchConfiguration a() {
            FetchConfiguration fetchConfiguration;
            synchronized (f194393b) {
                fetchConfiguration = f194394c;
            }
            return fetchConfiguration;
        }

        @NotNull
        public final b b() {
            b bVarA;
            synchronized (f194393b) {
                try {
                    FetchConfiguration fetchConfiguration = f194394c;
                    if (fetchConfiguration == null) {
                        throw new FetchException(Jb.d.f58194v);
                    }
                    bVarA = f194395d;
                    if (bVarA == null || bVarA.isClosed()) {
                        bVarA = C1021v1.f33744n.a(C1024w1.f33761a.a(fetchConfiguration));
                        f194395d = bVarA;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bVarA;
        }

        @NotNull
        public final b c(@NotNull FetchConfiguration fetchConfiguration) {
            G.p(fetchConfiguration, "fetchConfiguration");
            return C1021v1.f33744n.a(C1024w1.f33761a.a(fetchConfiguration));
        }

        public final void d(@NotNull FetchConfiguration fetchConfiguration) {
            G.p(fetchConfiguration, "fetchConfiguration");
            synchronized (f194393b) {
                f194394c = fetchConfiguration;
            }
        }
    }

    @NotNull
    b A(int i10, @NotNull List<? extends Status> list, @NotNull k<List<Download>> kVar);

    void A0(@NotNull List<? extends Request> list, @Nullable k<List<Pair<DownloadInfo, Boolean>>> kVar);

    @NotNull
    b B(@NotNull List<Integer> list);

    @NotNull
    b B0(int i10);

    @NotNull
    b C(int i10, @Nullable k<List<Download>> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b C0(@NotNull List<? extends Request> list, @Nullable k<List<Pair<Request, Error>>> kVar);

    @NotNull
    b D(@NotNull Ab.j jVar, boolean z10);

    @NotNull
    b D0(int i10, @Nullable k<List<Download>> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b E(@NotNull List<? extends CompletedDownload> list, boolean z10, @Nullable k<List<Download>> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b E0(@NotNull Request request, @NotNull k<List<FileResource>> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b F(int i10);

    @NotNull
    b F0(int i10, @NotNull Request request, boolean z10, @Nullable k<Download> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b G(@NotNull Request request, @Nullable k<Request> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b G0(@Nullable k<List<Download>> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b H();

    @NotNull
    b H0(@NotNull Status status, @Nullable k<List<Download>> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b I(@Nullable k<Boolean> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b I0(@NotNull List<Integer> list, @NotNull k<List<Download>> kVar);

    @NotNull
    b J(boolean z10);

    @NotNull
    b J0(@NotNull List<Integer> list, @Nullable k<List<Download>> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b K();

    @NotNull
    b K0(boolean z10, @NotNull k<Boolean> kVar);

    @NotNull
    b L(@Nullable k<Boolean> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b L0(int i10);

    @NotNull
    b M(int i10, @Nullable k<Download> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b N();

    @NotNull
    b O(@NotNull Ab.j jVar, boolean z10, boolean z11);

    @NotNull
    b P(int i10, boolean z10, @Nullable j<Download> jVar, @Nullable k<Error> kVar);

    @NotNull
    b Q(int i10, @NotNull g<Download>... gVarArr);

    void R(long j10);

    @NotNull
    b S(@NotNull Ab.j jVar);

    @NotNull
    b T(@NotNull g<Boolean> gVar);

    @NotNull
    b U(@NotNull Status status, @Nullable k<List<Download>> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b V(int i10, @NotNull List<? extends Status> list);

    @NotNull
    b W(@NotNull List<Integer> list, @Nullable k<List<Download>> kVar, @Nullable k<Error> kVar2);

    @NotNull
    Set<Ab.j> X();

    @NotNull
    b Y(int i10);

    @NotNull
    b Z(@NotNull List<Integer> list);

    @NotNull
    b a(long j10, @NotNull k<List<Download>> kVar);

    @NotNull
    b a0(@NotNull List<Integer> list);

    @NotNull
    b b(int i10);

    @NotNull
    b b0(int i10, @NotNull String str, @Nullable k<Download> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b c(int i10, @NotNull Extras extras, @Nullable k<Download> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b c0(@NotNull List<Integer> list);

    @NotNull
    b cancelAll();

    void close();

    @NotNull
    b d(int i10, @NotNull g<Download>... gVarArr);

    @NotNull
    b d0(int i10, @NotNull k<List<DownloadBlock>> kVar);

    @NotNull
    b e(int i10);

    void e0();

    @NotNull
    b f(@NotNull String str, @Nullable Map<String, String> map, @NotNull k<Downloader.a> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b f0(int i10, @Nullable k<Download> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b freeze();

    @NotNull
    b g(@NotNull CompletedDownload completedDownload, boolean z10, @Nullable k<Download> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b g0(@NotNull Status status);

    @NotNull
    String getNamespace();

    @NotNull
    b h(int i10);

    @NotNull
    b h0(@NotNull List<Integer> list, @Nullable k<List<Download>> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b i(@NotNull NetworkType networkType);

    @NotNull
    b i0(@NotNull Ab.j jVar);

    boolean isClosed();

    @NotNull
    b j(@NotNull Status status);

    @NotNull
    b j0(int i10);

    @NotNull
    b k(@NotNull k<List<Integer>> kVar);

    @NotNull
    b k0(@NotNull List<Integer> list);

    @NotNull
    b l(@NotNull k<List<Download>> kVar);

    @NotNull
    b l0(@Nullable k<List<Download>> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b m(@NotNull Request request, boolean z10, @NotNull k<Long> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b m0(int i10, @NotNull List<? extends Status> list, @Nullable k<List<Download>> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b n(int i10, @Nullable k<Download> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b n0(int i10);

    @NotNull
    b o(int i10, @Nullable k<Download> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b o0(@NotNull List<Integer> list);

    @NotNull
    b p(int i10, @NotNull k<f> kVar);

    @NotNull
    b p0(int i10, @NotNull List<? extends Status> list);

    @NotNull
    b q(@NotNull Status status, @NotNull k<List<Download>> kVar);

    @NotNull
    b q0(int i10, @Nullable k<Download> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b r(@Nullable k<List<Download>> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b r0(@NotNull List<? extends Status> list, @NotNull k<List<Download>> kVar);

    @NotNull
    b remove(int i10);

    @NotNull
    b removeAll();

    @NotNull
    b removeGroup(int i10);

    @NotNull
    b s(@NotNull List<Integer> list, @Nullable k<List<Download>> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b s0(boolean z10, @NotNull g<Boolean> gVar);

    @NotNull
    b t(int i10);

    @NotNull
    b t0(@NotNull String str, @NotNull k<List<Download>> kVar);

    @NotNull
    b u(int i10, @NotNull List<? extends Status> list, @Nullable k<List<Download>> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b u0(@NotNull List<Integer> list, @Nullable k<List<Download>> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b v(int i10, @NotNull k<List<Download>> kVar);

    @NotNull
    b v0(int i10, @Nullable k<List<Download>> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b w(int i10, @NotNull j<Download> jVar);

    @NotNull
    b w0(int i10, @Nullable k<List<Download>> kVar, @Nullable k<Error> kVar2);

    @NotNull
    FetchConfiguration x();

    @NotNull
    b x0(int i10, @Nullable k<List<Download>> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b y(@NotNull List<? extends Request> list, boolean z10, @NotNull k<List<Pair<Request, Long>>> kVar, @NotNull k<List<Pair<Request, Error>>> kVar2);

    @NotNull
    b y0(int i10, @Nullable k<Download> kVar, @Nullable k<Error> kVar2);

    @NotNull
    b z();

    @NotNull
    b z0(@NotNull List<Integer> list, @Nullable k<List<Download>> kVar, @Nullable k<Error> kVar2);
}
