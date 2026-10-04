package d;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: d.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4282a<I, O> {

    /* JADX INFO: renamed from: d.a$a, reason: collision with other inner class name */
    public static final class C0707a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f194516a;

        public C0707a(T t10) {
            this.f194516a = t10;
        }

        public final T a() {
            return this.f194516a;
        }
    }

    @NotNull
    public abstract Intent a(@NotNull Context context, I i10);

    @Nullable
    public C0707a<O> b(@NotNull Context context, I i10) {
        G.p(context, "context");
        return null;
    }

    public abstract O c(int i10, @Nullable Intent intent);
}
