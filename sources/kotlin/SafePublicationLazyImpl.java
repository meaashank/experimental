package kotlin;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import ed.InterfaceC4376a;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
final class SafePublicationLazyImpl<T> implements G<T>, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f217472d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> f217473e = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public volatile InterfaceC4376a<? extends T> f217474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public volatile Object f217475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Object f217476c;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public SafePublicationLazyImpl(@NotNull InterfaceC4376a<? extends T> initializer) {
        kotlin.jvm.internal.G.p(initializer, "initializer");
        this.f217474a = initializer;
        F0 f02 = F0.f217452a;
        this.f217475b = f02;
        this.f217476c = f02;
    }

    public static /* synthetic */ void d() {
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // kotlin.G
    public T getValue() {
        T t10 = (T) this.f217475b;
        F0 f02 = F0.f217452a;
        if (t10 != f02) {
            return t10;
        }
        InterfaceC4376a<? extends T> interfaceC4376a = this.f217474a;
        if (interfaceC4376a != null) {
            T tInvoke = interfaceC4376a.invoke();
            if (androidx.concurrent.futures.c.a(f217473e, this, f02, tInvoke)) {
                this.f217474a = null;
                return tInvoke;
            }
        }
        return (T) this.f217475b;
    }

    @Override // kotlin.G
    public boolean isInitialized() {
        return this.f217475b != F0.f217452a;
    }

    @NotNull
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
