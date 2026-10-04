package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import e.D;
import e.T;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public UUID f120243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public Data f120244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public Set<String> f120245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public a f120246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f120247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public Executor f120248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public V2.a f120249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public p f120250h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public k f120251i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public e f120252j;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public List<String> f120253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public List<Uri> f120254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @T(28)
        public Network f120255c;

        public a() {
            List list = Collections.EMPTY_LIST;
            this.f120253a = list;
            this.f120254b = list;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkerParameters(@NonNull UUID id2, @NonNull Data inputData, @NonNull Collection<String> tags, @NonNull a runtimeExtras, @D(from = 0) int runAttemptCount, @NonNull Executor backgroundExecutor, @NonNull V2.a workTaskExecutor, @NonNull p workerFactory, @NonNull k progressUpdater, @NonNull e foregroundUpdater) {
        this.f120243a = id2;
        this.f120244b = inputData;
        this.f120245c = new HashSet(tags);
        this.f120246d = runtimeExtras;
        this.f120247e = runAttemptCount;
        this.f120248f = backgroundExecutor;
        this.f120249g = workTaskExecutor;
        this.f120250h = workerFactory;
        this.f120251i = progressUpdater;
        this.f120252j = foregroundUpdater;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Executor a() {
        return this.f120248f;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public e b() {
        return this.f120252j;
    }

    @NonNull
    public UUID c() {
        return this.f120243a;
    }

    @NonNull
    public Data d() {
        return this.f120244b;
    }

    @Nullable
    @T(28)
    public Network e() {
        return this.f120246d.f120255c;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public k f() {
        return this.f120251i;
    }

    @D(from = 0)
    public int g() {
        return this.f120247e;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public a h() {
        return this.f120246d;
    }

    @NonNull
    public Set<String> i() {
        return this.f120245c;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public V2.a j() {
        return this.f120249g;
    }

    @NonNull
    @T(24)
    public List<String> k() {
        return this.f120246d.f120253a;
    }

    @NonNull
    @T(24)
    public List<Uri> l() {
        return this.f120246d.f120254b;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public p m() {
        return this.f120250h;
    }
}
