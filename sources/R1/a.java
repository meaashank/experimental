package R1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<b<?>, Object> f67687a = new LinkedHashMap();

    /* JADX INFO: renamed from: R1.a$a, reason: collision with other inner class name */
    public static final class C0103a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C0103a f67688b = new C0103a();

        @Override // R1.a
        @Nullable
        public <T> T a(@NotNull b<T> key) {
            G.p(key, "key");
            return null;
        }
    }

    public interface b<T> {
    }

    @Nullable
    public abstract <T> T a(@NotNull b<T> bVar);

    @NotNull
    public final Map<b<?>, Object> b() {
        return this.f67687a;
    }
}
