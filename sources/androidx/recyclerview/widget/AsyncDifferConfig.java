package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.C2646i;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class AsyncDifferConfig<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Executor f116266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Executor f116267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final C2646i.f<T> f116268c;

    public static final class Builder<T> {
        private static Executor sDiffExecutor;
        private static final Object sExecutorLock = new Object();
        private Executor mBackgroundThreadExecutor;
        private final C2646i.f<T> mDiffCallback;

        @Nullable
        private Executor mMainThreadExecutor;

        public Builder(@NonNull C2646i.f<T> fVar) {
            this.mDiffCallback = fVar;
        }

        @NonNull
        public AsyncDifferConfig<T> build() {
            if (this.mBackgroundThreadExecutor == null) {
                synchronized (sExecutorLock) {
                    try {
                        if (sDiffExecutor == null) {
                            sDiffExecutor = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.mBackgroundThreadExecutor = sDiffExecutor;
            }
            return new AsyncDifferConfig<>(this.mMainThreadExecutor, this.mBackgroundThreadExecutor, this.mDiffCallback);
        }

        @NonNull
        public Builder<T> setBackgroundThreadExecutor(Executor executor) {
            this.mBackgroundThreadExecutor = executor;
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder<T> setMainThreadExecutor(Executor executor) {
            this.mMainThreadExecutor = executor;
            return this;
        }
    }

    public AsyncDifferConfig(@Nullable Executor executor, @NonNull Executor executor2, @NonNull C2646i.f<T> fVar) {
        this.f116266a = executor;
        this.f116267b = executor2;
        this.f116268c = fVar;
    }

    @NonNull
    public Executor a() {
        return this.f116267b;
    }

    @NonNull
    public C2646i.f<T> b() {
        return this.f116268c;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Executor c() {
        return this.f116266a;
    }
}
